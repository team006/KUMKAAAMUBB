package com.kamaab.softwarepro.Service;

import java.util.List;

import com.kamaab.softwarepro.Model.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    List<Product> findAllProduct();
}