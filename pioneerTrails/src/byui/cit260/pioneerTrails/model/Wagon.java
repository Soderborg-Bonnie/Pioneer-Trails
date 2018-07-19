/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.model;

import java.util.ArrayList;
import java.util.Objects;
import java.io.Serializable;

/**
 *
 * @author Bonnie
 */
public class Wagon implements Serializable {

    //class instance variables
    private Boolean driveable;
    private Integer capacity;
    private Game game;
    private ArrayList<Resource> resources;

    public ArrayList<Resource> getResources() {
        return resources;
    }

    public Wagon() {
        resources = new ArrayList<Resource>();
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Boolean getDriveable() {
        return driveable;
    }

    public void setDriveable(Boolean driveable) {
        this.driveable = driveable;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.driveable);
        hash = 37 * hash + Objects.hashCode(this.capacity);
        return hash;
    }

    @Override
    public String toString() {
        return "Wagon{" + "driveable=" + driveable + ", capacity=" + capacity + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Wagon other = (Wagon) obj;
        if (!Objects.equals(this.driveable, other.driveable)) {
            return false;
        }
        if (!Objects.equals(this.capacity, other.capacity)) {
            return false;
        }
        return true;
    }

}
