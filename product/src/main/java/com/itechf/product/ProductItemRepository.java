package com.itechf.product;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductItemRepository extends MongoRepository<ProductItem, Integer> {
    @Query("{id:'?0'}")
    ProductItem findItemById(Integer id);
    
}
