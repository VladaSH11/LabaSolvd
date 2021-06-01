package com.solvd.ships.technicalfleet;

public class FloatingCranes extends TechnicalFleetShip{
	public FloatingCranes () {
		setName("Crane-23");
		setPurpose ("lifting large loads");
		setSpeed (23);
		setCruizeRange (2800);
	}
	
	@Override
	public void printInfo () {
		System.out.println ("Floating Crane-23");
	}
	
	
	
	@Override
	public void cruisingRange () {
		System.out.println ("Cruising range is " +getCruizeRange () + " miles. Name of ship is " + getName() + " with speed "+ getSpeed() + " nodes" );
	}
}
