package com.example.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.product.model.ProductCatalog;

@Repository
public interface ProductCatalogRepo extends JpaRepository<ProductCatalog, Long> {

}
