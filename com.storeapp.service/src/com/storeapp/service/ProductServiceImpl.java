package com.storeapp.service;

import java.util.List;

import com.storeapp.product.DataUtil;
import com.storeapp.product.Product;

public class ProductServiceImpl implements ProductService {

	@Override
	public float addProduct(String prodName, int qty) {
		String message = "";
		int availableQty = 0;
		float amount = 0;
		Product product = DataUtil.getProduct(prodName);
		if (product != null) {
			int totalQty = product.getQty();
			availableQty = totalQty - qty;
			if (qty > totalQty) {
				message = "Ordered qty of " + qty + " "+ prodName + " is not available";
				System.out.println(message);
			}
			if (availableQty >= 0) {
				product.setTotalPrice(qty * product.getPrice());
				product.setQty(availableQty);
				Product productRet = DataUtil.addProduct(product);
				message = productRet.getProductName() + " added to the product cart. Now " + productRet.getProductName()
						+ " available is : " + availableQty + ". ";
				System.out.println(message);
				amount = product.getTotalPrice();
			}
		}
		return amount;	
}

	@Override
	public List<Product> viewProducts() {
		return DataUtil.getAllProducts();
	}

	@Override
	public boolean validProduct(String prodName) {
		return DataUtil.validProduct(prodName);
	}

}
