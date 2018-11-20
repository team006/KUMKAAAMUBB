package com.kamaab.softwarepro.Controller;

import com.kamaab.softwarepro.Service.ProductService;
import com.kamaab.softwarepro.Model.Product;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

@Controller
class ProductController {

    @Autowired
    private ProductService productService;


    @PostMapping("/product")
    public ResponseEntity<Product> createProduct(@Valid @RequestBody Product product) {
        return new ResponseEntity<>(productService.save(product), HttpStatus.CREATED);
    }

    @GetMapping("/viewProductDetail/{id}")
    public String getProductDetailById(@PathVariable("id") int id, ModelMap model) {
        Product productId = productService.getProductDetailById(id);
        model.addAttribute("productDetail", productId);
        return "viewProductDetail";
    }

    @RequestMapping("/productdetail")
    public long getProductDetail(@RequestParam int productId) {
        productService.getProductDetailById(productId);
        return productId;
    }
    @GetMapping("/")
    public String getAllProduct(ModelMap model){
        List<Product> allProducts = productService.getAllProduct();
        model.addAttribute("allProducts",allProducts);
        return "index";
    }








}