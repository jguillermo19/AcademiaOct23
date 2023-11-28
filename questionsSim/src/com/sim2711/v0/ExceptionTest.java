package com.sim2711.v0;

//What is the result of compiling and running this code?  
class MyException extends Throwable {
}

class MyException1 extends MyException {
}

class MyException2 extends MyException {
}

class MyException3 extends MyException2 {
}

public class ExceptionTest {
	void myMethod() throws MyException3 {
		throw new MyException3();
	}

	public static void main(String[] args) {
		ExceptionTest et = new ExceptionTest();
		try {
			et.myMethod();
		} catch (MyException3 me3) {
			System.out.println("MyException3 thrown");
		}catch (MyException2 me3) {
			System.out.println("MyException1o2 thrown");
		} catch (MyException me3) {
			System.out.println("MyException thrown");
		}catch (Throwable me3) {
				System.out.println("Throwable thrown");
		}finally {
			System.out.println(" Done");
		}
	}
}