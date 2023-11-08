package com.sim0811.v3;

public class Aguila extends Ave {
	
	//public -> protected -> *default -> private
	
	@Override
	long volar() {
		System.out.println("Ave volar");
		return 0;
	}

}
