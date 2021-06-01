package com.solvd.ships.military;

public class AircraftCarrier extends MilitaryShip{

   public AircraftCarrier() { 
   }
   
   public AircraftCarrier(String countryOfOrigin, String shipModel, int length, int displacement) {
	  setCountryOfOrigin(countryOfOrigin);
	  setShipModel (shipModel);
	  setLength (length);
	  setDisplacement (displacement);
   }

@Override
public void cruisingRange() {
	
 }
   
}