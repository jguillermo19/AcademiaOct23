package com.sim2211.v0;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Item2{
	
        private String name;
        private String category;
        private double price;
        
        public Item2(String name, String category, double price){
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
		
		@Override
		public String toString() {
			return "Item2 [name=" + name + ", category=" + category + ", price=" + price + "]";
		}
		public static void main(String[] args) {
			
			List<Item2> items = Arrays.asList(
					new Item2("Pen", "Stationery", 3.0), 
					new Item2("Pencil", "Stationery", 2.0),
					new Item2("Eraser", "Stationery", 1.0), //AVERAGE: 2.0
					new Item2("Milk", "Food", 2.0),
					new Item2("Eggs", "Food", 3.0)); //AVERAGE: 2.5
			
			//   Item -> Double            //Item::getPrice;
			ToDoubleFunction<Item2> priceF = i -> i.getPrice();  //1
		    
						
			Map<String, List<Item2>> mapa = items.stream()
					.collect(Collectors.groupingBy(i -> i.getCategory())); //2
			
			//System.out.println(mapa);
		
			//mapa.forEach((a, b) -> System.out.println("Categoria: " + a +" Productos: " +b ));
			
			mapa.forEach((a, b)->{
	            double av = b.stream().collect(Collectors.averagingDouble(priceF)); //3
	            System.out.println(a+" : "+av); //Categoria : Promedio Costo Productos
	        });
		}
       
}

//What will the following code print?

//
