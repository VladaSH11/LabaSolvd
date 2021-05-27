package com.solvd.ships.military;

import com.solvd.ships.Ships;

public abstract class MilitaryShip implements Ships {
	
	private String countryOfOrigin;
	private String shipModel;
	private int length;
	private int displacement; 
	
	public MilitaryShip() {
		
	}
	
	 public MilitaryShip (String countryOfOrigin, String shipModel, int length, int displacement){
		 this.setCountryOfOrigin(countryOfOrigin);
	     this.setShipModel(shipModel);
	     this.setLength(length);
	     this.setDisplacement(displacement);
	 }

	public void printInfo () {
		System.out.println ("This ship is made in " + getCountryOfOrigin());
		System.out.println ("Model of ship is " + getShipModel());
		System.out.println ("Length of ship is " + getLength() + " meters");
		System.out.println ("The displacement of ship is " + getDisplacement() + " tons");
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getShipModel() {
		return shipModel;
	}

	public void setShipModel(String shipModel) {
		this.shipModel = shipModel;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	
}
