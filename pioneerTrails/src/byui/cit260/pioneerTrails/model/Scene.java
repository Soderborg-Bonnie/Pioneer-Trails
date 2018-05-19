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
public class Scene implements Serializable {
    
    private String name;
    private String description;
    private String symbol;
    private Integer difficulty;
    private Boolean hindrance;
    private ArrayList<Location> locations = new ArrayList<Location>();
    private Resource resource;

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }
    
    

    public Scene() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public Boolean getHindrance() {
        return hindrance;
    }

    public void setHindrance(Boolean hindrance) {
        this.hindrance = hindrance;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.name);
        hash = 19 * hash + Objects.hashCode(this.description);
        hash = 19 * hash + Objects.hashCode(this.symbol);
        hash = 19 * hash + Objects.hashCode(this.difficulty);
        hash = 19 * hash + Objects.hashCode(this.hindrance);
        hash = 19 * hash + Objects.hashCode(this.locations);
        return hash;
    }

    @Override
    public String toString() {
        return "Scene{" + "name=" + name + ", description=" + description + ", symbol=" + symbol + ", difficulty=" + difficulty + ", hindrance=" + hindrance + ", locations=" + locations + '}';
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        if (!Objects.equals(this.difficulty, other.difficulty)) {
            return false;
        }
        if (!Objects.equals(this.hindrance, other.hindrance)) {
            return false;
        }
        if (!Objects.equals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
