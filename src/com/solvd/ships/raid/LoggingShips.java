package com.solvd.ships.raid;

public class LoggingShips extends DryCargoShip {

	private int weigth;
	
	public LoggingShips(int weigth) {
		this.weigth = weigth;
	}
	
	public String toString() {
	    return "Weigth of ship is : " + this.weigth + " tones";
	}

	@Override
	public void shipArrived() {
		System.out.println(" Logging ship is arrived at the raid");
		
	}

}
