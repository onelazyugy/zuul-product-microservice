package com.vietle.zuulproductservice.controller;

import com.vietle.zuulproductservice.domain.Product;
import com.vietle.zuulproductservice.domain.ProductRequest;
import com.vietle.zuulproductservice.domain.ProductResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    @GetMapping("/product")
    public ResponseEntity<ProductResponse> product() {
        Product product = Product.builder().category("clothing").color("pink").id(1).name("jacket").build();
        ProductResponse response = ProductResponse.builder().message("success").success(true).product(product).build();
        ResponseEntity<ProductResponse> responseEntity = new ResponseEntity<>(response, HttpStatus.OK);
        return responseEntity;
    }

    @PostMapping("/save-product")
    public ResponseEntity<ProductResponse> saveProduct(@RequestBody ProductRequest productRequest) {
//        Product product = Product.builder().category("clothing").color("pink").id(1).name("jacket").build();
        ProductResponse response = ProductResponse.builder().message("success").success(true).product(productRequest.getProduct()).build();
        ResponseEntity<ProductResponse> responseEntity = new ResponseEntity<>(response, HttpStatus.OK);
        return responseEntity;
    }
}
