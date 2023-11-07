package com.curso.v3;

public class ComputadoraLinux implements Computadora {
	
	String sistema = "Linux";
	String version;
	
	public ComputadoraLinux(String version) {
		this.version = version;
	}

	@Override
	public void encender() {
		System.out.println("Encender computadora Linux, "+version);
	}
	
	@Override
	public String toString() {
		return "Computadora [sistema=" + sistema + ", version=" + version + "]";
	}
	
	

}
