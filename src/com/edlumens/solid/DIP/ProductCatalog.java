package com.edlumens.solid.DIP;

import java.util.List;

public class ProductCatalog {
	public void displayAllProdutct() {
		ProductRepository repository = ProductFactory.create();
		List<String> allProducts = repository.getAllProductNames();
		// Display all products
	}
}


/*
   This high level module depends on low level module 
*/