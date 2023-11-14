package inmutable;

import java.util.HashMap;
import java.util.Iterator;

public final class FinalClassExample {
	
	{
		System.out.println("Se crea un Objeto");
	}

	// fields of the FinalClassExample class
	static private final int id;
	
	static private final String name;
	
	static private final HashMap<String,String> testMap;
	
	static {
		id = 8;
		System.out.println("1");
	}
	
	static {
		name = "Paco";
		System.out.println("2");

	}
	
	static {
		testMap = null;
		System.out.println("3");

	}
	
	public static void main(String[] args) {
		System.out.println(FinalClassExample.name);
		new FinalClassExample();
		new FinalClassExample();
		new FinalClassExample();
		new FinalClassExample();
		new FinalClassExample();

	}
	

}