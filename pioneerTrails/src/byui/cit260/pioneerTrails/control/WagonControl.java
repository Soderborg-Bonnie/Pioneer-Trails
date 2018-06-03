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
    /**calcWagonWheelDegradation(wagonWheelDurability, normalDegradation, terrainDifficulty): double
newWagonWheelDurability
BEGIN
IF wagonWheelDurability <1 or >100
	RETURN -1
IF normalDegradation != 10
	RETURN -2
IF terrainDifficulty = “Normal” 
	RETURN 0
IF terrainDifficulty = “Medium” 
	RETURN 10
IF terrainDifficulty = “Difficult” 
	RETURN 20
IF terrainDifficulty != (“Normal” || “Medium” || “Difficult”)    
	RETURN -999
 calcWagonWheelDegradation = wagonWheelDurability – (normalDegradation + terrainDifficulty) 
IF calcWagonWheelDegradation <1 || >100
	RETURN -4
IF calcWagonWheelDegradation >1 && <100
calcWagonWheelDegradation = wagonWheelDurability
RETURN wagonWheelDurability
END **/
    
    public static double calcWagonWheelDegradation(double wagonWheelDurability, double normalDegradation, String terrainDifficulty) {
        double terrainValue = 0;

        if (wagonWheelDurability < 1 || wagonWheelDurability >100) {
           return -1;
       }
        if (normalDegradation != 10) {
           return -2;
       }
       switch (terrainDifficulty) {
           case "Normal": terrainValue = 0;
               break;
           case "Medium": terrainValue = 10;
               break;
           case "Difficult": terrainValue = 20;
               break;
       }

       if (terrainDifficulty != "Normal" && terrainDifficulty != "Medium" && terrainDifficulty != "Difficult") {
           return -999;
       }
   

        double calcWagonWheelDegradation = wagonWheelDurability - (normalDegradation + terrainValue); {
        if (calcWagonWheelDegradation < 1 || calcWagonWheelDegradation > 100) {
            return -4;
        }        
    
        return calcWagonWheelDegradation;
    }
}
}

