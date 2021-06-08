package com.solvd.ships.raid;

public abstract class DryCargoShip implements ShipsRaid {
	
	public void swim (String destination, boolean shipArrived) {
		System.out.println("Distanation point is: " + destination);	
		if (shipArrived) {
			shipArrived();
		} else {
			System.out.println("Ship is on way");	
		}
	}


	public void swim (String destination) {
		swim(destination, false);
	}

}
