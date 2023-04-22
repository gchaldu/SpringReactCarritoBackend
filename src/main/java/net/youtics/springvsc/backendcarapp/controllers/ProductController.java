package net.youtics.springvsc.backendcarapp.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.youtics.springvsc.backendcarapp.models.entities.Product;
import net.youtics.springvsc.backendcarapp.services.ProductService;

@RestController
public class ProductController {
    
    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> list(){

        return service.findAll();
    }

}
