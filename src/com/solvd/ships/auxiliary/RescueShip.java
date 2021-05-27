package com.solvd.ships.auxiliary;

public class RescueShip extends AuxiliaryShips {
	
	public RescueShip () {
		setName("Comunna");
		setPurpose ("Rescue military ship");
		setDisplacement (3100);
		setSpeed (25);
	}
		
	public RescueShip (String name, String purpose , int displacement, int speed) {
		super (name, purpose, displacement, speed);
	}
		
}