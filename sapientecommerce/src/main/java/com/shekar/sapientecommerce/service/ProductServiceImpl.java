package com.shekar.sapientecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shekar.sapientecommerce.model.Product;
import com.shekar.sapientecommerce.repository.ProductRepository;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> findGroupByBrand(String brand) {
		return productRepository.findGroupByBrand(brand);
	}

	@Override
	public List<Product> findGroupByColor(String color) {
		return productRepository.findGroupByColor(color);
	}

	@Override
	public List<Product> findGroupBysize(String size) {
		return productRepository.findGroupBySize(size);
	}

	@Override
	public List<Product> findGroupByPrice(double price) {
		return productRepository.findGroupByPrice(price);
	}

	@Override
	public List<Product> findGroupBySKU(String sku) {
		return productRepository.findGroupBySKU(sku);
	}

	@Override
	public long availableProductSellerCount(String supplierId) {
		return productRepository.countBySupplier(supplierId);
	}

}
