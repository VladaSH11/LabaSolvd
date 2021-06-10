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
	
	System.out.println ("Cruising range is 125 people");
 }

@Override
public void printInfo() {
	  
	System.out.println ("This ship is made in " + getCountryOfOrigin() + "\n" + "Model of ship is " + getShipModel() + "\n" + "Length of ship is " + getLength() + " meters" + "\n" + "The displacement of ship is " + getDisplacement() + " tons");
}

}