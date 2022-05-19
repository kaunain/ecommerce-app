package com.itechf.product;

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
public class ProductController {

    @Autowired
    private ProductItemRepository productItemRepository;

    @GetMapping("/product/{id}")
    public ProductItem getProductItem(@PathVariable Integer id) {
        Optional<ProductItem> pi = productItemRepository.findById(id);
        return pi.get();
    }

    @DeleteMapping("/product/{id}")
    public Boolean deleteProductItem(@PathVariable Integer id) {
        productItemRepository.deleteById(id);
        return true;
    }

    @GetMapping("/all")
    public List<ProductItem> getProductItems() {
        return productItemRepository.findAll();
    }

    @PostMapping("/save")
    public ProductItem saveProductItems(@RequestBody ProductItem productItem) {
        return productItemRepository.save(productItem);
    }

    @PostMapping("/update")
    public ProductItem updateProductItems(@RequestBody ProductItem productItem) {
        return productItemRepository.save(productItem);
    }

    @PostMapping("/init")
    public Boolean saveInit(@RequestBody String key) {
        Boolean flag = false;
        List<ProductItem> productList = List.of(
            new ProductItem(1, "Book", 1, "Some Book"), 
            new ProductItem(2, "Table", 2, "Simple Table"),
            new ProductItem(3, "Chair", 3, "Sitting Chair")
            );
        if("123123".equals(key)){
            productItemRepository.saveAll(productList);
            flag = true;
        }
        return flag;
    }

    @GetMapping("/")
    public String home() {
        return "ProductItem Service up and Running";
    }
}
