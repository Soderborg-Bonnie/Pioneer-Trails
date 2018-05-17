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
 * @author Bonnie
 */
public class Game implements Serializable{
    //class instance variables
    private Integer time;
    private Integer numPeeps;
    private Player player;
    private Wagon wagon;
    private ArrayList<Actor> actors = new ArrayList<Actor>();

    public Game() {
    }

    public ArrayList<Actor>getActors(){
        return actors;
    }
    
    public void setActor(ArrayList<Actor> actors){
this.actors = actors;

    }
    
    public Wagon getWagon() {
        return wagon;
    }

    public void setWagon(Wagon wagon) {
        this.wagon = wagon;
    }
    
    
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    

    public int getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getNumPeeps() {
        return numPeeps;
    }

    public void setNumPeeps(Integer numPeeps) {
        this.numPeeps = numPeeps;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.time);
        hash = 43 * hash + Objects.hashCode(this.numPeeps);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "time=" + time + ", numPeeps=" + numPeeps + '}';
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.time, other.time)) {
            return false;
        }
        if (!Objects.equals(this.numPeeps, other.numPeeps)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
