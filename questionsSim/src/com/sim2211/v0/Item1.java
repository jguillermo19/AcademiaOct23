package com.sim2211.v0;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Item1{
	
        private String name;
        private String category;
        private double price;
        
        public Item1(String name, String category, double price){
            this.name = name;
            this.category = category;
            this.price = price;
        }
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		public static void main(String[] args) {
			
			List<Item1> items = Arrays.asList(
					new Item1("Pen", "Stationery", 3.0), 
					new Item1("Pencil", "Stationery", 2.0),
					new Item1("Eraser", "Stationery", 1.0), 
					new Item1("Milk", "Food", 2.0),
					new Item1("Eggs", "Food", 3.0));
			
			//   Item -> Double            //Item::getPrice;
			ToDoubleFunction<Item1> priceF = i -> i.getPrice();  //1
		    
			
			System.out.println(
			
			items.stream()
			                              //Item::getCategory
	        .collect(Collectors.groupingBy(i -> i.getCategory())) //2
			
	        .getClass().getName()
	        
			);
			
//	        .forEach((a, b)->{
//	            double av = b.stream().collect(Collectors.averagingDouble(priceF)); //3
//	            System.out.println(a+" : "+av);
//	        });
		}
       
}

//What will the following code print?

//
