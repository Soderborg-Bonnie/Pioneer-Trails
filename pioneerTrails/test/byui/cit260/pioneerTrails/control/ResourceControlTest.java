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
        double availableWater = 0.0;
        double numPeople = 0.0;
        double time = 0.0;
        double waterRation = 0.0;
        double expResult = 0.0;
        double result = ResourceControl.calcWaterConsumption(availableWater, numPeople, time, waterRation);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
