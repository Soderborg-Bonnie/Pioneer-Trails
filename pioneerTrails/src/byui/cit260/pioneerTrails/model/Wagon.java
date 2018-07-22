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
//import java.util.TreeMap;

/**
 *
 * @author Bonnie
 */
public class Wagon implements Serializable {

    public Wagon() {
        

    }

//    public static String[] getResources;
    //class instance variables
    private boolean driveable;
    private int capacity = 2000;
    private int weight;
    public int wheelDurability = 100;
    public ArrayList<Resource> resources;
    
    
    
    
    
    

    public int getWheelDurability() {
        return wheelDurability;
    }

    public void setWheelDurability(int wheelDurability) {
        this.wheelDurability = wheelDurability;
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

    public ArrayList<Resource> getResources() {
        return resources;
    }

    public void setResources(ArrayList<Resource> resources) {
        this.resources = resources;
    }
    
    
//    public final Map<String,Resource> resources;
//
//    public Map<String,Resource> getResources() {
//        //System.out.println("getResources function" + resources);
//        return resources;
//    }
//
//    public Wagon() {
//        
//        resources = new TreeMap<>();
//        //System.out.println("wagon function" + resources);
//    }

    @Override
    public String toString() {
        return "Wagon{" + "driveable=" + driveable + ", capacity=" + capacity + ", weight=" + weight + ", wheelDurability=" + wheelDurability + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (this.driveable ? 1 : 0);
        hash = 29 * hash + this.capacity;
        hash = 29 * hash + this.weight;
        hash = 29 * hash + this.wheelDurability;
        return hash;
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
