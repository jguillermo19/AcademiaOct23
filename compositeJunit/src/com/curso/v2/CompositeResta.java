package com.curso.v2;

public class CompositeResta implements Component {
	
	private Component componentLeft;
	private Component componentRight;

	public CompositeResta(Component componentLeft, 
			Component componentRight) {
		this.componentLeft = componentLeft;
		this.componentRight = componentRight;
	}

	@Override
	public double operation() {
		return componentLeft.operation() -
				componentRight.operation();
	}

}
