package com.solvd.ships.transport;

public class Ñatamaran extends TransportShip{
	
	private String model;
	private int maxSpeed;
	
	public Ñatamaran() {
		setModel ("Medium");
		setMaxSpeed (23);
		
	}
	
	public Ñatamaran(String name, int crewSize, int displacement, int length) {
		super ( name,  crewSize,  displacement,  length);
		setModel ("Medium");
		setMaxSpeed (23); 
	}
	
	
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public String toString() {
		return "Model of catamaran is " + getModel() + "\n" + "Max speed of catamaran is " + getMaxSpeed() + " nodes";
	}
}
	


