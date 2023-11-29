package com.sim2911.v0;

//What will the following class print when 
//compiled and run?
class Holder {
	int value = 1;
	Holder link; //HAS-A

	public Holder(int val) {
		this.value = val;
	}

	public static void main(String[] args) {
		Holder a = new Holder(5);
		
	}

	                                      //15            //25
	public static Holder setIt(final Holder x, final Holder y) {
		//x.link = y.link;
		//x.link = null;
		return x;
	}

}