package com.curso.v3;

public class CompositeSuma extends ComponentAbs {
	
	public CompositeSuma(Component componentLeft, Component componentRight) {
		super(componentLeft, componentRight);
	}

	@Override
	public double operation() {
		return getComponentLeft().operation()+
				getComponentRight().operation();
	}

}
