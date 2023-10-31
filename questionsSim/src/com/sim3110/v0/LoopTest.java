package com.sim3110.v0;

//Given: 
public class LoopTest {
	int k = 5;
		
	public boolean checkIt(int k) {
		return k++ > 0 ? true : false; //k (param local)
	}

	public void printThem() {
		while (checkIt(k)) { //k(objeto)
			System.out.print(k--);
		}
	}

	public static void main(String[] args) {
		new LoopTest().printThem();
	}
}

//What changes should be made so that the program 
//will print 54321?
