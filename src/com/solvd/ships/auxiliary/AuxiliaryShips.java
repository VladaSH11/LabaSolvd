package com.solvd.ships.auxiliary;

public abstract class AuxiliaryShips {
	
	private String name;
	private String purpose;
	private int displacement;
	private int speed;
	
	public AuxiliaryShips() {
		
	}
	
	public AuxiliaryShips(String name, String purpose , int displacement, int speed) {
		this.name = name;
		this.purpose = purpose;
		this.displacement = displacement;
		this.speed = speed;
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
	
	public void setDisplacement (int displacement) {
		this.displacement = displacement;
	}
	
	public int getDisplacement () {
		return this.displacement;
	}
	
	public void setSpeed (int speed) {
		this.speed = speed;
	}
	
	public int getSpeed () {
		return this.speed;
	}
	
	public String toString() {
		return "Ship name is " + getName() + "\n" + "Purpose is " + getPurpose() + " people" + "\n" + "Displacement is " + getDisplacement() + " tones" + "\n" + "Speed is " + getSpeed() + " nodes"; 
	}
	
	
	

}
