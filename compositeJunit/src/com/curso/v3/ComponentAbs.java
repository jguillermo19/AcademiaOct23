package com.curso.v3;

public abstract class ComponentAbs implements Component {
	
	private Component componentLeft;
	private Component componentRight;

	public ComponentAbs(Component componentLeft, 
			Component componentRight) {
		this.componentLeft = componentLeft;
		this.componentRight = componentRight;
	}

	public Component getComponentLeft() {
		return componentLeft;
	}

	public void setComponentLeft(Component componentLeft) {
		this.componentLeft = componentLeft;
	}

	public Component getComponentRight() {
		return componentRight;
	}

	public void setComponentRight(Component componentRight) {
		this.componentRight = componentRight;
	}

}
