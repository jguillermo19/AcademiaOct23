package com.curso.v1;

public abstract class ComponentAbs extends Component {
	
	Component componentLeft;
	Component componentRight;

	public ComponentAbs(Component c1, Component c2) {
		componentLeft = c1;
		componentRight = c2;
	}

}
