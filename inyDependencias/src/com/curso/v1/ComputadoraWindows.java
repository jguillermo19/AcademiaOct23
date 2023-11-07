package com.curso.v1;

public class ComputadoraWindows {
	
	String sistema = "Windows";
	String version;
	
	public ComputadoraWindows(String version) {
		this.version = version;
	}

	public void encender() {
		System.out.println("Encender computadora Windows, "+version);
	}
	
	@Override
	public String toString() {
		return "Computadora [sistema=" + sistema + ", version=" + version + "]";
	}
	
	

}
