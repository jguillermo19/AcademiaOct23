package com.curso.v0;

public class CompositeDiv implements Component {
	
	Component componentLeft;
	Component componentRight;

	public CompositeDiv(Component c1, Component c2) {
		componentLeft = c1;
		componentRight = c2;
	}

	@Override
	public double operation() {
		return componentLeft.operation() / 
				componentRight.operation();
	}

}
