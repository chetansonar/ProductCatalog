package com.example.product.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="product")
@NoArgsConstructor
public class ProductCatalog {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ProductID;
	
	@Column
	@Getter
	@Setter
	private String productName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ProductID")
	@Getter
	@Setter
	private List<Categories> categories;
}
