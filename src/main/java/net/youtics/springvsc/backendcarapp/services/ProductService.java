package net.youtics.springvsc.backendcarapp.services;

import java.util.List;

import net.youtics.springvsc.backendcarapp.models.entities.Product;

public interface ProductService {
    List<Product> findAll();
    
}
