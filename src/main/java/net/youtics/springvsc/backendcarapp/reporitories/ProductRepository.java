package net.youtics.springvsc.backendcarapp.reporitories;

import org.springframework.data.repository.CrudRepository;

import net.youtics.springvsc.backendcarapp.models.entities.Product;

public interface ProductRepository extends CrudRepository <Product, Long>{
  
}
