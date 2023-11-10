package com.sim0911.v0;

//What will be the result of compiling and running 
//the following program ?

class AnotherExceptionA extends Exception {
}

class AnotherExceptionB extends Exception {
}

class AnotherExceptionC extends Exception {
}

class AnotherExceptionD extends Exception {
}

public class ExceptionTest {
	public static void main(String[] args) throws Exception {
		try {
			m2();
		} catch(Exception e1) {
			//m3();
			System.out.println("finally");
			try{
				m4();
			}catch(Exception e2){
				m5();
			}
			
		}
	}

	public static void m2() throws AnotherExceptionA {
		throw new AnotherExceptionA();
	}

	public static void m3() throws AnotherExceptionB{
		throw new AnotherExceptionB();
	}
	
	public static void m4() throws AnotherExceptionC {
		throw new AnotherExceptionC();
	}
	
	public static void m5() throws AnotherExceptionD {
		throw new AnotherExceptionD();
	}
}
//You had to select 1 option 
//It will compile but will throw AnotherException when run. 
//It will compile but will throw NewException when run. 
//It will compile and run without throwing any exceptions. 
//It will not compile. 
//None of the above.
