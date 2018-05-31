/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tyler
 */
public class ResourceControlTest {
    
    public ResourceControlTest() {
    }

    /**
     * Test of calcWaterConsumption method, of class ResourceControl.
     */
    @Test
    public void testCalcWaterConsumption() {
        System.out.println("calcWaterConsumption");
        
        //Test case 1
        
        System.out.println("\tTest 1");
        double availableWater = 30.0;
        double numPeople = 5.0;
        double time = 3.0;
        double waterRation = 1.0;
        double waterResource = availableWater - (numPeople*time*waterRation);
        
        //Create instance of ResourceControl class
        ResourceControl instance = new ResourceControl();
        
        //expected output return value
        double expResult = 15.0;
        
        System.out.println("calcWaterConsumption(" + "availableWater" + ", " + "numPeople" + ", " + "time" + ", " + "waterRation" + ")" );
         
         //call function to run test
        double result = instance.calcWaterConsumption(availableWater, numPeople, time, waterRation);
        
        System.out.println(result);
        //compare expected and actual return values
        assertEquals(expResult, result, 0.0);
        
    }
    
}
