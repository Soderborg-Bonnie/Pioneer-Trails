
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tyler
 */
public class Player implements Serializable{
    
    // class instance variables
    private String name;
    private Boolean aliveState;
    private ArrayList<Game> games = new ArrayList<Game>();

    public Player() {
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }
    

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAliveState() {
        return aliveState;
    }

    public void setAliveState(Boolean aliveState) {
        this.aliveState = aliveState;
        
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", aliveState=" + aliveState + '}';
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.aliveState);
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.aliveState, other.aliveState)) {
            return false;
        }
        return true;
    }
    
    
    
}
