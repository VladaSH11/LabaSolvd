package com.solvd.ships.military;

public class Destroyers extends MilitaryShip{
	
	private String armament;
	
	public Destroyers () {
		
	}
	
	public Destroyers(String countryOfOrigin, String shipModel, int length, int displacement) {
		super (countryOfOrigin, shipModel, length,  displacement);
		setArmament("gun");
	}

	public void printInfoDestroyers() {
		printInfo();
		System.out.println ("Armament is " + getArmament());
	}

	public String getArmament() {
		return armament;
	}

	public void setArmament(String armament) {
		this.armament = armament;
	}
	
}
