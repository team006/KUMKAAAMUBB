package com.kamaab.softwarepro.Controller;

import com.kamaab.softwarepro.Service.ProductService;
import com.kamaab.softwarepro.Model.Product;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

@RestController
class ProductController {

    @Autowired
    private ProductService productService;


    @PostMapping("/product")
    public ResponseEntity<Product> createProduct(@Valid @RequestBody Product product) {
        return new ResponseEntity<>(productService.save(product), HttpStatus.CREATED);
    }

    @PutMapping("/product")
    public ResponseEntity<Product> updateProduct(@Valid @RequestBody Product product) {
        return new ResponseEntity<>(productService.save(product), HttpStatus.OK);
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<Product> getProductByProductId(@PathVariable long productId){
        return new ResponseEntity(productService.getProductByProductId(productId),HttpStatus.OK);

    }
    @GetMapping("/product")
    public String getAllProduct(ModelMap model){
        List<Product> allProducts = productService.getAllProduct();
        model.addAttribute("allProducts",allProducts);
        return "product";
    }






}