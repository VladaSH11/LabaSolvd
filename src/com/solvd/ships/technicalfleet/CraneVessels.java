package com.solvd.ships.technicalfleet;

public class CraneVessels extends TechnicalFleetShip {
	
	public CraneVessels () {
		setName("CR-187");
		setPurpose ("lifting of small vessels");
		setSpeed (18);
		setCruizeRange (2100);
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


