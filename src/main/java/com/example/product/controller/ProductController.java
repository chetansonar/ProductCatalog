package com.example.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.model.Categories;
import com.example.product.model.ProductCatalog;
import com.example.product.repository.CategoriesRepo;
import com.example.product.repository.ProductCatalogRepo;
import com.example.product.service.ProductCatalogService;
import com.example.product.service.impl.ProductCatalogServiceImpl;

@RestController
@RequestMapping("v1/")
public class ProductController {
	
	@Autowired
	ProductCatalogServiceImpl productCatalogServiceImpl;
	
	@PostMapping("product")
	public ResponseEntity<?> addProducts(@RequestBody ProductCatalog productCatalog){
		ResponseEntity<Object> Response = this.productCatalogServiceImpl.saveProduct(productCatalog);
		return Response;
	}
	
	@PostMapping("product/category")
	public ResponseEntity<?> addCatergory(@RequestBody Categories category){
       ResponseEntity<Object> Response = this.productCatalogServiceImpl.saveCategories(category);
	   return Response;
	}

	
	@GetMapping("product/category/{id}")
	public ResponseEntity<?> getCatergoryAndAttribute(@PathVariable(name = "id") Long id){
		ResponseEntity<?> Response = this.productCatalogServiceImpl.getCategories(id);
		return Response;
	}
	
	

}
