package com.edlumens.solid.DIP.noDIP;

import java.util.Arrays;
import java.util.List;

public class SQLProductRepository {
   public List<String> getAllProductNames() {
	   return Arrays.asList( "Laptop", "Mobile Phone" );
   }
}
