package suma;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestSumaV2 {
	
    private SumaInterface sumaMock;
    private MySuma mySuma;

	@BeforeEach
    public void setUp() {
		sumaMock = mock(SumaInterface.class);
		mySuma = new MySuma(sumaMock);
	}
	
	@Test
	void testMockito() {
		when(sumaMock.suma(8, 5)).thenReturn(13);
		int resultado = mySuma.ejecutaSuma(8, 5);
		assertEquals(13,resultado);
	}
}
