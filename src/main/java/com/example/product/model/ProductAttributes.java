package com.example.product.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class ProductAttributes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long attributeId;
	
	@Column
	@Getter
	@Setter
	private String attributeName;
	
	@Column
	@Getter
	@Setter
	private String attributevalue;
	

}
