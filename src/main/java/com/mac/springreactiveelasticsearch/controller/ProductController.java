package com.mac.springreactiveelasticsearch.controller;

import com.mac.springreactiveelasticsearch.entity.Product;
import com.mac.springreactiveelasticsearch.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2")
public class ProductController {

  @Autowired
  private ProductService productService;

  @GetMapping("/findAll")
  public Iterable<Product> findAll() {
    return productService.getProducts();
  }

  @PostMapping("/insert")
  public Product insertProduct(@RequestBody Product product){
    return productService.insertProduct(product);
  }

  @PutMapping("/update/{id}")
  public Product updateProduct(@PathVariable int id, @RequestBody Product product){
    return productService.updateProduct(product, id);
  }

  @DeleteMapping("/delete/{id}")
  public void deleteProduct(@PathVariable int id){
    productService.deleteProduct(id);
  }


}
