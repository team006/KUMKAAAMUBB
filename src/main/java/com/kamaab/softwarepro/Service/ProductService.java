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





    public Product save(Product product) {
        return productRepository​​​​​​.save(product);
    }

    public long deleteByProductId(long productId) {
        productRepository​​​​​​.deleteById(productId);
        return productId;
    }


    public List<Product> getProductByProductId(long productId){
        return productRepository​​​​​​.findProductByProductId(productId);

    }





}
