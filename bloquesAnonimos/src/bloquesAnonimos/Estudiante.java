package bloquesAnonimos;

public class Estudiante {
	
	String nombre;;;;;;;;;;
	int edad;

	{
		{System.out.println("BLOQUE1");};;;;;;
	};;   ;;;;
	
	public Estudiante(String nombre, int edad) {
		System.out.println("PASO POR CONSTRUCTOR");
		this.nombre = nombre;
		this.edad = edad;
	};;;;;;;;;;

	{
		System.out.println("BLOQUE2");
	}
	
	public static void main(String[] args) {
		Estudiante e1 = new Estudiante("Tercio",18);
		{
			{System.out.println("e1");}
		}
		Estudiante e2 = new Estudiante("Andronico",18);
		{System.out.println("e2");}

		Estudiante e3 = new Estudiante("Patrobas",18);
		{System.out.println("e3");}

		Estudiante e4 = new Estudiante("Epeneto",18);
		{System.out.println("e4");}

	};;;;;;;;;;;;;;;

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + "]";
	};;;;;;;;;;
	
	{
		System.out.println("BLOQUE3");
	}

}
