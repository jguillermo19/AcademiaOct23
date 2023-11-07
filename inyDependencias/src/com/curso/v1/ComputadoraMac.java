package com.curso.v1;

public class ComputadoraMac {
	
	String sistema = "Mac";
	String version;
	
	public ComputadoraMac(String version) {
		this.version = version;
	}

	public void encender() {
		System.out.println("Encender computadora Mac, "+version);
	}
	
	@Override
	public String toString() {
		return "Computadora [sistema=" + sistema + ", version=" + version + "]";
	}
	
	

}
