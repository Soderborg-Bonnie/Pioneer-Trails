/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.model;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author tharman
 */
public class Location implements Serializable {

    //class instance variables
    
    private Boolean visited;
    private int stopsRemaining;
    private Map map;
    private Scene scene;   //update scene below to remove array

    public Location(Boolean visited, int stopsRemaining) {
        
        this.visited=visited;
        this.stopsRemaining=stopsRemaining;
    }
    
    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    
    public boolean isVisited() {
        return visited;
    }
  
    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    public int getStopsRemaining() {
        return stopsRemaining;
    }

    public void setStopsRemaining(int stopsRemaining) {
        this.stopsRemaining = stopsRemaining;
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
        
        hash = 71 * hash + Objects.hashCode(this.visited);
        hash = 71 * hash + Objects.hashCode(this.stopsRemaining);
        hash = 71 * hash + Objects.hashCode(this.map);
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
        final Location other = (Location) obj;
        
        
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        if (!Objects.equals(this.stopsRemaining, other.stopsRemaining)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        return true;
    }

    


}
