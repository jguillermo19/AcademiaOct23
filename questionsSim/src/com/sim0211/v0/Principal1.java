package com.sim0211.v0;

public class Principal1 {

	public static void main(String[] args) {
		//Consider the following lines of code:
        Integer i = new Integer(42);
        Long ln = new Long(42);
        Double d = new Double(42.0);
        // Which of the following options are valid code fragments?
        boolean r;
        r = i.longValue()==ln;

        //r = ln==d;
        r = i.equals(d);
        r = d.equals(ln);
        r = ln.equals(42l);
        System.out.println(r);

	}

}
