package calculoFinancieroMockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class TestCalculoFinancieroMockito {
	
	//@Mock
    private CalculoFinancieroCloud cfCloudMock;
	
	private CalculoFinanciero cf;

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
		
		// Verificamos que se llamó al mock con los argumentos correctos
        verify(cfCloudMock).realizarOperacionCompleja(1L,2F,3,(byte)4);
	}

}
