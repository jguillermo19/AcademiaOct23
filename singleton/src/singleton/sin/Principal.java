package singleton.sin;

public class Principal {

	public static void main(String[] args) {

		ConexionBD con1 = new ConexionBD("MySql");
		ConexionBD con2 = new ConexionBD("MySql");
		ConexionBD con3 = new ConexionBD("MySql");
		ConexionBD con4 = new ConexionBD("MySql");
		ConexionBD con999 = new ConexionBD("MySql");

		System.out.println(ConexionBD.getContador()); //1

	}

}
