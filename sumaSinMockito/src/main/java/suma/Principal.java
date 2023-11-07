package suma;

public class Principal {

	public static void main(String[] args) {

		SumaInterface s = new MySuma();
		
		int resultado = s.suma(5, 8);
		
		System.out.println("resultado: "+resultado);
		
	}

}
