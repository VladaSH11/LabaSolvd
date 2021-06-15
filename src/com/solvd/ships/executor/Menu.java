package com.solvd.ships.executor;

import java.util.HashMap;
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
import com.solvd.ships.transport.Catamaran;
import com.solvd.ships.transport.CruizeShip;


public class Menu {
	
	public Menu () {
		
	}
	
	

	public void showStartMenu() {
		
			
			System.out.println ("===============AircraftCarrier================");
			
			AircraftCarrier aircraftCarrier = new AircraftCarrier ();
			aircraftCarrier.setCountryOfOrigin("Russia");
			aircraftCarrier.setShipModel("Vikramaditya");
			aircraftCarrier.setLength(208);
			aircraftCarrier.setDisplacement(38000);
			aircraftCarrier.cruisingRange();
			aircraftCarrier.printInfo();
			
			System.out.println ("===============LoggingShips================");
			DryCargoShip loggingShips = new LoggingShips(298);
			loggingShips.swim("Russia");
			System.out.println (loggingShips.toString());
			
			System.out.println ("===============ContainerShips================");
			DryCargoShip containerShips = new ContainerShips(110);
			containerShips.swim("USA", true);
			System.out.println (containerShips.toString());
			
			 System.out.println ("===============Array, LinkedList, HashSet, HashMap================");
			 System.out.println ("========================Country======================");
		        
		        Destroyers blk = new Destroyers("Russia", "Blade", 160, 29700);
		        Destroyers balt = new Destroyers("Usa", "Craze", 170, 30800);
		        Destroyers nor = new Destroyers("Japan", "Flame", 195, 25490);
		        Destroyers pack = new Destroyers("China", "Blade", 155, 32910);
		        Destroyers casp = new Destroyers("Italy", "Flame", 168, 28540);
		        
		        ShipRaid shipRaid = new ShipRaid();
		        shipRaid.setDestroyers(blk);
		        shipRaid.setDestroyers(balt);
		        shipRaid.setDestroyers(nor);
		        shipRaid.setDestroyers(pack);
		        shipRaid.setDestroyers(casp);
		        
		        if(shipRaid.listOfDestroyers.isEmpty()){
		        	System.out.println ("Destroyers are empty");
		        } else {
		        	for(Destroyers destroy: shipRaid.getlistOfDestroyers())
			            System.out.println(destroy.getCountryOfOrigin());
		        }

		        
		        System.out.println ("======================Name========================");
		       
		        Catamaran victory = new Catamaran("Victory", 108, 2700, 280);
		        Catamaran kabe = new Catamaran("Kabe", 110, 2100, 270);
		        Catamaran lily = new Catamaran("Lily", 119 , 2350, 270);
		        Catamaran broke = new Catamaran("Broke", 120, 2670, 240);
		        Catamaran crisp = new Catamaran("Crisp", 115, 2900, 300);
		        
		        
		        shipRaid.setCatamaran(victory);
		        shipRaid.setCatamaran(kabe);
		        shipRaid.setCatamaran(lily);
		        shipRaid.setCatamaran(broke);
		        shipRaid.setCatamaran(crisp);

		        if(shipRaid.listOfCatamaran.isEmpty()){
		        	System.out.println ("Catamarans are empty");
		        } else {
		        	for(Catamaran catamaran: shipRaid.getlistOfCatamaran())
			            System.out.println(catamaran.getName());
		        }
		        
		        
		        System.out.println ("========================Purpose======================");
			       
		        PilotShips lockheedMartin = new PilotShips("Titan", "to deliver the pilot to the ship and remove him from the ship", 28000, 39);
		        PilotShips eurofighterTyphoon = new PilotShips("Titan", "to deliver the pilot to the ship ", 27000, 37);
		        PilotShips avrora = new PilotShips("Titan", "to remove him from the ship", 27500, 38);
		        PilotShips agatopol = new PilotShips("Titan", "to deliver the pilot to the ship", 28560,41);
		        PilotShips azimut = new PilotShips("Titan", "to deliver the pilot to the ship and remove him from the ship", 31000, 40);    
			
		        shipRaid.addPilotShips(lockheedMartin);
		        shipRaid.addPilotShips(eurofighterTyphoon);
		        shipRaid.addPilotShips(avrora);
		        shipRaid.addPilotShips(agatopol);
		        shipRaid.addPilotShips(azimut);
		        
		        if(shipRaid.listOfPilotShips.isEmpty()){
		        	System.out.println ("Pilot ships are empty");
		        } else {
		        	for(PilotShips pilotShips: shipRaid.getlistOfPilotShips())
			            System.out.println(pilotShips.getPurpose());
		        
		        System.out.println ("========================CruizeRange======================");	
		        	
		        CraneVessels cr165 = new CraneVessels ("CR-165", "lifting of small vessels", 17, 2000);
		        CraneVessels cr166 = new CraneVessels ("CR-166", "lifting of big vessels", 23, 2600);
		        CraneVessels cr167 = new CraneVessels ("CR-167", "lifting of big and small vessels", 20, 2400);
		        CraneVessels cr168 = new CraneVessels ("CR-168", "lifting of small vessels", 16, 1900);	
		        	
		        shipRaid.addCraneVessels(cr165);
		        shipRaid.addCraneVessels(cr166);
		        shipRaid.addCraneVessels(cr167);
		        shipRaid.addCraneVessels(cr168);
		        
		        if(shipRaid.hashSetCraneVessels.isEmpty()){
		        	System.out.println ("crane vessels are empty");
		        } else {
		        	for(CraneVessels craneVessels: shipRaid.getCraneVessels())
			            System.out.println(craneVessels.getCruizeRange());
		        
		        System.out.println ("========================Destination======================");	
		        	
		        HashMap<Catamaran, String> mapC = new HashMap<>();
		        mapC.put(victory, "at the raid");
		        mapC.put(kabe, "out of the raid");
		        mapC.put(lily, "out of the raid");
		        mapC.remove(broke);
		        mapC.put(crisp, "at the raid");
		        
		        
		        if(mapC.isEmpty()){
		        	System.out.println ("map is empty");
		        } else {
		        	System.out.println(mapC);
		        	
		              
		        }
		        
		        
		        System.out.println ("==============================================");
		        System.out.println ("========================Switch Case======================");
			
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
		        		System.out.println (cruizeShip.toString());
		                i = 5;
		                break;
		            case "Catamaran":
		            	System.out.println("You choose Catamaran");
		            	Catamaran catamaran = new Catamaran("Diana", 106, 27000, 280);
		        		System.out.println (catamaran.toString());
		                i = 5;
		                break;
		            case "PilotShips":
		                System.out.println("You choose Pilot Ships");
		                PilotShips pilotShips = new PilotShips ("Titan", "to deliver the pilot to the ship and remove him from the ship", 29000, 39);
		        		System.out.println (pilotShips.toString());
		                i = 5;
		                break;
		            case "RescueShip":
		                System.out.println("You choose Rescue Ship");
		                RescueShip rescueShip = new RescueShip ();
		                System.out.println (rescueShip.toString());
		                i = 5;
		                break;
		            case "FloatingCranes":
		                System.out.println("You choose Floating Cranes");
		                FloatingCranes floatingCranes = new FloatingCranes ();
		                System.out.println (floatingCranes.toString());
		        		floatingCranes.cruisingRange ();
		                i = 5;
		                break;
		            case "CraneVessels":
		                System.out.println("You choose Crane Vessels");
		                CraneVessels craneVessels = new CraneVessels ("CR-187", "lifting of small vessels", 18, 2100);
		                System.out.println (craneVessels.toString());
		                i = 5;
		                break;
		            default:
		                System.out.println("You don't choose any ship`s types"); 
		   break;
		        }
		        i++;
		    } while(i < 5);
		
	}
		        }
		        }
		        }
	

	


