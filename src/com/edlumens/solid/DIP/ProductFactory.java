package com.edlumens.solid.DIP;

public class ProductFactory {
   public static ProductRepository create() {
	   return new SQLProductRepository()
   }
}
