/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.model;

import java.awt.Point;


/**
 *
 * @author Bonnie
 */
public enum Actor implements Serializable{
    Dad("Dad", true, new Point(1,1)),
    Mom("Mom", true, new Point(0,1)),
    Child1("Child1", true, new Point(1,2)),
    Child2("Child2", true, new Point(2,3)),
    Child3("Child3", true, new Point(3,4));
        
    private String name;
    private Boolean aliveState;
    private Point coordinates;
    private Player player;
    private Game game;
 
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    
    
    
    public String getName() {
        return name;
    }

    public Boolean getAliveState() {
        return aliveState;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", aliveState=" + aliveState + ", coordinates=" + coordinates + '}';
    }
    
    
   
    Actor(String name, Boolean aliveState, Point coordinates){
        this.name = name;
        this.aliveState = aliveState;
        this.coordinates = coordinates;
        
}
    
}
