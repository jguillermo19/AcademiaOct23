package com.curso.v1;

public class ComputadoraLinux {
	
	String sistema = "Linux";
	String version;
	
	public ComputadoraLinux(String version) {
		this.version = version;
	}

	public void encender() {
		System.out.println("Encender computadora Linux, "+version);
	}
	
	@Override
	public String toString() {
		return "Computadora [sistema=" + sistema + ", version=" + version + "]";
	}
	
	

}
