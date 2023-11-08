package com.sim0811.px;

import com.sim0811.p1.Movable;
import com.sim0811.p2.Donkey;

public class TestClass {
	public static void main(String[] args) {
		Movable m = new Donkey();
		m.move(10); //location Donkey 210
		m.moveBack(20); //location Donkey 190
		System.out.println(m.location); //0
	}
}