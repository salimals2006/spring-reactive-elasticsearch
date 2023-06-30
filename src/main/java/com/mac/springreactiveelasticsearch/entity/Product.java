package com.mac.springreactiveelasticsearch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.elasticsearch.annotations.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(indexName = "products")
public class Product {

  private int id;
  private String name;
  private String description;
  private int quantity;
  private double price;
}
