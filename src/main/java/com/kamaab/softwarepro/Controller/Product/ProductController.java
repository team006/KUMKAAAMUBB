package com.kamaab.softwarepro.Controller.Product;

import com.kamaab.softwarepro.Service.Product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String Test(){
        return "Home";
    }
}
