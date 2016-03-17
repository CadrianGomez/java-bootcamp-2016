package com.bootcamp.FinalProject.service;

import java.util.List;

import com.bootcamp.FinalProject.entity.Category;
import com.bootcamp.FinalProject.entity.Product;

public interface IProductService {

	public Product findById(int productId);

	public Product addProduct(Product product);

	public void deleteProduct(Product product);

	public List<Product> listAllProducts();

	public void updateProduct(Product product);

	public List<Product> findByCategory(Category category);

	public List<Product> findByName(String productName);
}
