/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tyler
 */
public class Game implements Serializable {
    
    //class instance variables
    private int totalTime;
    private int numPeeps;
    private Player player;

    public Game() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    
    

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public int getNumPeeps() {
        return numPeeps;
    }

    public void setNumPeeps(int numPeeps) {
        this.numPeeps = numPeeps;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", numPeeps=" + numPeeps + '}';
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.totalTime;
        hash = 79 * hash + this.numPeeps;
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
        final Game other = (Game) obj;
        if (this.totalTime != other.totalTime) {
            return false;
        }
        if (this.numPeeps != other.numPeeps) {
            return false;
        }
        return true;
    }
    
    
    
    
}
