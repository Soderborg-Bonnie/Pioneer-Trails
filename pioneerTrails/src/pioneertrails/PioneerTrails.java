/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrails;

import byui.cit260.pioneerTrails.model.Actor;
import byui.cit260.pioneerTrails.model.Player;
import java.awt.Point;



public class PioneerTrails {
    
public static void TeamTest(){
        Player playerOne = new Player();
        playerOne.setName("friend of UFE");
        playerOne.setAliveState(true);
        
        String playerOneName = playerOne.getName();
        Boolean playerOneAliveState = playerOne.getAliveState();
        
        String actorOneName = Actor.Dad.getName();
        Boolean actorOneAliveState = Actor.Dad.getAliveState();
        Point actorOneCoordinates = Actor.Dad.getCoordinates();
        
        System.out.println("Player: " + playerOneName);
        System.out.println("Actor name: " + actorOneName);
        

}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TeamTest();
    }
    
}
