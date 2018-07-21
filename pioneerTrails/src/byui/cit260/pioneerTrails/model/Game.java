/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Bonnie
 */
public class Game implements Serializable {

    //class instance variables
    private int time;
//    private int numPeeps;
    private Player player;
    private Wagon wagon;
    private Actor[] actors;
    private Map map;
    private Resource[] resources;
//    private Resource[] resource;
    private int currentScene;

//     double foodWeight = 0;
////    String[] listOfItems;
//    ArrayList<String> listOfItems = new ArrayList<>();
////    public static ArrayList listOfItems[];
//
//    public double getFoodWeight() {
//        return foodWeight;
//    }
//
//    public void setFoodWeight(double foodWeight) {
//        this.foodWeight = foodWeight;
//    }
//
//    public ArrayList<String> getListOfItems() {
//        return listOfItems;
//    }
//
//    public void setListOfItems(ArrayList<String> listOfItems) {
//        this.listOfItems = listOfItems;
//    }
    public int getCurrentScene() {
        return currentScene;
    }

    public void setCurrentScene(int currentScene) {
        this.currentScene = currentScene;
    }

    public Resource[] getResources() {
        return resources;
    }

    public void setResources(Resource[] resources) {
        this.resources = resources;
    }

    public Game() {
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Actor[] getActors() {
        return actors;
    }

    public void setActors(Actor[] actors) {
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

    public void setTime(int time) {
        this.time = time;
    }

//    public int getNumPeeps() {
//        return numPeeps;
//    }
//
//    public void setNumPeeps(int numPeeps) {
//        this.numPeeps = numPeeps;
//    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.time);
//        hash = 43 * hash + Objects.hashCode(this.numPeeps);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "time=" + time + '}';
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
//        if (!Objects.equals(this.numPeeps, other.numPeeps)) {
//            return false;
//        }
        return true;
    }

}
