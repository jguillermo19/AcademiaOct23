package com.curso.v0;

public class Bear {
	private Bear pandaBear; // <= HAS-A

	@Override //NO hacer caso
	protected void finalize() {
	}

	private void roar(Bear b) {
		System.out.println("Roar!");
		pandaBear = b;
	}

	public static void main(String[] args) {
		Bear brownBear = new Bear();
		Bear polarBear = new Bear();
		brownBear.roar(polarBear);
		polarBear = null; //NINGUN OBJETO SE QUEDA SIN REFERENCIA
		Bear blackBear = brownBear.pandaBear;
		brownBear = null;
		System.gc(); //Invitación
	}
}