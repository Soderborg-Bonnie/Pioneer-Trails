/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.control;

/**
 *
 * @author tyler
 */
public class WagonControl {

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
    public static double calcWagonWheelDegradation(double wagonWheelDurability, double normalDegradation, String terrainDifficulty) {
        double terrainValue = 0;

        if (wagonWheelDurability < 1 || wagonWheelDurability > 100) {
            return -1;
        }
        if (normalDegradation != 10) {
            return -2;
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

       private static String terrainDifficulty(){
        if (scene.GetDifficulty != "Normal" && terrainDifficulty != "Medium" && terrainDifficulty != "Difficult") {
            return -999;
        }

        double calcWagonWheelDegradation = wagonWheelDurability - (normalDegradation + terrainValue);
        {
            if (calcWagonWheelDegradation < 1 || calcWagonWheelDegradation > 100) {
                return -4;
            }

            return calcWagonWheelDegradation;
        }
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
    public static double calcFoodWeight(double resourceItemWeight, double quantityResourceItem, double percentSpoiled) {
        if (resourceItemWeight < 0 || resourceItemWeight > 400) {
            return -1;
        }
        if (quantityResourceItem <= 0 || quantityResourceItem > 5) {
            return -2;
        }
        if (percentSpoiled < 0 || percentSpoiled > 1) {
            return -3;
        }
        double totalWeight = (resourceItemWeight * quantityResourceItem) - (resourceItemWeight * quantityResourceItem * percentSpoiled);
        {
            if (totalWeight > 1500) {
                return -4;
            }
            //update totalWeight & continue game
            return totalWeight;
        }
    }
}
