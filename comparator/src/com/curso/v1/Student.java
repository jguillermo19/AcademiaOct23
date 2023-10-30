package com.curso.v1;

public class Student {

	// Atributos de la clase
	private String nombre;
	private int edad;
	private double promedio;

	// Constructor sin argumentos
	public Student() {
		// Constructor vacío
	}

	// Constructor con todos los atributos como argumentos
	public Student(String nombre, int edad, double promedio) {
		this.nombre = nombre;
		this.edad = edad;
		this.promedio = promedio;
	}

	// Métodos getter y setter para el atributo nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Métodos getter y setter para el atributo edad
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Métodos getter y setter para el atributo promedio
	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	// Método toString para mostrar los datos del estudiante
	@Override
	public String toString() {
		return "Student{" + "nombre='" + nombre + '\'' + ", edad=" + edad + ", promedio=" + promedio + '}';
	}
}
