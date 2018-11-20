package com.kamaab.softwarepro.Service;

import co.omise.Client;
import co.omise.ClientException;
import co.omise.models.Card;
import co.omise.models.Charge;
import co.omise.models.OmiseException;
import co.omise.models.Token;
import com.kamaab.softwarepro.Model.Order;
import com.kamaab.softwarepro.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

@Service
public class OrderService {

    private Client client;

    @Autowired
    private OrderRepository orderRepository;

    @Transactional
    public List<Order> getOrderList(){
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(long id){
        return orderRepository.findById(id);
    }

    public Order save(Order order){
        return orderRepository.save(order);
    }

    public long delete(long id) {
        orderRepository.deleteById(id);
        return id;
    }

}

