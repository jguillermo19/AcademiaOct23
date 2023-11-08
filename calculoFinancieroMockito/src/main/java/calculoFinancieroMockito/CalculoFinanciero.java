package calculoFinancieroMockito;
public class CalculoFinanciero {
	
	//AutoWired
	CalculoFinancieroCloud cfc;
	
	public CalculoFinanciero(CalculoFinancieroCloud cfc) {
		this.cfc = cfc;
	}

	double ejecuta(long l, float f, int i, byte b) {
		//DELEGACION
	    double resultado=cfc.realizarOperacionCompleja(l, f, i, b);
	    return resultado;
	}

}
