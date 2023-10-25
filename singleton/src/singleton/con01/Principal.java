package singleton.con01;

public class Principal {

	public static void main(String[] args) {

		ConexionBD con1 = ConexionBD.getInstance();
		ConexionBD con2 = ConexionBD.getInstance();
		ConexionBD con3 = ConexionBD.getInstance();
		ConexionBD con4 = ConexionBD.getInstance();
		ConexionBD con999 = ConexionBD.getInstance();

		System.out.println(ConexionBD.getContador()); 

	}

}
