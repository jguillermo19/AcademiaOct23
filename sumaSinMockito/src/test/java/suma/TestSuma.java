package suma;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSuma {
	@Test
	void test() {
		int x= 8;
		int y= 5;
		SumaInterface s = new MySuma();
		assertEquals(13, s.suma(x,y));	
	}
}
