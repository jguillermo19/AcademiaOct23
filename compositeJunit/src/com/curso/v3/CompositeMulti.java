package com.curso.v3;

public class CompositeMulti extends ComponentAbs {
	
	public CompositeMulti(Component componentLeft, Component componentRight) {
		super(componentLeft, componentRight);
	}

	@Override
	public double operation() {
		return getComponentLeft().operation()*
				getComponentRight().operation();
	}

}