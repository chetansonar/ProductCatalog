package com.example.product.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
public class Categories {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long categoryId;
	
	@Column
	@Getter
	@Setter
	private String categoryName;
	

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="categoryId")
	@Getter
	@Setter
	private List<ProductAttributes> productAttributes;
	
}
