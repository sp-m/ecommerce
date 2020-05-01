package com.example.ecommerce.service;

import java.util.List;

import com.example.ecommerce.model.Product;

public interface ProductService {

	List<Product> findGroupByBrand(String brand);

	List<Product> findGroupByColor(String color);

	List<Product> findGroupBysize(String size);

	List<Product> findGroupByPrice(double price);

	List<Product> findGroupBySKU(String sku);

	long availableProductSellerCount(String supplierId);
}
