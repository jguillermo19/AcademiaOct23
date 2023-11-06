package com.curso.v1;

public class CompositeSuma extends ComponentAbs {
	
	public CompositeSuma(Component c1, Component c2) {
		super(c1, c2);
	}

	@Override
	public double operation() {
		return componentLeft.operation() + 
				componentRight.operation();
	}

}
