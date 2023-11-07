package com.curso.v4;

public class ComputadoraWindows implements Computadora  {
	
	String sistema = "Windows";
	String version;
	
	public ComputadoraWindows(String version) {
		this.version = version;
	}

	@Override
	public void encender() {
		System.out.println("Encender computadora Windows, "+version);
	}
	
	@Override
	public String toString() {
		return "Computadora [sistema=" + sistema + ", version=" + version + "]";
	}
	
	

}
