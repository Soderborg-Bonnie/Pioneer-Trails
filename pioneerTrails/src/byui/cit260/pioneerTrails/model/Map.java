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
public class Map implements Serializable {

    //class instance variables
    private String description;
    private int currentRow;
    private int currentCol;
    private int totalRows;
    private int totalColumns;
    private Location[][] locations;
    private Resource[] resources;

    public Resource[] getResources() {
        return resources;
    }

    public void setResources(Resource[] resources) {
        this.resources = resources;
    }
   

    public Map() {
    }
    
    public Scene getCurrentScene() {
       return  locations[currentRow][currentCol].getScene();
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getCurrentCol() {
        return currentCol;
    }

    public void setCurrentCol(int currentCol) {
        this.currentCol = currentCol;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public int getTotalColumns() {
        return totalColumns;
    }

    public void setTotalColumns(int totalColumns) {
        this.totalColumns = totalColumns;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + Objects.hashCode(this.currentRow);
        hash = 79 * hash + Objects.hashCode(this.currentCol);
        hash = 79 * hash + Objects.hashCode(this.totalRows);
        hash = 79 * hash + Objects.hashCode(this.totalColumns);
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "description=" + description + ", currentRow=" + currentRow + ", currentCol=" + currentCol + ", totalRows=" + totalRows + ", totalColumns=" + totalColumns + '}';
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.currentRow, other.currentRow)) {
            return false;
        }
        if (!Objects.equals(this.currentCol, other.currentCol)) {
            return false;
        }
        if (!Objects.equals(this.totalRows, other.totalRows)) {
            return false;
        }
        if (!Objects.equals(this.totalColumns, other.totalColumns)) {
            return false;
        }
        return true;
    }


}
