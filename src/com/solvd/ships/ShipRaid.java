package com.solvd.ships;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.solvd.ships.auxiliary.PilotShips;
import com.solvd.ships.military.Destroyers;
import com.solvd.ships.transport.�atamaran;


public class ShipRaid {
	
	private List<Destroyers> listOfDestroyers;
    private List<PilotShips> listOfPilotShips;
    private List<�atamaran> listOfCatamaran;

    public ShipRaid() {
    	listOfDestroyers = new ArrayList<>();
    	listOfPilotShips = new LinkedList<>();
    	listOfCatamaran = new ArrayList <>();
    }

    public void setDestroyers(Destroyers destroyers) {
    	listOfDestroyers.add(destroyers);
    }
    public void addPilotShips(PilotShips pilotShips) {
    	listOfPilotShips.add(pilotShips);
    }
    
    public void setCatamaran(�atamaran catamaran) {
    	listOfCatamaran.add(catamaran);
    }

    public List<Destroyers> getlistOfDestroyers() {
        return listOfDestroyers;
    }

    public List<PilotShips> getlistOfPilotShips() {
        return listOfPilotShips;
    }
    
    public List<�atamaran> getlistOfCatamaran() {
        return listOfCatamaran;
    }
    
}


