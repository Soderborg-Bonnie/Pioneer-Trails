/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.model;
import static byui.cit260.pioneerTrails.control.GameControl.createResources;
import java.util.Map;
import java.util.ArrayList;
import java.util.Objects;
import java.io.Serializable;
import java.util.TreeMap;

/**
 *
 * @author Bonnie
 */
public class Wagon implements Serializable {

//    public static String[] getResources;

    //class instance variables
    private boolean driveable;
    private int capacity = 2000;
    private int weight;
    private int wheel = 100;

    
   
    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public boolean isDriveable() {
        return driveable;
    }

    public void setDriveable(boolean driveable) {
        this.driveable = driveable;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public final Map<String,Resource> resources;

    public Map<String,Resource> getResources() {
        
        return resources;
    }

    public Wagon() {
        resources = new TreeMap<>();
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
