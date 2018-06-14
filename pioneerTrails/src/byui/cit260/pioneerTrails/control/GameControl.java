/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.control;

import byui.cit260.pioneerTrails.model.*;
import java.util.ArrayList;
import pioneertrails.PioneerTrails;

/**
 *
 * @author tyler
 */
public class GameControl {
    
    private static Game game;

    public static Player savePlayer(String playersName) {
        if (playersName.length() < 1) {
            return null;
        }
        Player player = new Player();
        player.setName(playersName);
        PioneerTrails.setPlayer(player);
        return new Player();
    }

    public static void createNewGame() {
        game = new Game();
    }
    
    public static Scene getCurrentScene(){
     return SCENES[game.getCurrentScene()];   
    }
    
    private static final Scene[] SCENES = {
        new Scene("Nauvoo","Description", "symbol", 10, false, new Location(), new Resource[]{}),
        new Scene("jbsdfjb","Description", "symbol", 10, false, new Location(), new Resource[]{}),
        new Scene("1","Description", "symbol", 10, false, new Location(), new Resource[]{}),
        new Scene("2","Description", "symbol", 10, false, new Location(), new Resource[]{}),
        new Scene("3","Description", "symbol", 10, false, new Location(), new Resource[]{}),
        new Scene("4","Description", "symbol", 10, false, new Location(), new Resource[]{}),
        new Scene("5","Description", "symbol", 10, false, new Location(), new Resource[]{})
    };

    public static boolean advanceScene() {
       int newScene = game.getCurrentScene()+1;
       if (newScene < SCENES.length) {
         game.setCurrentScene(newScene);  
       }
       
       return (newScene >= SCENES.length -1);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
     


}
