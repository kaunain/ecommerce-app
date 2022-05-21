package com.itechf.customer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerBean, Integer> {
    CustomerBean findItemById(Integer id);
    
}
