package com.example.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.product.model.Categories;

@Repository
public interface CategoriesRepo extends JpaRepository<Categories, Long>{

	@Modifying
	@Query("update Categories u set u.productid = ? where u.categoryid = :")
	void deactivateUsersNotLoggedInSince(@Param(value = "categoryId") Long category_id);
	
}
