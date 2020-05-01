package com.example.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/product/brand/{brand}")
	public ResponseEntity<List<Product>> findGroupByBrand(
			@PathVariable String brand) {
		List<Product> list = productService.findGroupByBrand(brand);
		return new ResponseEntity<List<Product>>(list, HttpStatus.OK);
	}

	@GetMapping("/product/color/{color}")
	public ResponseEntity<List<Product>> findGroupByColor(
			@PathVariable String color) {
		List<Product> list = productService.findGroupByColor(color);
		return new ResponseEntity<List<Product>>(list, HttpStatus.OK);
	}

	@GetMapping("/product/size/{size}")
	public ResponseEntity<List<Product>> findGroupBySize(
			@PathVariable String size) {
		List<Product> list = productService.findGroupBysize(size);
		return new ResponseEntity<List<Product>>(list, HttpStatus.OK);
	}

	@GetMapping("/product/price/{price}")
	public ResponseEntity<List<Product>> findGroupByPrice(
			@PathVariable double price) {
		List<Product> list = productService.findGroupByPrice(price);
		return new ResponseEntity<List<Product>>(list, HttpStatus.OK);
	}

	@GetMapping("/product/sku/{sku}")
	public ResponseEntity<List<Product>> findGroupBySKU(@PathVariable String sku) {
		List<Product> list = productService.findGroupBySKU(sku);
		return new ResponseEntity<List<Product>>(list, HttpStatus.OK);
	}

	@GetMapping("/product/count/{supplierId}")
	public long getAvailableProductSellerCount(@PathVariable String supplierId) {
		return productService.availableProductSellerCount(supplierId);
	}
}
