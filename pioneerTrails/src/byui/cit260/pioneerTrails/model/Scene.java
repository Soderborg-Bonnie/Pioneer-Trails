/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.model;

import java.util.ArrayList;
import java.util.Objects;
import pioneertrails.PioneerTrails;

/**
 *
 * @author tharman
 */
public class Scene implements Serializable {

    private String name;
    private String description;
    private String symbol;
    private String difficulty;  // todo: terrainDifficulty
    private Boolean hindrance;  //todo: Illness
    private Location location;  //todo: coords
    private Resource[] resources;

    public Resource[] getResources() {
        return resources;
    }

    public Scene(String name, String description, String symbol,
            String difficulty, Boolean hindrance, Location location, Resource[] resources) {
        this.name = name;
        this.description = description;
        this.symbol = symbol;
        this.difficulty = difficulty;
        this.hindrance = hindrance;
        this.location = location;
        this.resources = resources;

    }

    public static Scene getCurrentScene() {
        return SCENES[PioneerTrails.getCurrentGame().getCurrentScene()];
    }
    private static final Scene[] SCENES = {
        new Scene("Nauvoo", "The City of Joseph", "NV", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Sugar Creek", "The Little Switzerland of Ohio", "SC", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Chariton River Crossing", "called Missouri's Grand Divide", "CC", "Medium", false, new Location(), new Resource[]{}),
        new Scene("Locust Creek", "where 'Come, Come Ye Saints' was written", "LC", "Difficult", false, new Location(), new Resource[]{}),
        new Scene("Garden Grove", "there are wild onions as far as the eye can see", "GG", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Nishnabotna River", "Be on the lookout for the Pottawattamie Indians", "NR", "Medium", false, new Location(), new Resource[]{}),
        new Scene("Grand Encampment", "This broad, open area looks like a great stopping place as you approach the Missouri River.", "GE", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Council Bluffs", "Here, Colonel Allen of the US Army conscripted 500 tired pioneers to fight in the war against Mexico", "CB", "Difficult", false, new Location(), new Resource[]{}),
        new Scene("Winter Quarters", "temporary headquarters of the Church for less than a year", "WQ", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Elkhorn River Crossing", "one of the major river crossings faced by westbound immigrants", "ER", "Medium", false, new Location(), new Resource[]{}),
        new Scene("Platte River", "was given its name by the Otoe people, meaning flat water", "PR", "Medium", false, new Location(), new Resource[]{}),
        new Scene("Fort Kearny", "a safe haven in this new and hostile land", "FK", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Confluence Point", "birthplace of the roadometer", "CP", "Medium", false, new Location(), new Resource[]{}),
        new Scene("Ash Hollow", "It's a steep drop down from here with a 25 degree angle for 300 feet", "AH", "Difficult", false, new Location(), new Resource[]{}),
        new Scene("Chimney Rock", "a prominent geological rock formation that serves as landmark along the trail", "CR", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Scottsbluff", "which gets it's namesake from a bluff overlooking the North Platt River", "SB", "Medium", false, new Location(), new Resource[]{}),
        new Scene("Fort Laramie", "was named Fort William, then Fort John, before Fort Laramie", "FL", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Sweetwater River", "the easiest pass across the Atlantic and Pacific drainages", "SR", "Difficult", false, new Location(), new Resource[]{}),
        new Scene("Independence Rock", "known as the Register of the Desert", "IR", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Fort Bridger", "named after Jim Bridger, the Daniel Boone of the Rockies", "FB", "Medium", false, new Location(), new Resource[]{}),
        new Scene("Echo Canyon", "the oldest trail out of Zion Canyon", "EC", "Medium", false, new Location(), new Resource[]{}),
        new Scene("Golden Pass Road", "known as Parley's Canyon", "GP", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Emigration Canyon", "Brigham Young - 'This is the right place. Drive on.'", "EM", "Normal", false, new Location(), new Resource[]{}),
        new Scene("Zion", " You make it through the canyon. This, you hear, is the place. You can finally rest from your journey.", "ZZ", "Normal", false, new Location(), new Resource[]{}),};

    public static boolean advanceScene() {
        int newScene = PioneerTrails.getCurrentGame().getCurrentScene() + 1;
        if (newScene < SCENES.length) {
            PioneerTrails.getCurrentGame().setCurrentScene(newScene);
        }

        return (newScene >= SCENES.length - 1);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public Boolean getHindrance() {
        return hindrance;
    }

    public Location getLocations() {
        return location;
    }

    @Override
    public String toString() {
        return "Scene{" + "name=" + name + ", description=" + description + ", symbol=" + symbol + ", difficulty=" + difficulty + ", hindrance=" + hindrance + ", location=" + location + '}';
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        if (!Objects.equals(this.difficulty, other.difficulty)) {
            return false;
        }
        if (!Objects.equals(this.hindrance, other.hindrance)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }

}
