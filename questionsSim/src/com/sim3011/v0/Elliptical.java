package com.sim3011.v0;

//Consider the following class written by a novice programmer.

class Elliptical{
    public int radiusA;
    private int radiusB;
    private final int sum = 200;

    public void setRadius(int r){
        if(r>99) throw new IllegalArgumentException();
        radiusA = r;
        radiusB = sum - radiusA;
    }
    
    int getRadiusB() {
    	return radiusB;
    }
}
//After some time, the requirements changed and the programmer 
//now wants to make sure that radiusB is always (200 - radiusA)
//instead of (100 - radiusA) without breaking existing code 
//that other people have written. Which of the following will 
//accomplish his goal?