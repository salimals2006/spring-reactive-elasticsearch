package com.mac.springreactiveelasticsearch.repo;

import com.mac.springreactiveelasticsearch.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepo extends ElasticsearchRepository<Product, Integer> {
}
