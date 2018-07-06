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



//    public static Location getCurrentScene() {
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    private String name;
    private String description;
    public String symbol;
    private String difficulty;  // todo: terrainDifficulty
    private Boolean hindrance;  //todo: Illness
    private Resource resource;

    public Resource getResource() {
        return resource;
    }
    public Scene() {
    
}

    public Scene(String name, String description, String symbol,
            String difficulty, Boolean hindrance, Resource resource) {
        this.name = name;
        this.description = description;
        this.symbol = symbol;
        this.difficulty = difficulty;
        this.hindrance = hindrance;
        this.resource = resource;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void setHindrance(Boolean hindrance) {
        this.hindrance = hindrance;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
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
        
        return true;
    }

}
