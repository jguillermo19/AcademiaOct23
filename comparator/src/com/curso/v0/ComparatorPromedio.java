package com.curso.v0;

import java.util.Comparator;

public class ComparatorPromedio implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return (int)(o1.getPromedio()*100 - o2.getPromedio()*100);
	}

	

}
