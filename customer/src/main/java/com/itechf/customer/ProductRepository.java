package com.itechf.customer;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerBean, Integer> {
    @Query("{id:'?0'}")
    CustomerBean findItemById(Integer id);
    
}
