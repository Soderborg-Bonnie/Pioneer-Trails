/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrails;

import byui.cit260.pioneerTrails.model.Actor;
import byui.cit260.pioneerTrails.model.Game;
import byui.cit260.pioneerTrails.model.Location;
import byui.cit260.pioneerTrails.model.Map;
import byui.cit260.pioneerTrails.model.Player;
import byui.cit260.pioneerTrails.model.Resource;
import byui.cit260.pioneerTrails.model.Scene;
import byui.cit260.pioneerTrails.model.Wagon;
import byui.cit260.pioneerTrails.model.Illness;
import byui.cit260.pioneerTrails.model.QuestionScene;
import java.awt.Point;



public class PioneerTrails {

    private static Object actorOne;
    
public static void TeamTest(){
        Player playerOne = new Player();
        playerOne.setName("Sven");
        playerOne.setAliveState(true);
        
        Game gameOne = new Game();
        gameOne.setTime(45);
        gameOne.setNumPeeps(5);
        
        String playerOneName = playerOne.getName();
        Boolean playerOneAliveState = playerOne.getAliveState();
        
        Actor actorOne = new Actor();
        actorOne.setName("Child3");
        actorOne.setAliveState(true);
        
        
        String actorOneName = actorOne.getName();
        Boolean actorOneAliveState = actorOne.getAliveState();
       
        Integer gameOneTime = gameOne.getTime();
        Integer gameOneNumPeeps = gameOne.getNumPeeps();
        
        //System.out.println("Player: " + playerOneName);
        //System.out.println(playerOneName + " is alive." + playerOneAliveState);
        //System.out.println("Actor name: " + actorOneName);
        //System.out.println(actorOneName + " is alive." + actorOneAliveState);
        //System.out.println("Game time: " + gameOneTime + " minutes");
        //System.out.println("How many people are along for the ride? " + gameOneNumPeeps);
        System.out.println(gameOne.toString());
        System.out.println(playerOne.toString());
        System.out.println(actorOne.toString());
        //System.out.println("Actor name: " + actorOneName + " & " + actorOneName " is alive: " + actorOneAliveState);
        

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
    
    //System.out.println("Wagon is driveable. " + wagonOneDriveable);
    //System.out.println("Wagon can carry " + wagonOneCapacity + " pounds.");
    //System.out.println("Our resource is: " + resourceOneName);
    //System.out.println("We have " + resourceOneQuantity + " " + resourceOneName);
    //System.out.println("Our " + resourceOneName + " weighs " + resourceOneWeight + " pounds.");
    //System.out.println("Our " + resourceOneName + " is broken: " + resourceOneBroken);
    System.out.println(wagonOne.toString());
    System.out.println(resourceOne.toString());
    
    
            
        }

public static void IndividualTestTyler(){
    Map mapOne = new Map();
    mapOne.setDescription("Game Map");
    mapOne.setCurrentRow(1);
    mapOne.setCurrentCol(4);
    mapOne.setTotalRows(6);
    mapOne.setTotalColumns(6);
    
    Location locationOne = new Location();
    locationOne.setRow(3);
    locationOne.setColumn(6);
    locationOne.setVisited(true);
    locationOne.setStopsRemaining(12);
    
    Scene sceneOne = new Scene();
    sceneOne.setName("Green River");
    sceneOne.setDescription("a quaint little town.");
    sceneOne.setSymbol("<<");
    sceneOne.setDifficulty(3);
    sceneOne.setHindrance(true);
    
    
    String mapOneDescription = mapOne.getDescription();
    Integer mapOneCurrentRow = mapOne.getCurrentRow();
    Integer mapOneCurrentCol = mapOne.getCurrentCol();
    Integer mapOneTotalRows = mapOne.getTotalRows();
    Integer mapOneTotalColumns = mapOne.getTotalColumns();
    
    Integer locationOneRow = locationOne.getRow();
    Integer locationOneColumn = locationOne.getColumn();
    Boolean locationOneVisited = locationOne.getVisited();
    Integer locationOneStopsRemaining = locationOne.getStopsRemaining();
    
    String sceneOneName = sceneOne.getName();
    String sceneOneDescription = sceneOne.getDescription();
    String sceneOneSymbol = sceneOne.getSymbol();
    Integer sceneOneDifficulty = sceneOne.getDifficulty();
    Boolean sceneOneHindrance = sceneOne.getHindrance();
    
    //System.out.println("Welcome to the" + mapOneDescription + ".");
    //System.out.println("You are located at row " + mapOneCurrentRow + " and column " + mapOneCurrentCol + ".");
    //System.out.println("There are " + mapOneTotalRows + " rows and " + mapOneTotalColumns + " columns.");
    //System.out.println("This location is on row " + locationOneRow + ".");
    //System.out.println("This location is on column " + locationOneColumn + ".");
    //System.out.println("You have been here before: " + locationOneVisited + ".");
    //System.out.println("You have " + locationOneStopsRemaining + " stops remaining.");
    //System.out.println("Welcome to " + sceneOneName + "," + sceneOneDescription + ".");
    //System.out.println("The symbol for this location is " + sceneOneSymbol + ".");
    //System.out.println("This location has a difficulty rating of " + sceneOneDifficulty + ".");
    //System.out.println("You will be hindered in your journey: " + sceneOneHindrance + ".");
    System.out.println(mapOne.toString());
    System.out.println(locationOne.toString());
    System.out.println(sceneOne.toString());
    
    
    
}

public static void IndividualTestTamlyn(){
 System.out.println(Illness.Fever.getType());
 System.out.println(Illness.Fever.getTreatment());
 System.out.println(Illness.Fever.getMortalityRate());
 
 System.out.println(Illness.Hypothermia.getType());
 System.out.println(Illness.Hypothermia.getTreatment());
 System.out.println(Illness.Hypothermia.getMortalityRate());
 
 System.out.println(Illness.Snake_Bite.getType());
 System.out.println(Illness.Snake_Bite.getTreatment());
 System.out.println(Illness.Snake_Bite.getMortalityRate());
 
 System.out.println(Illness.Broken_Bone.getType());
 System.out.println(Illness.Broken_Bone.getTreatment());
 System.out.println(Illness.Broken_Bone.getMortalityRate());
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TeamTest();
        IndividualTestBonnie();
        IndividualTestTyler();
        IndividualTestTamlyn();
    }
    
}
