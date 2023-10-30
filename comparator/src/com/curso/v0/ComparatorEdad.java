package com.curso.v0;

import java.util.Comparator;

public class ComparatorEdad implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o2.getEdad() - o1.getEdad();
	}

	

}
