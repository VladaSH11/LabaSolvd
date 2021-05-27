package com.solvd.ships.transport;

public abstract class TransportShip {
	
	private String name;
	private int crewSize;
	private int displacement;
	private int length;
	
	public TransportShip() {
		
	}
	
	public TransportShip(String name, int crewSize, int displacement, int length) {
		this.name = name;
		this.crewSize = crewSize;
		this.displacement = displacement;
		this.length = length;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	public String getName () {
		return this.name;
	}
	
	public void setCrewSize (int crewSize) {
		this.crewSize = crewSize;
	}
	public int getCrewSize () {
		return this.crewSize;
	}
	public void setDisplacement (int displacement) {
		this.displacement = displacement;
	}
	public int getDisplacement () {
		return this.displacement;
	}
	public void setLength (int length) {
		this.length = length;
	}
	public int getLength () {
		return this.length;
	}
	public void print () {
		System.out.println ("Ship`s name is " + getName() );
		System.out.println ("Crew size is " + getCrewSize() + " people" );
		System.out.println ("Displacement is " + getDisplacement() + " tones" );
		System.out.println ("Length is " + getLength() + " meters");
	}
	
	

}
