package com.curso.v1;

public class CompositeSuma implements Component {
	
	private Component componentLeft;
	private Component componentRight;

	public CompositeSuma(Component componentLeft, 
			Component componentRight) {
		this.componentLeft = componentLeft;
		this.componentRight = componentRight;
	}

	@Override
	public double operation() {
		return componentLeft.operation()+
				componentRight.operation();
	}

}
