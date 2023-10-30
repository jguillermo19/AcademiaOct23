package com.curso.v0;

import java.util.Comparator;

public class ComparatorNombre implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

	

}
