package com.curso.v2;

public class CompositeMulti implements Component {
	
	private Component componentLeft;
	private Component componentRight;

	public CompositeMulti(Component componentLeft, 
			Component componentRight) {
		this.componentLeft = componentLeft;
		this.componentRight = componentRight;
	}

	@Override
	public double operation() {
		return componentLeft.operation()*
				componentRight.operation();
	}

}
