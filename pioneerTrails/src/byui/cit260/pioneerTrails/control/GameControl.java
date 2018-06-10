/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.control;

import byui.cit260.pioneerTrails.model.Player;
import pioneertrails.PioneerTrails;

/**
 *
 * @author tyler
 */
public class GameControl {
    public static Player savePlayer(String playersName){   
        if (playersName.length() < 1) {
            return null;
        }
        Player player = new Player();
        player.setName(playersName);
        PioneerTrails.setPlayer(player);
         return new Player();
    }
    
    public static void createNewGame(Player player) {
        System.out.println("Test creating new game.");
    }
   
}