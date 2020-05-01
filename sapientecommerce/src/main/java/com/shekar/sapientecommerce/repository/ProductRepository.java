package com.shekar.sapientecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shekar.sapientecommerce.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

	@Query("SELECT p from Product p where UPPER(brand) = UPPER(:brand)")
	List<Product> findGroupByBrand(@Param("brand") String brand);

	@Query("SELECT p from Product p where  price <= :price")
	List<Product> findGroupByPrice(@Param("price") double price);

	@Query("SELECT p from Product p where UPPER(color) = UPPER(:color) ")
	List<Product> findGroupByColor(@Param("color") String color);

	@Query("SELECT p from Product p where UPPER(size) = UPPER(:size) ")
	List<Product> findGroupBySize(@Param("size") String size);

	@Query("SELECT p from Product p where UPPER(sku) = UPPER(:sku)")
	List<Product> findGroupBySKU(@Param("sku") String sku);

	// @Query("SELECT count(*), S.NAME FROM PRODUCT P, SUPPLIER S where
	// P.SUPPLIER_ID = S.ID GROUP BY S.NAME ")
	long countBySupplier(String supplier);
}
