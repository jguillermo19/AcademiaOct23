package singleton.con;

public class ConexionBD {
	
	private String name;
	private static int contador;
	
	private static ConexionBD conexion;

	private ConexionBD(String name) {
		this.name = name;
		contador++;
	}
	
	static int getContador() {
		return contador;
	}
	
	public static ConexionBD getInstance() {
		if (conexion==null)
			conexion = new ConexionBD("MySql");
		return conexion;
	}

}
