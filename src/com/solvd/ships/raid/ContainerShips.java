package com.solvd.ships.raid;

public class ContainerShips extends DryCargoShip {
	
private int numberOfEmployees;
	
	public ContainerShips(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public String toString() {
	    return "The number is : " + this.numberOfEmployees + " employees";
	}

	@Override
	public void shipArrived() {
		System.out.println("Container ship isn`t arrived at the raid");
		
	}

}
