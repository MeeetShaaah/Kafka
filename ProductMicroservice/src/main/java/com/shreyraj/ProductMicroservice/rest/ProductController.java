package com.shreyraj.ProductMicroservice.rest;

import org.springframework.boot.actuate.autoconfigure.observation.ObservationProperties.Http;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {
    
    @PostMapping
    public ResponseEntity<String> createProduct(@RequestBody CreateProductRestModel product){
        return new ResponseEntity<String>("Product created", HttpStatus.CREATED);
    }
}
