package com.kamaab.softwarepro.Service;

import co.omise.Client;
import com.kamaab.softwarepro.Model.Order;
import com.kamaab.softwarepro.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getOrderList(){
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(long id){
        return orderRepository.findById(id);
    }


    public long delete(long id) {
        orderRepository.deleteById(id);
        return id;
    }

    public Order save(Order order){
        return  orderRepository.save(order);
    }


}

