package singleton.con01;

public class ConexionBD {
	
	private String name;
	private static int contador;
	
	private static ConexionBD conexion = new ConexionBD("MySql");

	private ConexionBD(String name) {
		this.name = name;
		contador++;
	}
	
	static int getContador() {
		return contador;
	}
	
	public static ConexionBD getInstance() {
		return conexion;
	}

}
