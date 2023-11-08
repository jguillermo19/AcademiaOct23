package calculoFinancieroMockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalculoFinancieroJunit {
	
	private CalculoFinanciero cf;
    private CalculoFinancieroCloud cfCloudMock;
    
    @BeforeEach
    public void setUp() {
    	cfCloudMock = mock(CalculoFinancieroCloud.class);
    	cf = new CalculoFinanciero(cfCloudMock);
	}

	@Test
	void test() {
		when(cfCloudMock.realizarOperacionCompleja(1L,2F,3,(byte)4)).thenReturn(999.0);
		double resultado = cf.ejecuta(1L,2F,3,(byte)4);
		assertEquals(999.0,resultado);
	}

}
