/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.model;

import java.util.ArrayList;
import java.util.Objects;
import pioneertrails.PioneerTrails;

/**
 *
 * @author tharman
 */
public class Scene implements Serializable {

    private String name;
    private String description;
    private String symbol;
    private String difficulty;  // todo: terrainDifficulty
    private Boolean hindrance;  //todo: Illness
    private Location location;  //todo: coords
    private Resource[] resources;

    public Resource[] getResources() {
        return resources;
    }

    public Scene(String name, String description, String symbol,
            String difficulty, Boolean hindrance, Location location, Resource[] resources) {
        this.name = name;
        this.description = description;
        this.symbol = symbol;
        this.difficulty = difficulty;
        this.hindrance = hindrance;
        this.location = location;
        this.resources = resources;

    }

    

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public Boolean getHindrance() {
        return hindrance;
    }

    public Location getLocations() {
        return location;
    }

    @Override
    public String toString() {
        return "Scene{" + "name=" + name + ", description=" + description + ", symbol=" + symbol + ", difficulty=" + difficulty + ", hindrance=" + hindrance + ", location=" + location + '}';
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
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }

}
