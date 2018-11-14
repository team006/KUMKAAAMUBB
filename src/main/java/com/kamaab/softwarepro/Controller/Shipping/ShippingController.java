package com.kamaab.softwarepro.Controller.Shipping;

import com.kamaab.softwarepro.Model.Shipping.Shipping;
import com.kamaab.softwarepro.Service.Shipping.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ShippingController {

    @Autowired
    private ShippingService shippingService;

    @GetMapping("/shippings")
    public ResponseEntity<List<Shipping>> findAllShipping(){
        List<Shipping> shippings = shippingService.findAllShipping();
        return new ResponseEntity<List<Shipping>>(shippings, HttpStatus.OK);
    }
}
