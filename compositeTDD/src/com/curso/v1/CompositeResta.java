package com.curso.v1;

public class CompositeResta extends ComponentAbs {
	
	public CompositeResta(Component c1, Component c2) {
		super(c1, c2);
	}

	@Override
	public double operation() {
		return componentLeft.operation() - 
				componentRight.operation();
	}

}


