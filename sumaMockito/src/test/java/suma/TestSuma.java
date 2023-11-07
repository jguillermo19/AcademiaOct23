package suma;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSuma {
	@Test
	void test() {
		int x= 8;
		int y= 5;
		//NO SE DEBE DE HACER
		//PARA ESTO USAR MOCKITO
		SumaInterface s = new SumaInterface() {
			public int suma(int x, int y) {
				return x+y;
			}
		};
		assertEquals(13, s.suma(x,y));	
	}
}
