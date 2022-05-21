package com.itechf.customer;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class CustomerBean {

	private Integer id;
	private String name;
	private Integer qty;
	private String desc;
}
