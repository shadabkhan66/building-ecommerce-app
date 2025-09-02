package com.ecommerce.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.dto.ProductDto;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@GetMapping
	public ResponseEntity<List<ProductDto>> getAllProducts() {
		// TODO: call service
		return ResponseEntity.ok(List.of());
	}

	@GetMapping("/{id}")
	public ResponseEntity<ProductDto> getProduct(@PathVariable Long id) {
		// TODO: call service
		return ResponseEntity.ok(new ProductDto());
	}

	@PostMapping
	public ResponseEntity<ProductDto> addProduct(@RequestBody ProductDto dto) {
		// TODO: call service
		return ResponseEntity.ok(dto);
	}

	@PutMapping("/{id}")
	public ResponseEntity<ProductDto> updateProduct(@PathVariable Long id, @RequestBody ProductDto dto) {
		// TODO: call service
		return ResponseEntity.ok(dto);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
		// TODO: call service
		return ResponseEntity.ok("Product deleted successfully");
	}
}
