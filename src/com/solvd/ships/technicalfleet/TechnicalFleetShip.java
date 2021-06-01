package com.solvd.ships.technicalfleet;

import com.solvd.ships.Ships;

public abstract class TechnicalFleetShip implements Ships  {
	
	private String name;
	private String purpose;
	private int speed;
	private int cruizeRange;
	
	public TechnicalFleetShip() {
		
	}
	
	public TechnicalFleetShip(String name, String purpose , int speed, int cruizeRange) {
		this.name = name;
		this.purpose = purpose;
		this.speed = speed;
		this.cruizeRange = cruizeRange;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName () {
		return this.name;
	}
	
	public void setPurpose (String purpose) {
		this.purpose = purpose;
	}
	
	public String getPurpose () {
		return this.purpose;
	}
	
	
	public void setSpeed (int speed) {
		this.speed = speed;
	}
	
	public int getSpeed () {
		return this.speed;
	}
	
	public int getCruizeRange() {
		return cruizeRange;
	}

	public void setCruizeRange(int cruizeRange) {
		this.cruizeRange = cruizeRange;
	}
	
	
	@Override
	public void printInfo () {
		System.out.println ("Ship`s name is " + getName() );
		System.out.println ("Purpose is " + getPurpose() + " people" );
		System.out.println ("Speed is " + getSpeed() + " nodes");
		System.out.println ("Cruize Range is " + getCruizeRange() + " miles");
	}
	
	@Override
	public void cruisingRange () {
		System.out.println ("Cruising range is " + getCruizeRange () + " miles, with speed " + getSpeed() + " nodes");
	}

	
	

}


