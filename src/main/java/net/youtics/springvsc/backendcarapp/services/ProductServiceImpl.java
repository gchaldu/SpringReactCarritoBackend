package net.youtics.springvsc.backendcarapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ch.qos.logback.core.read.ListAppender;
import net.youtics.springvsc.backendcarapp.models.entities.Product;
import net.youtics.springvsc.backendcarapp.reporitories.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
       
        return (List<Product>) repository.findAll();
    }
    



}
