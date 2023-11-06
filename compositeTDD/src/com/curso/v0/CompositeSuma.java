package com.curso.v0;

public class CompositeSuma implements Component {
	
	Component componentLeft;
	Component componentRight;

	public CompositeSuma(Component c1, Component c2) {
		componentLeft = c1;
		componentRight = c2;
	}

	@Override
	public double operation() {
		return componentLeft.operation() + 
				componentRight.operation();
	}

}
