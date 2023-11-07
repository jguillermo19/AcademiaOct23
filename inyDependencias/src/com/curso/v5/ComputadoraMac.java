package com.curso.v5;

public class ComputadoraMac implements Computadora  {
	
	String sistema = "Mac";
	String version;
	
	public ComputadoraMac(String version) {
		this.version = version;
	}

	@Override
	public void encender() {
		System.out.println("Encender computadora Mac, "+version);
	}
	
	@Override
	public String toString() {
		return "Computadora [sistema=" + sistema + ", version=" + version + "]";
	}
	
	

}
