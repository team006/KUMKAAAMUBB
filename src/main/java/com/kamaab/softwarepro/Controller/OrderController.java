package com.kamaab.softwarepro.Controller;

import co.omise.ClientException;
import co.omise.models.OmiseException;
import com.kamaab.softwarepro.Model.Order;
import com.kamaab.softwarepro.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getOrderList() {
        return new ResponseEntity<List<Order>>(orderService.getOrderList(), HttpStatus.OK);
    }

    @GetMapping("/order/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable long id) {
        return new ResponseEntity<Order>(orderService.getOrderById(id).get(), HttpStatus.OK);
    }

    @PostMapping("/order")
    public ResponseEntity<Order> createOrder(@Valid @RequestBody Order order) {
        try {
            orderService.charge(order.getTotalPrice(), order.getOmiseToken());
        } catch (OmiseException o) {
            return new ResponseEntity<Order>(orderService.save(order), HttpStatus.FORBIDDEN);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<Order>(orderService.save(order), HttpStatus.CREATED);
    }

    @PutMapping("/order")
    public ResponseEntity<Order> updateOrder(@Valid @RequestBody Order order) {
        return new ResponseEntity<Order>(orderService.save(order), HttpStatus.OK);
    }

    @DeleteMapping("/order/{id}")
    public ResponseEntity<Long> deleteOrder(@PathVariable long id) {
        return new ResponseEntity<Long>(orderService.delete(id), HttpStatus.OK);
    }

    @PostMapping("/creditcard") // get token
    public LinkedHashMap creditcard(@RequestBody LinkedHashMap payment)
            throws ClientException, IOException, OmiseException {
        LinkedHashMap token = orderService.getToken(payment);
        return token;
    }
}