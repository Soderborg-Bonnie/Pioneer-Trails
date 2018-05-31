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

public class ResourceControl {
    
    /**Algorithm for calcWaterConsumption:
BEGIN
IF availableWater <0 or >101 
        RETURN -1 
IF waterRation <1 or >1 
        RETURN  -2 
IF time <1 or > 20 
        RETURN -3 
IF numPeople <0 or >5
       RETURN -4

calcWaterConsumption(availableWater, numPeople, time, waterRation): double 
waterResource = availableWater - (numPeople*time*waterRation) 
IF waterResource <0
	RETURN -999
Update waterResource & continue game
RETURN  waterResource
END */
  
 public static double calcWaterConsumption(double availableWater, double numPeople, double time, double waterRation){ 
if (availableWater < 0 || > 101) {
    return -1;
} 
if (waterRation < 1 || > 1) {
        return  -2;
}
if (time < 1 || > 20) {
        return -3;
}
if (numPeople < 0 || > 5) {
       return -4;
}
       
double waterResource = availableWater - (numPeople*time*waterRation); {
if (waterResource <= 0) {
	return -999;
 else
        return  waterResource;
}
}
}

