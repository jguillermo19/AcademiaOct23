package com.sim0811.p2;

import com.sim0811.p1.Movable;

public class Donkey implements Movable {
	int location = 200;

	public void move(int by) {
		location = location + by;
	}

	public void moveBack(int by) {
		location = location - by;
	}
}