/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Bonnie
 */
public class Actor implements Serializable {
    //Dad("Dad", true, new Point(1,1)),
    //Mom("Mom", true, new Point(0,1)),
    //Child1("Child1", true, new Point(1,2)),
    //Child2("Child2", true, new Point(2,3)),
    //Child3("Child3", true, new Point(3,4));

    //class instance variables
    private String name;
    private Boolean aliveState;
    //private Player player;
    //private Game game;

    /*public Actor() {
    }*/
    public Actor(String name, Boolean aliveState) {
        this.name = name;
        this.aliveState = aliveState;
    }
    

    public Actor() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        

//    public Game getGame() {
//        return game;
//    }
//
//    public void setGame(Game game) {
//        this.game = game;
//    }
//
//    public Player getPlayer() {
//        return player;
//    }
//
//    public void setPlayer(Player player) {
//        this.player = player;
//    }

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
        return "Actor{" + "name=" + name + ", aliveState=" + aliveState + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + Objects.hashCode(this.aliveState);
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
        final Actor other = (Actor) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.aliveState, other.aliveState)) {
            return false;
        }

        return true;
    }

}
