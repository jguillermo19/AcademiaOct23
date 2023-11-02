package com.curso.v2;

public class Principal {

	public static void main(String[] args) {

		System.out.println(	
			new CompositeResta(
				new CompositeMulti(
					new LeafConstante(1),
					new LeafConstante(2)
				),
				new CompositeDiv(
					new LeafConstante(9),	
					new CompositeSuma(
						new LeafConstante(4),
						new LeafConstante(5)	
					)
				)
			).operation()
		);

	}

}
