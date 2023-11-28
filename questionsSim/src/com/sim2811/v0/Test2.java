package com.sim2811.v0;

//What will the following code print when compiled and run?
public class Test2 {
	static int a = 0;
	int b = 5;

	public void foo() {
		      //5
		while (b > 0) {
			b--; //0 
			a++; //5
		}
		
		
	}

	public static void main(String[] args) {
		Test2 p1 = new Test2();
		p1.foo();
		Test2 p2 = new Test2();
		p2.foo();

		//System.out.println(p1.a + " " + p1.b);
		System.out.println(p1.a + " " + p2.a); //a=10 PARA LA CLASE
		System.out.println(p1.b + " " + p2.b); //b=0 PARA CADA OBJETO
		
		int x=0;
		// 1ro.  2do.    4to.
		//       5to.
		for(System.out.println("Hello");true; System.out.println("Hola")) {
			//3ro.
			x++;
			System.out.println(x);
			if (x>10)
				break;
		}
	}
}