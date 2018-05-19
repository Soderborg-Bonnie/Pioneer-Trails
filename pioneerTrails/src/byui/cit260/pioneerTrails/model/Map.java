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
    private Integer currentRow;
    private Integer currentCol;
    private Integer totalRows;
    private Integer totalColumns;
    private ArrayList<Game>games = new ArrayList<Game>();
    private ArrayList<Location> locations = new ArrayList<Location>();
    

    public Map() {
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }
    
    

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(Integer currentRow) {
        this.currentRow = currentRow;
    }

    public Integer getCurrentCol() {
        return currentCol;
    }

    public void setCurrentCol(Integer currentCol) {
        this.currentCol = currentCol;
    }

    public Integer getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
    }

    public Integer getTotalColumns() {
        return totalColumns;
    }

    public void setTotalColumns(Integer totalColumns) {
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
