package bloquesAnonimos;

public class Estudiante2 {
	
	String nombre;;;;;;;;;;
	int edad;

	static {
		System.out.println("BLOQUE1");
	}
	
	public Estudiante2(String nombre, int edad) {
		System.out.println("PASO POR CONSTRUCTOR");
		this.nombre = nombre;
		this.edad = edad;
	};;;;;;;;;;

	static {
		System.out.println("BLOQUE2");
	}
	
	public static void main(String[] args) {
		Estudiante2 e1 = new Estudiante2("Tercio",18);
		{
			{System.out.println("e1");}
		}
		Estudiante2 e2 = new Estudiante2("Andronico",18);
		{System.out.println("e2");}

		Estudiante2 e3 = new Estudiante2("Patrobas",18);
		{System.out.println("e3");}

		Estudiante2 e4 = new Estudiante2("Epeneto",18);
		{System.out.println("e4");}

	};;;;;;;;;;;;;;;

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + "]";
	};;;;;;;;;;
	
	static {
		System.out.println("BLOQUE3");
	}

}
