package com.itechf.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductItem {

	private Integer id;
	private String name;
	private Integer qty;
	private String desc;
}
