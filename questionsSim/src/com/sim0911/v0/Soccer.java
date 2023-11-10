package com.sim0911.v0;

//What will the following program print when compiled and run?

class Game{
  public void play() throws Exception{
    System.out.println("Playing...");
  }
}

public class Soccer extends Game{
   public void play() {
      System.out.println("Playing Soccer...");      
   }
   
   public static void main(String[] args) throws Exception{
       Game g = new Soccer();
       g.play();
   }
}