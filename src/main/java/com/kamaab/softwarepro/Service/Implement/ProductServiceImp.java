package com.kamaab.softwarepro.Service.Implement;

import com.kamaab.softwarepro.Model.Product;
import com.kamaab.softwarepro.Repository.ProductRepository;
import com.kamaab.softwarepro.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }
}