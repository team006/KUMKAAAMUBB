package com.kamaab.softwarepro.Service.Shop;

import com.kamaab.softwarepro.Model.Shop.Shop;
import com.kamaab.softwarepro.Repository.Shop.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImp implements ShopService {

    @Autowired
    private ShopRepository shopRepository;

    public List<Shop> findAllShop(){
        List shop = shopRepository.findAll();
        return shop;
    }
}


