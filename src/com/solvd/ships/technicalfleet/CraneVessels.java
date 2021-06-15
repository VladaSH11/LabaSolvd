package com.solvd.ships.technicalfleet;

public class CraneVessels extends TechnicalFleetShip {
	
	public CraneVessels (String name, String purpose, int speed, int cruizeRange) {
		setName(name);
		setPurpose (purpose);
		setSpeed (speed);
		setCruizeRange (cruizeRange);
	}
	
	
	
	@Override
	public String toString () {
		return "Cruising range is " +getCruizeRange () + " miles. Name of ship is " + getName() + "." + " Purpose is " + getPurpose();
	}



	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		
	}
	
	
}


