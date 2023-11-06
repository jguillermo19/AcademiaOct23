package com.curso.v0;

public class CompositeResta implements Component {
	
	Component componentLeft;
	Component componentRight;

	public CompositeResta(Component c1, Component c2) {
		componentLeft = c1;
		componentRight = c2;
	}

	@Override
	public double operation() {
		return componentLeft.operation() - 
				componentRight.operation();
	}

}
