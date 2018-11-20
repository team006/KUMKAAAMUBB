package com.kamaab.softwarepro.Controller;

import co.omise.Client;
import co.omise.ClientException;
import co.omise.models.Charge;
import co.omise.models.OmiseException;
import com.kamaab.softwarepro.Model.Order;
import com.kamaab.softwarepro.Model.Product;
import com.kamaab.softwarepro.Service.OrderService;
import com.kamaab.softwarepro.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private ProductService productService;

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getOrderList() {
        return new ResponseEntity<List<Order>>(orderService.getOrderList(), HttpStatus.OK);
    }

    @GetMapping("/order/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable long id) {
        return new ResponseEntity<Order>(orderService.getOrderById(id).get(), HttpStatus.OK);
    }


    @PutMapping("/order")
    public ResponseEntity<Order> updateOrder(@Valid @RequestBody Order order) {
        return new ResponseEntity<Order>(orderService.save(order), HttpStatus.OK);
    }

    @DeleteMapping("/order/{id}")
    public ResponseEntity<Long> deleteOrder(@PathVariable long id) {
        return new ResponseEntity<Long>(orderService.delete(id), HttpStatus.OK);
    }

    @PostMapping("/Address")
    public String omise(HttpServletRequest request,ModelMap model) throws ClientException, OmiseException {
        Client client = new Client("pkey_test_5dz2fa0y55w7hmhdavc", "skey_test_5dz23oazryw8jxrkqi8");
        String a = request.getParameter("description");
        long amount = (long)(Double.parseDouble(a) * 100);
        try {
            Charge charge = client.charges().create(new Charge.Create()
                    .amount(amount)
                    .currency("THB")
                    .card(request.getParameter("omiseToken")));
            System.out.println("created charge: " + charge.getId());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "AddAddress";
    }

}