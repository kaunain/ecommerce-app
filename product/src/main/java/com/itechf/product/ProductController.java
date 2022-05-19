package com.itechf.product;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductItemRepository productItemRepository;

    @GetMapping("/product/{id}")
    public ProductItem getProductItem(@PathVariable Integer id) {
        Optional<ProductItem> pi = productItemRepository.findById(id);
        return pi.get();
    }

    @GetMapping("/all")
    public List<ProductItem> getProductItems() {
        return productItemRepository.findAll();
    }

    @GetMapping("/init")
    public List<ProductItem> saveInit() {
        List<ProductItem> productList = List.of(
            new ProductItem(1, "Book", 1, "Some Book"), 
            new ProductItem(2, "Table", 2, "Simple Table"),
            new ProductItem(3, "Chair", 3, "Sitting Chair")
        );
        return productItemRepository.saveAll(productList);
    }

    @GetMapping("/")
    public String home() {
        return "ProductItem Service up and Running";
    }
}
