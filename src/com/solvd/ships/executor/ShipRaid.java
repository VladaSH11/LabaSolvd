package com.solvd.ships.executor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import com.solvd.ships.auxiliary.PilotShips;
import com.solvd.ships.military.Destroyers;
import com.solvd.ships.transport.Catamaran;
import com.solvd.ships.technicalfleet.CraneVessels;

public class ShipRaid {
	
	public List<Destroyers> listOfDestroyers;
    public List<PilotShips> listOfPilotShips;
    public List<Catamaran> listOfCatamaran;
    public HashSet <CraneVessels> hashSetCraneVessels;

    public ShipRaid() {
    	listOfDestroyers = new ArrayList<>();
    	listOfPilotShips = new LinkedList<>();
    	listOfCatamaran = new ArrayList <>();
    	hashSetCraneVessels = new HashSet <> ();
    }

    public void setDestroyers(Destroyers destroyers) {
    	listOfDestroyers.add(destroyers);
    }
    public void addPilotShips(PilotShips pilotShips) {
    	listOfPilotShips.add(pilotShips);
    }
    
    public void setCatamaran(Catamaran catamaran) {
    	listOfCatamaran.add(catamaran);
    }

    public List<Destroyers> getlistOfDestroyers() {
        return listOfDestroyers;
    }

    public List<PilotShips> getlistOfPilotShips() {
        return listOfPilotShips;
    }
    
    public List<Catamaran> getlistOfCatamaran() {
        return listOfCatamaran;
    }


	public void addCraneVessels(CraneVessels craneVessels) {
		hashSetCraneVessels.add(craneVessels);
	}
	
	
	public HashSet <CraneVessels> getCraneVessels() {
		return hashSetCraneVessels;
	}
    
}


