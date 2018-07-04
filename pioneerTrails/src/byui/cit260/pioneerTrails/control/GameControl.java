/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.control;

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
    public static int createNewGame() {
        if (PioneerTrails.getPlayer() == null) {
            return -1;
        }

//    public static void createNewGame(Player player) {
        Game game = new Game();
        PioneerTrails.setCurrentGame(game);
        //game.setCurrentLocation(0);

//        Player player = new Player();
        game.setPlayer(PioneerTrails.getPlayer());

        Resource[] resources = createResources();

        Actor[] actors = createActors();
        game.setActors(actors);

        Map map = MapControl.createMap(5, 5, resources);
        Scene[] scenes = createScenes();
        assignScenesToLocations(scenes, map.getLocations());
        game.setMap(map);
        return 0;
    }

    private static Resource[] createResources() {
        Resource[] resources = new Resource[7];
        resources[0] = new Resource("Hammer", 1, 10);
        resources[1] = new Resource("Bullets", 50, 50);
        resources[2] = new Resource("Wheel", 1, 100);
        resources[3] = new Resource("Food", 1, 450);
        resources[4] = new Resource("Axe", 1, 15);
        resources[5] = new Resource("Wood", 10, 50);
        resources[6] = new Resource("Water", 1, 450);
        return resources;
    }

    public static Actor[] createActors() {
        Actor[] actors = new Actor[5];
        actors[0] = new Actor("Dad", true);
        actors[1] = new Actor("Mom", true);
        actors[2] = new Actor("Child1", true);
        actors[3] = new Actor("Child2", true);
        actors[4] = new Actor("Child3", true);
        return actors;
    }

    public static AcquireFood createAcquireFood() {
        AcquireFood acquireFood = new AcquireFood();
        acquireFood.setAcquireFood();
        return new AcquireFood();
    }

    public static Scene getCurrentScene() {
        return PioneerTrails.getCurrentGame().getMap().getCurrentScene();
    }

    public static Scene[] createScenes() { //take out location from Scene
        Scene[] scenes = new Scene[25];
        Resource[] resources = PioneerTrails.getCurrentGame().getMap().getResources();
        scenes[0] = new Scene("Nauvoo", "The City of Joseph", "NV", "Normal", false, resources[0]);
//        new Scene("Sugar Creek", "The Little Switzerland of Ohio", "SC", "Normal", false, null),
//        new Scene("Chariton River Crossing", "called Missouri's Grand Divide", "CC", "Medium", false, null),
//        new Scene("Locust Creek", "where 'Come, Come Ye Saints' was written", "LC", "Difficult", false, null),
//        new Scene("Garden Grove", "there are wild onions as far as the eye can see", "GG", "Normal", false, null),
//        new Scene("Nishnabotna River", "Be on the lookout for the Pottawattamie Indians", "NR", "Medium", false, null),
//        new Scene("Grand Encampment", "This broad, open area looks like a great stopping place as you approach the Missouri River.", "GE", "Normal", false, null),
//        new Scene("Council Bluffs", "Here, Colonel Allen of the US Army conscripted 500 tired pioneers to fight in the war against Mexico", "CB", "Difficult", false, null),
//        new Scene("Winter Quarters", "temporary headquarters of the Church for less than a year", "WQ", "Normal", false, null),
//        new Scene("Elkhorn River Crossing", "one of the major river crossings faced by westbound immigrants", "ER", "Medium", false, null),
//        new Scene("Platte River", "was given its name by the Otoe people, meaning flat water", "PR", "Medium", false, null),
//        new Scene("Fort Kearny", "a safe haven in this new and hostile land", "FK", "Normal", false, null),
//        new Scene("Confluence Point", "birthplace of the roadometer", "CP", "Medium", false, null),
//        new Scene("Ash Hollow", "It's a steep drop down from here with a 25 degree angle for 300 feet", "AH", "Difficult", false, null),
//        new Scene("Chimney Rock", "a prominent geological rock formation that serves as landmark along the trail", "CR", "Normal", false, null),
//        new Scene("Scottsbluff", "which gets it's namesake from a bluff overlooking the North Platt River", "SB", "Medium", false, null),
//        new Scene("Fort Laramie", "was named Fort William, then Fort John, before Fort Laramie", "FL", "Normal", false, null),
//        new Scene("Sweetwater River", "the easiest pass across the Atlantic and Pacific drainages", "SR", "Difficult", false, null),
//        new Scene("Independence Rock", "known as the Register of the Desert", "IR", "Normal", false, new Location(0,0,false,6), new Resource[]{}),
//        new Scene("Fort Bridger", "named after Jim Bridger, the Daniel Boone of the Rockies", "FB", "Medium", false, null),
//        new Scene("Echo Canyon", "the oldest trail out of Zion Canyon", "EC", "Medium", false, null),
//        new Scene("Golden Pass Road", "known as Parley's Canyon", "GP", "Normal", false, null),
//        new Scene("Emigration Canyon", "Brigham Young - 'This is the right place. Drive on.'", "EM", "Normal", false, null),
//        new Scene("Zion", " You make it through the canyon. This, you hear, is the place. You can finally rest from your journey.", "ZZ", "Normal", false, null);
        return scenes;
    }

    public static boolean advanceLocation() {
        Map map = PioneerTrails.getCurrentGame().getMap();
        if (map.getCurrentCol() >= map.getTotalColumns() - 1) {
            if (map.getCurrentRow() >= map.getTotalRows() - 1) {
                return false;
            } else {
                map.setCurrentRow(map.getCurrentRow() + 1);
                map.setCurrentCol(0);
            }
        } else {
            map.setCurrentCol(map.getCurrentCol() + 1);
        }
        return true;
    }

    private static void assignScenesToLocations(Scene[] scenes, Location[][] locations) {
        locations[0][0].setScene(scenes[0]);
    }

}
