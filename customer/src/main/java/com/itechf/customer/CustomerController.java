package com.itechf.customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customer/{id}")
    public CustomerBean getCustomerBean(@PathVariable Integer id) {
        Optional<CustomerBean> pi = customerRepository.findById(id);
        return pi.get();
    }

    @DeleteMapping("/customer/{id}")
    public Boolean deleteCustomerBean(@PathVariable Integer id) {
        customerRepository.deleteById(id);
        return true;
    }

    @GetMapping("/all")
    public List<CustomerBean> getCustomerBeans() {
        return (List<CustomerBean>) customerRepository.findAll();
    }

    @PostMapping("/save")
    public CustomerBean saveCustomerBeans(@RequestBody CustomerBean CustomerBean) {
        return customerRepository.save(CustomerBean);
    }

    @PostMapping("/update")
    public CustomerBean updateCustomerBeans(@RequestBody CustomerBean CustomerBean) {
        return customerRepository.save(CustomerBean);
    }

    @PostMapping("/init")
    public Boolean saveInit(@RequestBody String key) {
        Boolean flag = false;
        List<CustomerBean> CustomerList = List.of(
            new CustomerBean(1, "Book", 1, "Some Book"), 
            new CustomerBean(2, "Table", 2, "Simple Table"),
            new CustomerBean(3, "Chair", 3, "Sitting Chair")
            );
        if("123123".equals(key)){
            customerRepository.saveAll(CustomerList);
            flag = true;
        }
        return flag;
    }

    @GetMapping("/")
    public String home() {
        return "CustomerBean Service up and Running";
    }
}
