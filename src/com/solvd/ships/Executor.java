package com.solvd.ships;

import com.solvd.ships.auxiliary.PilotShips;
import com.solvd.ships.auxiliary.RescueShip;
import com.solvd.ships.military.AircraftCarrier;
import com.solvd.ships.military.Destroyers;
import com.solvd.ships.technicalfleet.CraneVessels;
import com.solvd.ships.technicalfleet.FloatingCranes;
import com.solvd.ships.transport.CruizeShip;
import com.solvd.ships.transport.Catamaran;


public class Executor {

	public static void main (String[] args) {
		
		System.out.println ("===============AircraftCarrier================");
		
		AircraftCarrier aircraftCarrier = new AircraftCarrier ();
		aircraftCarrier.setCountryOfOrigin("Russia");
		aircraftCarrier.setShipModel("Vikramaditya");
		aircraftCarrier.setLength(208);
		aircraftCarrier.setDisplacement(38000);
		
		aircraftCarrier.printInfo();
		
		System.out.println ("===============Destroyers================");
		
		Destroyers destroyers = new Destroyers(
				"Usa", "Blade", 190, 35400);
		destroyers.printInfoDestroyers();
		
		
		System.out.println ("===============CruizeShip================");
		
		CruizeShip cruizeShip = new CruizeShip ("Victory", 320, 56000, 680);
		cruizeShip.printDestination();
		
		
		System.out.println ("===============Catamaran================");
		
		Ñatamaran catamaran = new Ñatamaran("Diana", 106, 27000, 280);
		catamaran.printCatamaran();
		catamaran.print();
		
		System.out.println ("===============PilotShips================");
		PilotShips pilotShips = new PilotShips ("Titan", "to deliver the pilot to the ship and remove him from the ship", 29000, 39);
		pilotShips.printInformation();
		
		System.out.println ("===============RescueShip================");
		RescueShip rescueShip = new RescueShip ();
		rescueShip.printInformation();
		
		System.out.println ("===============FloatingCranes================");
		FloatingCranes floatingCranes = new FloatingCranes ();
		floatingCranes.printInfo();
		floatingCranes.cruisingRange ();
		
		System.out.println ("===============CraneVessels================");
		CraneVessels craneVessels = new CraneVessels ();
		craneVessels.printInfo();
		craneVessels.cruisingRange ();
		
	}
	
}
