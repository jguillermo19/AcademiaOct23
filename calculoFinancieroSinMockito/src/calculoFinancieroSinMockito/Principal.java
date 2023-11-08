package calculoFinancieroSinMockito;

public class Principal {

	public static void main(String[] args) {

		long l = 12345L;
		float f = 123.45f;
		int i = 123;
		byte b = 12;

		CalculoFinanciero cf = new CalculoFinanciero(); 
		
		double resultado = cf.ejecuta(l, f, i, b);
		
		System.out.println(resultado);
	}

}
