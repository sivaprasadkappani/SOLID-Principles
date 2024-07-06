package com.edlumens.solid.DIP.noDIP;

import java.util.List;

public class ProductCatalog {
	public void displayAllProdutct() {
		SQLProductRepository sqlRepository = new SQLProductRepository();
		List<String> allProducts = sqlRepository.getAllProductNames();
		// Display all products
	}
}


/*
   This high level module depends on low level module 
*/