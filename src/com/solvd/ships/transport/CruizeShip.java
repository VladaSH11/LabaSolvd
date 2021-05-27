package com.solvd.ships.transport;

public class CruizeShip extends TransportShip {
	
	private String destination;
	
	public CruizeShip() {
		
	}
	
	public CruizeShip(String name, int crewSize, int displacement, int length) {
		super (name, crewSize, displacement, length);
		setDestination("France");
	}
	
	
	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
    
	public void printDestination () {
		print();
		System.out.println ( " The distanation point is " + getDestination());
	
	}
	
}


	


