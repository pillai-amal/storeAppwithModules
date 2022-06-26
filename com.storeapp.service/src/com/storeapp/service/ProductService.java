package com.storeapp.service;

import java.util.List;

import com.storeapp.product.Product;

public interface ProductService {
	
    public float addProduct(String prodName, int qty);
    public List<Product> viewProducts();
    public boolean validProduct(String prodName);

	
}
