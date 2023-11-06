package com.curso.v3;

public class CompositeResta extends ComponentAbs {
	
	public CompositeResta(Component componentLeft, Component componentRight) {
		super(componentLeft, componentRight);
	}

	@Override
	public double operation() {
		return getComponentLeft().operation()-
				getComponentRight().operation();
	}

}