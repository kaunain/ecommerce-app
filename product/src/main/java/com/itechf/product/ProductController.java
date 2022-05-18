package com.itechf.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository dao;

    @RequestMapping("/product/{id}")
    public ProductItem getProductItem(@PathVariable Integer id) {
        ProductItem pi = dao.getProductItem(id);
        return pi;
    }

    @RequestMapping("/all")
    public List<ProductItem> getProductItems() {
        return dao.getAllProductItem();
    }

    @RequestMapping("/")
    public String home() {
        return "ProductItem Service up and Running";
    }
}
