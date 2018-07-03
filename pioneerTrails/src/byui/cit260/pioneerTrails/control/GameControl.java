/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.control;

import static byui.cit260.pioneerTrails.control.GameControl.SCENES;
import byui.cit260.pioneerTrails.model.*;
import byui.cit260.pioneerTrails.view.AcquireFood;
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
    public static int createNewGame(){
        if (PioneerTrails.getPlayer() == null)
            return -1;
    
//    public static void createNewGame(Player player) {
        Game game = new Game();
        PioneerTrails.setCurrentGame(game);
        game.setCurrentScene(0);
        
//        Player player = new Player();
        game.setPlayer(PioneerTrails.getPlayer());
        
        Resource resources = new Resource();
        
        
        Actor[] actors = createActors();
        game.setActors(actors);
        
        
        Map map = new Map();
        game.setMap(map);
        return 0;
    }
    
    private static Resource[] createResources() {
        Resource[] resources = new Resource[7];
        resources[0] = new Resource("Hammer",1,10);
        resources[1] = new Resource("Bullets", 50, 50);
        resources[2] = new Resource("Wheel", 1, 100);
        resources[3] = new Resource("Food", 1,450 );
        resources[4] = new Resource("Axe", 1,15);
        resources[5] = new Resource("Wood", 10, 50);
        resources[6] = new Resource("Water", 1, 450);
    return resources;
    }

    
    public static Actor[] createActors() {
        Actor[] actors = new Actor[5];
        actors[0] = new Actor("Dad", true);
        actors[1] =new Actor("Mom", true);
        actors[2] =new Actor("Child1", true);
        actors[3] =new Actor("Child2", true);
        actors[4] =new Actor("Child3", true);
        return actors;
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
    public static AcquireFood createAcquireFood(){
            AcquireFood acquireFood = new AcquireFood();
            acquireFood.setAcquireFood();
            return new AcquireFood();
    }            

    public static Scene getCurrentScene() {
        return SCENES[PioneerTrails.getCurrentGame().getCurrentScene()];
    }
    

    public static final Scene[] SCENES = {
        new Scene("Nauvoo", "The City of Joseph", "NV", "Normal", false, new Location(0,0,false,24), new Resource[]{}),
        new Scene("Sugar Creek", "The Little Switzerland of Ohio", "SC", "Normal", false, new Location(0,0,false,23), new Resource[]{}),
        new Scene("Chariton River Crossing", "called Missouri's Grand Divide", "CC", "Medium", false, new Location(0,0,false,22), new Resource[]{}),
        new Scene("Locust Creek", "where 'Come, Come Ye Saints' was written", "LC", "Difficult", false, new Location(0,0,false,21), new Resource[]{}),
        new Scene("Garden Grove", "there are wild onions as far as the eye can see", "GG", "Normal", false, new Location(0,0,false,20), new Resource[]{}),
        new Scene("Nishnabotna River", "Be on the lookout for the Pottawattamie Indians", "NR", "Medium", false, new Location(0,0,false,19), new Resource[]{}),
        new Scene("Grand Encampment", "This broad, open area looks like a great stopping place as you approach the Missouri River.", "GE", "Normal", false, new Location(0,0,false,18), new Resource[]{}),
        new Scene("Council Bluffs", "Here, Colonel Allen of the US Army conscripted 500 tired pioneers to fight in the war against Mexico", "CB", "Difficult", false, new Location(0,0,false,17), new Resource[]{}),
        new Scene("Winter Quarters", "temporary headquarters of the Church for less than a year", "WQ", "Normal", false, new Location(0,0,false,16), new Resource[]{}),
        new Scene("Elkhorn River Crossing", "one of the major river crossings faced by westbound immigrants", "ER", "Medium", false, new Location(0,0,false,15), new Resource[]{}),
        new Scene("Platte River", "was given its name by the Otoe people, meaning flat water", "PR", "Medium", false, new Location(0,0,false,14), new Resource[]{}),
        new Scene("Fort Kearny", "a safe haven in this new and hostile land", "FK", "Normal", false, new Location(0,0,false,13), new Resource[]{}),
        new Scene("Confluence Point", "birthplace of the roadometer", "CP", "Medium", false, new Location(0,0,false,12), new Resource[]{}),
        new Scene("Ash Hollow", "It's a steep drop down from here with a 25 degree angle for 300 feet", "AH", "Difficult", false, new Location(0,0,false,11), new Resource[]{}),
        new Scene("Chimney Rock", "a prominent geological rock formation that serves as landmark along the trail", "CR", "Normal", false, new Location(0,0,false,10), new Resource[]{}),
        new Scene("Scottsbluff", "which gets it's namesake from a bluff overlooking the North Platt River", "SB", "Medium", false, new Location(0,0,false,9), new Resource[]{}),
        new Scene("Fort Laramie", "was named Fort William, then Fort John, before Fort Laramie", "FL", "Normal", false, new Location(0,0,false,8), new Resource[]{}),
        new Scene("Sweetwater River", "the easiest pass across the Atlantic and Pacific drainages", "SR", "Difficult", false, new Location(0,0,false,7), new Resource[]{}),
        new Scene("Independence Rock", "known as the Register of the Desert", "IR", "Normal", false, new Location(0,0,false,6), new Resource[]{}),
        new Scene("Fort Bridger", "named after Jim Bridger, the Daniel Boone of the Rockies", "FB", "Medium", false, new Location(0,0,false,5), new Resource[]{}),
        new Scene("Echo Canyon", "the oldest trail out of Zion Canyon", "EC", "Medium", false, new Location(0,0,false,4), new Resource[]{}),
        new Scene("Golden Pass Road", "known as Parley's Canyon", "GP", "Normal", false, new Location(0,0,false,3), new Resource[]{}),
        new Scene("Emigration Canyon", "Brigham Young - 'This is the right place. Drive on.'", "EM", "Normal", false, new Location(0,0,false,2), new Resource[]{}),
        new Scene("Zion", " You make it through the canyon. This, you hear, is the place. You can finally rest from your journey.", "ZZ", "Normal", false, new Location(0,0,false,1), new Resource[]{}),};

    public static boolean advanceScene() {
        int newScene = PioneerTrails.getCurrentGame().getCurrentScene() + 1;
        if (newScene < SCENES.length) {
            PioneerTrails.getCurrentGame().setCurrentScene(newScene);
        }

        return (newScene >= SCENES.length - 1);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    
}
