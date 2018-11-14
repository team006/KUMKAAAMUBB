package com.kamaab.softwarepro.Service.Shipping;

import com.kamaab.softwarepro.Model.Shipping.Shipping;
import com.kamaab.softwarepro.Repository.Shipping.ShippingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShippingImp implements ShippingService {

    @Autowired
    private ShippingRepository shippingRepository;

    public List<Shipping> findAllShipping() {
        return shippingRepository.findAll();
    }
}
