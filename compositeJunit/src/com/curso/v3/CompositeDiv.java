package com.curso.v3;

public class CompositeDiv  extends ComponentAbs {
	
	public CompositeDiv(Component componentLeft, Component componentRight) {
		super(componentLeft, componentRight);
	}

	@Override
	public double operation() {
		return getComponentLeft().operation()/
				getComponentRight().operation();
	}

}