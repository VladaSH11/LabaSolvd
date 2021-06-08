package com.solvd.ships;

import java.util.Scanner;

import com.solvd.ships.auxiliary.PilotShips;
import com.solvd.ships.auxiliary.RescueShip;
import com.solvd.ships.military.AircraftCarrier;
import com.solvd.ships.military.Destroyers;
import com.solvd.ships.raid.ContainerShips;
import com.solvd.ships.raid.DryCargoShip;
import com.solvd.ships.raid.LoggingShips;
import com.solvd.ships.technicalfleet.CraneVessels;
import com.solvd.ships.technicalfleet.FloatingCranes;
import com.solvd.ships.transport.CruizeShip;
import com.solvd.ships.transport.Ñatamaran;



public class Executor {

	public static void main (String[] args) {
		
		System.out.println ("===============AircraftCarrier================");
		
		AircraftCarrier aircraftCarrier = new AircraftCarrier ();
		aircraftCarrier.setCountryOfOrigin("Russia");
		aircraftCarrier.setShipModel("Vikramaditya");
		aircraftCarrier.setLength(208);
		aircraftCarrier.setDisplacement(38000);
		
		aircraftCarrier.printInfo();
		
		System.out.println ("===============LoggingShips================");
		DryCargoShip loggingShips = new LoggingShips(298);
		loggingShips.swim("Russia");
		System.out.println (loggingShips.toString());
		
		System.out.println ("===============ContainerShips================");
		DryCargoShip containerShips = new ContainerShips(110);
		containerShips.swim("USA", true);
		System.out.println (containerShips.toString());
		
		
		 int i = 0;
	        do {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter the ship`s type");
	        String ship = input.nextLine();
	    
	        switch (ship) {
	            case "Destroyers":
	                System.out.println("You choose Destroyers");
	                Destroyers destroyers = new Destroyers(
	        				"Usa", "Blade", 190, 35400);
	                destroyers.printInfoDestroyers();
	                i = 5;
	                break;
	            case "CruizeShip":
	                System.out.println("You choose Cruize Ship");
	                CruizeShip cruizeShip = new CruizeShip ("Victory", 320, 56000, 680);
	        		cruizeShip.printDestination();
	                i = 5;
	                break;
	            case "Catamaran":
	            	System.out.println("You choose Catamaran");
	            	Ñatamaran catamaran = new Ñatamaran("Diana", 106, 27000, 280);
	        		catamaran.printCatamaran();
	        		catamaran.print();
	                i = 5;
	                break;
	            case "PilotShips":
	                System.out.println("You choose Pilot Ships");
	                PilotShips pilotShips = new PilotShips ("Titan", "to deliver the pilot to the ship and remove him from the ship", 29000, 39);
	        		pilotShips.printInformation();
	                i = 5;
	                break;
	            case "RescueShip":
	                System.out.println("You choose Rescue Ship");
	                RescueShip rescueShip = new RescueShip ();
	        		rescueShip.printInformation();
	                i = 5;
	                break;
	            case "FloatingCranes":
	                System.out.println("You choose Floating Cranes");
	                FloatingCranes floatingCranes = new FloatingCranes ();
	        		floatingCranes.printInfo();
	        		floatingCranes.cruisingRange ();
	                i = 5;
	                break;
	            case "CraneVessels":
	                System.out.println("You choose Crane Vessels");
	                CraneVessels craneVessels = new CraneVessels ();
	        		craneVessels.printInfo();
	        		craneVessels.cruisingRange ();
	                i = 5;
	                break;
	            default:
	                System.out.println("You don't choose any ship`s types"); 
	   
	        }
	        i++;
	    } while(i < 5);
	        

	}
		
}
	
