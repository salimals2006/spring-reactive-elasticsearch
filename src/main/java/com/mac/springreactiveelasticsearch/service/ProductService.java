package com.mac.springreactiveelasticsearch.service;

import com.mac.springreactiveelasticsearch.entity.Product;
import com.mac.springreactiveelasticsearch.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

  @Autowired
  private ProductRepo productRepo;

  public Iterable<Product> getProducts(){
    return productRepo.findAll();
  }

  public Product insertProduct(Product product){
    return productRepo.save(product);
  }

  public Product updateProduct(Product product, int id){
    Product p1 =  productRepo.findById(id).get();
    p1.setPrice(product.getPrice());
    return p1;
  }

  public void deleteProduct(int id){
    productRepo.deleteById(id);
  }
}
