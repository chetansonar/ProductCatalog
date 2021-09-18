package com.example.product.model;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Attributes {
	
	private long categoryId;

	private String categoryName;

	private List<ProductAttributes> productAttributes;
}
