/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.control;

import byui.cit260.pioneerTrails.exceptions.WagonControlExceptions;
import byui.cit260.pioneerTrails.model.*;
import pioneertrails.PioneerTrails;

/**
 *
 * @author tyler
 */
public class WagonControl {

//    private final Wagon wagon;

//    public WagonControl() {
//      }

    /**
     * calcWagonWheelDegradation(wagonWheelDurability, normalDegradation,
     * terrainDifficulty): double newWagonWheelDurability BEGIN IF
     * wagonWheelDurability <1 or >100 RETURN -1 IF normalDegradation != 10
     * RETURN -2 IF terrainDifficulty = “Normal” RETURN 0 IF terrainDifficulty =
     * “Medium” RETURN 10 IF terrainDifficulty = “Difficult” RETURN 20 IF
     * terrainDifficulty != (“Normal” || “Medium” || “Difficult”) RETURN -999
     * calcWagonWheelDegradation = wagonWheelDurability – (normalDegradation +
     * terrainDifficulty) IF calcWagonWheelDegradation <1 || >100 RETURN -4 IF
     * calcWagonWheelDegradation >1 && <100 calcWagonWheelDegradation =
     * wagonWheelDurability RETURN wagonWheelDurability END *
     */
    public static double calcWagonWheelDegradation(double wagonWheelDurability,
            double normalDegradation, String terrainDifficulty) throws WagonControlExceptions {
        double terrainValue = 0;

        if (wagonWheelDurability < 1 || wagonWheelDurability > 100) {
            throw new WagonControlExceptions("Your wagon wheel's durability needs to be between 1-100%.");
        }
        if (normalDegradation != 10) {
            throw new WagonControlExceptions("The wagon wheels automatically degrade by 10 every time the location changes.");
        }
        switch (terrainDifficulty) {
            case "Normal":
                terrainValue = 0;
                break;
            case "Medium":
                terrainValue = 10;
                break;
            case "Difficult":
                terrainValue = 20;
                break;
        }

        if (terrainDifficulty != "Normal" && terrainDifficulty != "Medium"
                && terrainDifficulty != "Difficult") {
            throw new WagonControlExceptions("Terrain difficulty must be 'Normal,' 'Medium,' or 'Difficult'.");
        }

        double calcWagonWheelDegradation = wagonWheelDurability
                - (normalDegradation + terrainValue);
        {
            if (calcWagonWheelDegradation < 1 || calcWagonWheelDegradation > 100) {
                throw new WagonControlExceptions("Your wagon wheel needs repair before you can continue.");
            }

            return calcWagonWheelDegradation;
        }
    }
    
    public static boolean acquireResource(String name, int quantity, int weight) {
        Wagon wagon = PioneerTrails.getCurrentGame().getWagon();
        Resource resource = wagon.getResources().get(name);
        System.out.println("resource in wagonControl acquireResource function: " +resource);
        if (resource == null) {
            wagon.getResources().put(name, resource = new Resource(name, 0, 0));
            System.out.println("resource in wagonControl acquireResource function after put: " +resource);
        }
        if (wagon.getWeight()+weight < wagon.getCapacity()) {
            resource.setWeight(resource.getWeight()+ weight);
            resource.setQuantity(resource.getQuantity()+ quantity);
            wagon.setWeight(wagon.getWeight()+ weight);
            System.out.println("resource in wagonControl acquireResource function after set: " +resource);
            
            return true;
        
    }
        return false; //todo: verify weight and add to wagon
    }

    /**
     * calcFoodWeight(resourceItem, resourceItemWeight, quantityResourceItem,
     * percentSpoiled): double BEGIN settotalWeight = 0; IF (resourceItemWeight < 0 or resourceWeight
     * > 400) RETURN -1 IF (quantityResourceItem <= 0 or quantityResourceItem >=
     * 5) RETURN -2 IF (percentSpoiled <= 0 or percentSpoiled >= 100) RETURN -3
     *
     * totalWeight = (resourceItemWeight * quantityResourceItem) –
     * (resourceItemWeight * quantityResourceItem * percentSpoiled) IF
     * (totalWeight > 1500) RETURN -4 //update totalWeight & continue game
     * RETURN double totalWeight END*
     */
    public double calcFoodWeight(double resourceItemWeight, double quantityResourceItem, double percentSpoiled)
            throws WagonControlExceptions {

        if (resourceItemWeight < 0 || resourceItemWeight > 450) {
//            
            throw new WagonControlExceptions("The weight needs to be between 0-450 pounds. Not more, not less.");
        }
        if (quantityResourceItem <= 0 || quantityResourceItem > 5) {
            throw new WagonControlExceptions("You can have between 0-5 of any item. Not more, not less.");
        }
        if (percentSpoiled < 0 || percentSpoiled > 1) {
            throw new WagonControlExceptions("You can't have less than 0% or more than 100% of spoiled food.");
        }
        double totalWeight = (resourceItemWeight * quantityResourceItem) - (resourceItemWeight * quantityResourceItem * percentSpoiled);
        {
            if (totalWeight > 1500) {
                throw new WagonControlExceptions("The total weight of your resources can't exceed 1500 pounds.");
            }
            //update totalWeight & continue game
            return totalWeight;
        }

    }
}
