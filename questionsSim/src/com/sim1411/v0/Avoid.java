package com.sim1411.v0;

import java.text.*;

//What is the result?

public class Avoid {
 public static void main(String[] args) throws ParseException {
     String[] sa = {"111.234", "222.5678"};
     NumberFormat nf = NumberFormat.getInstance();
     nf.setMaximumFractionDigits(3);
     for (String s : sa) {
         System.out.println(nf.parse(s));
     }
 }
}

//111.234 222.567
//111.234 222.568
//111.234 222.5678 <=
//An exception is thrown at runtime