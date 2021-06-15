package com.solvd.ships.military;

import com.solvd.ships.executor.Ships;

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
	 
	 public String toString () {
		 return "This ship is made in " + getCountryOfOrigin() + "\n" + "Model of ship is " + getShipModel() + "\n" + "Length of ship is " + getLength() + " meters" + "\n" + "The displacement of ship is " + getDisplacement() + " tons"; 
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
