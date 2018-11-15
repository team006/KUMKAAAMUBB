package com.kamaab.softwarepro.Service;

import com.kamaab.softwarepro.Repository.ProductRepository;
import com.kamaab.softwarepro.Model.Product;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository​​​​​​;

    public List<Product> getAllUser() {
        return productRepository​​​​​​.findAll();
    }

    public Optional<Product> getUserById(long id) {
        return productRepository​​​​​​.findById(id);
    }

    public Product save(Product product) {
        return productRepository​​​​​​.save(product);
    }

    public long delete(long id) {
        productRepository​​​​​​.deleteById(id);
        return id;
    }
}
