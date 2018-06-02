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
    
    public static double calcWagonWheelDegradation(double wagonWheelDurability, double normalDegradation, string terrainDifficulty) {
     if (wagonWheelDurability < 1 || wagonWheelDurability >100) {
	return -1;
}
    if (normalDegradation != 10) {
	return -2;
}
    if (terrainDifficulty = "Normal") { 
	return 0;
}
    if (terrainDifficulty = "Medium") {
	return 10;
    }        
    if (terrainDifficulty = "Difficult") { 
	return 20;
    }        
    if (terrainDifficulty != "Normal" || terrainDifficulty != "Medium" || terrainDifficulty != "Difficult") {
	return -999;
    }
   

 double calcWagonWheelDegradation = wagonWheelDurability - (normalDegradation + terrainDifficulty); {
    if (calcWagonWheelDegradation < 1 || calcWagonWheelDegradation > 100) {
	return -4;
}        
    if (calcWagonWheelDegradation >1 && calcWagonWheelDegradation <100) {
        calcWagonWheelDegradation = wagonWheelDurability;
    
}
    return wagonWheelDurability;
}
}
}

