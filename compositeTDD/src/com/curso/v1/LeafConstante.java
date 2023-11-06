package com.curso.v1;

public class LeafConstante extends Component {
	
	double valor;

	public LeafConstante(double valor) {
		this.valor = valor;
	}

	@Override
	public double operation() {
		return valor;
	}

}
