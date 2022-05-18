package com.itechf.product;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    private List<ProductItem> stuList = List.of(
        new ProductItem(1, "Book", 1, "Some Book"), 
        new ProductItem(2, "Table", 2, "Simple Table"),
        new ProductItem(3, "Chair", 3, "Sitting Chair")
    );

    public ProductItem getProductItem(Integer id) {
        return stuList.stream().filter(s -> s.getId() == id).findAny().orElse(null);
    }
    public List<ProductItem> getAllProductItem() {
        return stuList;
    }
}
