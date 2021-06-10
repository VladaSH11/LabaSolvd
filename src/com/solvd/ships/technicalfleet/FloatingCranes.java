package com.solvd.ships.technicalfleet;

public class FloatingCranes extends TechnicalFleetShip{
	public FloatingCranes () {
		setName("Crane-23");
		setPurpose ("lifting large loads");
		setSpeed (23);
		setCruizeRange (2800);
	}
	
	@Override
	public String toString () {
		return "Purpose of ship is lifting large loads";
	}
	
	
	
	@Override
	public void cruisingRange () {
		System.out.println ( "Name of ship is " + getName());
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		
	}
}
