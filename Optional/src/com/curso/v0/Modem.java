package com.curso.v0;

import java.util.Optional;

public class Modem {
    private Double price;

    public Modem(Double price) {
        this.price = price;
    }

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	//OO
	public static boolean priceIsInRange1(Modem modem) {
	    boolean isInRange = false;

	    if (modem != null && modem.getPrice() != null 
	      && (modem.getPrice() >= 10 
	        && modem.getPrice() <= 15)) {

	        isInRange = true;
	    }
	    return isInRange;
	}
	
	//FUNCTIONAL
	public static boolean priceIsInRange2(Modem modem2) {
	     return Optional.ofNullable(modem2)
	       .map(Modem::getPrice) //Convierte un MODEM a DOUBLE
	       //.map(mod -> mod.getPrice())
	       .filter(p -> p >= 10)
	       .filter(p -> p <= 15)
	       .isPresent();
	 }
}