package com.sim0811.v6;

//How can you fix the following code to make it compile:

import java.io.*;
class Great {
  public void doStuff() throws Exception{
  }    
}

class Amazing extends Great { 
public void doStuff() throws IOException, IllegalArgumentException{
	throw new IOException();
}    
}

public class TestClass {
  public static void main(String[] args) throws Exception{
      Great g = new Amazing();
      g.doStuff();
  }
}
//Assume that changes suggested in a option are to be 
//applied independent of other options.