package com.kamaab.softwarepro.Controller.Product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @GetMapping("/home")
    public String Test(){
        return "Home";
    }
}
