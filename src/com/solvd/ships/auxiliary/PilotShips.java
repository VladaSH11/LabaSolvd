package com.solvd.ships.auxiliary;

public class PilotShips extends AuxiliaryShips {
	
	public PilotShips (String name, String purpose, int displacement, int speed) {
		super (name, purpose, displacement, speed);
		
	}
	
	public void PrintInformation () {
		System.out.println ("Ship`s name is " + getName() );
		System.out.println ("Purpose is " + getPurpose() + " people" );
		System.out.println ("Displacement is " + getDisplacement() + " tones" );
		System.out.println ("Speed is " + getSpeed() + " nodes");
	}
}


	
