package com.kamaab.softwarepro.Service.Implement;

import com.kamaab.softwarepro.Model.Shop;
import com.kamaab.softwarepro.Repository.ShopRepository;
import com.kamaab.softwarepro.Service.ShopService;
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


