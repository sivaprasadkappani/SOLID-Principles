package com.edlumens.solid.DIP;

import java.util.Arrays;
import java.util.List;

public class SQLProductRepository 
	implements ProductRepository{
	
   @Override
   public List<String> getAllProductNames() {
	   return Arrays.asList( "Laptop", "Mobile Phone" );
   }
}
