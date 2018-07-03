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
    private int row;
    private int column;
    private Boolean visited;
    private int stopsRemaining;
    private Map map;
    private ArrayList<Scene> scenes = new ArrayList<>();

    public Location(int row, int column, Boolean visited, int stopsRemaining) {
        this.row= row;
        this.column=column;
        this.visited=visited;
        this.stopsRemaining=stopsRemaining;
    }
    
    public ArrayList<Scene> getScenes() {
        return scenes;
    }

    public void setScenes(ArrayList<Scene> scenes) {
        this.scenes = scenes;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Boolean getVisited() {
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
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", stopsRemaining=" + stopsRemaining + ", map=" + map + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.row);
        hash = 71 * hash + Objects.hashCode(this.column);
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
        if (!Objects.equals(this.row, other.row)) {
            return false;
        }
        if (!Objects.equals(this.column, other.column)) {
            return false;
        }
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

    public boolean isVisited() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getScene() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
