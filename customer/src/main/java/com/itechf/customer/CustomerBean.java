package com.itechf.customer;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CustomerBean {

	@Id
	private Integer id;
	private String name;
	private Integer qty;
	private String desc;
}
