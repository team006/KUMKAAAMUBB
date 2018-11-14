package com.kamaab.softwarepro.Controller.Shop;

import com.kamaab.softwarepro.Model.Shop.Shop;
import com.kamaab.softwarepro.Service.Shop.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ShopController {

    @Autowired
    private ShopService shopService;

    @GetMapping("/shops")
    public ResponseEntity<List<Shop>> findAllShop(){
        List<Shop> shops = shopService.findAllShop();
        return new ResponseEntity<List<Shop>>(HttpStatus.OK);
    }

}
