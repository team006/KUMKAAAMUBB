package com.kamaab.softwarepro.Service.Product;

import com.kamaab.softwarepro.Model.Product.Product;
import com.kamaab.softwarepro.Repository.Product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }
}