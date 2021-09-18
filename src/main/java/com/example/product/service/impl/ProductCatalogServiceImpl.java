package com.example.product.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.product.Exception.CategoryNotFound;
import com.example.product.model.Categories;
import com.example.product.model.ProductCatalog;
import com.example.product.model.ResponseBody;
import com.example.product.repository.CategoriesRepo;
import com.example.product.repository.ProductCatalogRepo;
import com.example.product.service.ProductCatalogService;

@Service
public class ProductCatalogServiceImpl {

	@Autowired
	ProductCatalogRepo productCatalogRepo;

	@Autowired
	CategoriesRepo categoriesRepo;

	final ResponseBody RB = new ResponseBody();

	public ResponseEntity<Object> saveCategories(Categories category) {
		try {
			this.categoriesRepo.save(category);
			RB.setStatus(true);
		} catch (Exception ex) {
			RB.setStatus(false);
			RB.setError_msg(ex.getMessage());
		}

		return new ResponseEntity<Object>(RB, HttpStatus.ACCEPTED);
	}

	public ResponseEntity<?> getCategories(long category_id) {

		Categories categories = this.categoriesRepo.findById(category_id)
				.orElseThrow(()->new CategoryNotFound("Record not Present"));

		return new ResponseEntity<Object>(categories, HttpStatus.OK);
	}
	
	
	public ResponseEntity<Object> saveProduct(ProductCatalog productCatalog) {
		try {
			this.productCatalogRepo.save(productCatalog);
			RB.setStatus(true);
		} catch (Exception ex) {
			RB.setStatus(false);
			RB.setError_msg(ex.getMessage());
		}

		return new ResponseEntity<Object>(RB, HttpStatus.ACCEPTED);
	}

}
