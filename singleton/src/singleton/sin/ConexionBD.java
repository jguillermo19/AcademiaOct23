package singleton.sin;

public class ConexionBD {
	
	private String name;
	private static int contador;

	public ConexionBD(String name) {
		this.name = name;
		//LOGICA DE CONEXION
		contador++;
	}
	
	static int getContador() {
		return contador;
	}

}
