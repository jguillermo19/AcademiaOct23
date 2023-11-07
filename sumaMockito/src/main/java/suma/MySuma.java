package suma;

public class MySuma {
	
	//Autowired
	SumaInterface sumaInt;

	public MySuma(SumaInterface sumaInt) {
		this.sumaInt = sumaInt;
	}
	
	int ejecutaSuma(int x,int y) {
		//DELEGACION
		int r = sumaInt.suma(x, y);
		return r;
	}
	
}
