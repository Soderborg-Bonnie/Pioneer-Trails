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
    private static Game scene;

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
    
    public static Scene getDifficulty(){
        return SCENES[game.getDifficulty()];
    }
    
    //Scene(String name, String description, String symbol, Integer difficulty, Boolean hindrance, Location location, Resource[] resources
    private static final Scene[] SCENES = {
        new Scene("Nauvoo","Description", "symbol", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Sugar Creek","Description", "symbol", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Chariton River Crossing","Description", "symbol", "Medium", false, new Location(), new Resource[]{}),
        new Scene("Locust Creek","Description", "symbol", "Difficult", false, new Location(), new Resource[]{}),
        new Scene("Garden Grove","Description", "symbol", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Nishnabotna River","Description", "symbol", "Medium", false, new Location(), new Resource[]{}),
        new Scene("Grand Encampment","Description", "symbol", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Council Bluffs","Description", "symbol", "Difficult", false, new Location(), new Resource[]{}),
        new Scene("Winter Quarters","Description", "symbol", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Elkhorn River Crossing","Description", "symbol", "Medium", false, new Location(), new Resource[]{}),
        new Scene("Platte River","Description", "symbol", "Medium", false, new Location(), new Resource[]{}),
        new Scene("Fort Kearny","Description", "symbol", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Confluence Point","Description", "symbol", "Medium", false, new Location(), new Resource[]{}),
        new Scene("Ash Hollow","Description", "symbol", "Difficult", false, new Location(), new Resource[]{}),
        new Scene("Chimney Rock","Description", "symbol", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Scotts Bluff","Description", "symbol", "Medium", false, new Location(), new Resource[]{}),
        new Scene("Fort Laramie","Description", "symbol", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Sweetwater River","Description", "symbol", "Difficult", false, new Location(), new Resource[]{}),
        new Scene("Independence Rock","Description", "symbol", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Fort Bridger","Description", "symbol", "Medium", false, new Location(), new Resource[]{}),
        new Scene("Echo Canyon","Description", "symbol", "Medium", false, new Location(), new Resource[]{}),
        new Scene("Golden Pass Road","Description", "symbol", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Emigration Canyon","Description", "symbol", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Zion"," You make it through the canyon. This, you hear, is the place. You can finally rest from your journey.", "symbol", "Normal", false, new Location(), new Resource[]{}),
    };

    public static boolean advanceScene() {
       int newScene = game.getCurrentScene()+1;
       if (newScene < SCENES.length) {
         game.setCurrentScene(newScene);  
       }
       
       return (newScene >= SCENES.length -1);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static String terrainDifficulty(){
        
    }
}

   
    
    
     



