package com.curso.v1;

public class Principal2 {

	public static void main(String[] args) {

		System.out.println(	
			new CompositeSuma(
				new CompositeSuma(
					new LeafConstante(1),
					new LeafConstante(2)
				),
				new CompositeSuma(
					new LeafConstante(3),	
					new CompositeSuma(
						new LeafConstante(4),
						new LeafConstante(5)	
					)
				)
			).operation()
		);

	}

}
