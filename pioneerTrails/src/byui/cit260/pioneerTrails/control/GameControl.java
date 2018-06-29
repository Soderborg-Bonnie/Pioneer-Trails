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

    //private static Game scene;

    public static Player savePlayer(String playersName) {
        if (playersName.length() < 1) {
            return null;
        }
        Player player = new Player();
        player.setName(playersName);
        PioneerTrails.setPlayer(player);
        return new Player();
    }
    
/*    public static int createNewGame(Player player) {
    if (player == null)
        return -1
    
    game = create a new Game object
    Save a reference to the Player object in the game
    Save a reference to the game in the main class
    
    actors = createActors()
    Save the list of actors in the Game object
    Assign an actor to the player
    
    items = createItems()
    Save the list of items in the game
    
    map = createMap(noOfRows, noOfColumns, items)
    IF map == null THEN
        RETURN -1
    ENDIF
    
    Assign the map to the game
    RETURN 1 // indicates success
    
}*/
    public static int createNewGame(Player player){
        if (player == null)
            return -1;
    
//    public static void createNewGame(Player player) {
        Game game = new Game();
        PioneerTrails.setCurrentGame(game);
        game.setCurrentScene(0);
        
//        Player player = new Player();
        game.setPlayer(player);
        
        Resource resources = new Resource();
        game.setName();
        
        Actor actors = new Actor();
        game.setName();
        
        Map map = new Map();
        game.setMap();
        return 0;
    }
    
    public static Resource createItems(String name) {
        Resource resources = new Resource();
//        resources.setName(name);
        return new Resource();
    }
//    
//    
//    public static Actor[] createActors() {
//           Actor actors = new Actor();
////           ArrayList<Actor>actors=
//           Actor[0]={"Dad",true};
//           actors[1]=("Mom",true);
//           actors[2]=("kid1",true);
//           actors[3]=("kid2",true);
//           actors[4]=("kid3",true);
//        
//           
//           
//           
//    }
    
    public static Map createMap() {
            Map map = new Map(); 
            map.setMap();
            return new Map();
    }
                

//    public static Scene getCurrentScene() {
//        return SCENES[PioneerTrails.getCurrentGame().getCurrentScene()];
//    }

    //Scene(String name, String description, String symbol, Integer difficulty, Boolean hindrance, Location location, Resource[] resources
    /*private static final Scene[] SCENES = {
        new Scene("Nauvoo", "Description", "symbol", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Sugar Creek", "Description", "symbol", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Chariton River Crossing", "Description", "symbol", "Medium", false, new Location(), new Resource[]{}),
        new Scene("Locust Creek", "Description", "symbol", "Difficult", false, new Location(), new Resource[]{}),
        new Scene("Garden Grove", "Description", "symbol", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Nishnabotna River", "Description", "symbol", "Medium", false, new Location(), new Resource[]{}),
        new Scene("Grand Encampment", "Description", "symbol", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Council Bluffs", "Description", "symbol", "Difficult", false, new Location(), new Resource[]{}),
        new Scene("Winter Quarters", "Description", "symbol", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Elkhorn River Crossing", "Description", "symbol", "Medium", false, new Location(), new Resource[]{}),
        new Scene("Platte River", "Description", "symbol", "Medium", false, new Location(), new Resource[]{}),
        new Scene("Fort Kearny", "Description", "symbol", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Confluence Point", "Description", "symbol", "Medium", false, new Location(), new Resource[]{}),
        new Scene("Ash Hollow", "Description", "symbol", "Difficult", false, new Location(), new Resource[]{}),
        new Scene("Chimney Rock", "Description", "symbol", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Scotts Bluff", "Description", "symbol", "Medium", false, new Location(), new Resource[]{}),
        new Scene("Fort Laramie", "Description", "symbol", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Sweetwater River", "Description", "symbol", "Difficult", false, new Location(), new Resource[]{}),
        new Scene("Independence Rock", "Description", "symbol", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Fort Bridger", "Description", "symbol", "Medium", false, new Location(), new Resource[]{}),
        new Scene("Echo Canyon", "Description", "symbol", "Medium", false, new Location(), new Resource[]{}),
        new Scene("Golden Pass Road", "Description", "symbol", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Emigration Canyon", "Description", "symbol", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Zion", " You make it through the canyon. This, you hear, is the place. You can finally rest from your journey.", "symbol", "Normal", false, new Location(), new Resource[]{}),};
*/
//    public static boolean advanceScene() {
//        int newScene = PioneerTrails.getCurrentGame().getCurrentScene() + 1;
//        if (newScene < SCENES.length) {
//            PioneerTrails.getCurrentGame().setCurrentScene(newScene);
//        }
//
//        return (newScene >= SCENES.length - 1);
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public static void createNewGame() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
