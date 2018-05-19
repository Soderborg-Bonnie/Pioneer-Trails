/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrails;

import byui.cit260.pioneerTrails.model.Actor;
import byui.cit260.pioneerTrails.model.Game;
import byui.cit260.pioneerTrails.model.Player;
import byui.cit260.pioneerTrails.model.Resource;
import byui.cit260.pioneerTrails.model.Wagon;
import java.awt.Point;



public class PioneerTrails {
    
public static void TeamTest(){
        Player playerOne = new Player();
        playerOne.setName("Sven");
        playerOne.setAliveState(true);
        
        Game gameOne = new Game();
        gameOne.setTime(45);
        gameOne.setNumPeeps(5);
        
        String playerOneName = playerOne.getName();
        Boolean playerOneAliveState = playerOne.getAliveState();
        
        String actorOneName = Actor.Dad.getName();
        Boolean actorOneAliveState = Actor.Dad.getAliveState();
        Point actorOneCoordinates = Actor.Dad.getCoordinates();
        
        Integer gameOneTime = gameOne.getTime();
        Integer gameOneNumPeeps = gameOne.getNumPeeps();
        
        System.out.println("Player: " + playerOneName);
        System.out.println(playerOneName + " is alive." + playerOneAliveState);
        System.out.println("Actor name: " + actorOneName);
        System.out.println(actorOneName + " is alive." + actorOneAliveState);
        System.out.println("Game time: " + gameOneTime + " minutes");
        System.out.println("How many people are along for the ride? " + gameOneNumPeeps);
        

}
public static void IndividualTestBonnie(){
    Wagon wagonOne = new Wagon();
    wagonOne.setDriveable(true);
    wagonOne.setCapacity(500);
    
    Resource resourceOne = new Resource();
    resourceOne.setWeight(3);
    resourceOne.setName("hammer");
    resourceOne.setNeed(false);
    resourceOne.setQuantity(1);
    resourceOne.setBroken(false);
    
    Boolean wagonOneDriveable = wagonOne.getDriveable();
    Integer wagonOneCapacity = wagonOne.getCapacity();
    
    Integer resourceOneWeight = resourceOne.getWeight();
    String resourceOneName = resourceOne.getName();
    Boolean resourceOneNeed = resourceOne.getNeed();
    Integer resourceOneQuantity = resourceOne.getQuantity();
    Boolean resourceOneBroken = resourceOne.getBroken();
    
    System.out.println("Wagon is driveable. " + wagonOneDriveable);
    System.out.println("Wagon can carry " + wagonOneCapacity + " pounds.");
    System.out.println("Our resource is: " + resourceOneName);
    System.out.println("We have " + resourceOneQuantity + " " + resourceOneName);
    System.out.println("Our " + resourceOneName + " weighs " + resourceOneWeight + " pounds.");
    System.out.println("Our " + resourceOneName + " is broken: " + resourceOneBroken);
    
    
    
            
        }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TeamTest();
        IndividualTestBonnie();
    }
    
}
