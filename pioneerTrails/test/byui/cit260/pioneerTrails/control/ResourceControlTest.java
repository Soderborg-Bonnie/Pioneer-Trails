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
        double waterResource = availableWater - (numPeople * time * waterRation);

        //expected output return value
        double expResult = 15.0;

        System.out.println("calcWaterConsumption(" + availableWater + ", " 
                + numPeople + ", " + time + ", " + waterRation + ")");

        //call function to run test
        double result = ResourceControl.calcWaterConsumption(availableWater, 
                numPeople, time, waterRation);

        System.out.println(result);
        //compare expected and actual return values
        assertEquals(expResult, result, 0.0);

        //Test case 2
        System.out.println("\tTest 2");
        availableWater = 4.0;
        numPeople = 4.0;
        time = 10.0;
        waterRation = 1.0;
        waterResource = availableWater - (numPeople * time * waterRation);

        //expected output return value
        expResult = -999.0;

        System.out.println("calcWaterConsumption(" + availableWater + ", " 
                + numPeople + ", " + time + ", " + waterRation + ")");

        //call function to run test
        result = ResourceControl.calcWaterConsumption(availableWater, 
                numPeople, time, waterRation);

        System.out.println(result);
        //compare expected and actual return values
        assertEquals(expResult, result, 0.0);

        //Test case 3
        System.out.println("\tTest 3");
        availableWater = 12.0;
        numPeople = 4.0;
        time = 10.0;
        waterRation = 0.5;
        waterResource = availableWater - (numPeople * time * waterRation);

        //expected output return value
        expResult = -2.0;

        System.out.println("calcWaterConsumption(" + availableWater + ", " 
                + numPeople + ", " + time + ", " + waterRation + ")");

        //call function to run test
        result = ResourceControl.calcWaterConsumption(availableWater, 
                numPeople, time, waterRation);

        System.out.println(result);
        //compare expected and actual return values
        assertEquals(expResult, result, 0.0);

        //Test case 4
        System.out.println("\tTest 4");
        availableWater = 101.0;
        numPeople = 5.0;
        time = 10.0;
        waterRation = 1.0;
        waterResource = availableWater - (numPeople * time * waterRation);

        //expected output return value
        expResult = -1.0;

        System.out.println("calcWaterConsumption(" + availableWater + ", " 
                + numPeople + ", " + time + ", " + waterRation + ")");

        //call function to run test
        result = ResourceControl.calcWaterConsumption(availableWater, 
                numPeople, time, waterRation);

        System.out.println(result);
        //compare expected and actual return values
        assertEquals(expResult, result, 0.0);

        //Test case 5
        System.out.println("\tTest 5");
        availableWater = 80.0;
        numPeople = 6.0;
        time = 15.0;
        waterRation = 1.0;
        waterResource = availableWater - (numPeople * time * waterRation);

        //expected output return value
        expResult = -4.0;

        System.out.println("calcWaterConsumption(" + availableWater + ", " 
                + numPeople + ", " + time + ", " + waterRation + ")");

        //call function to run test
        result = ResourceControl.calcWaterConsumption(availableWater, 
                numPeople, time, waterRation);

        System.out.println(result);
        //compare expected and actual return values
        assertEquals(expResult, result, 0.0);

        //Test case 6
        System.out.println("\tTest 6");
        availableWater = 10.0;
        numPeople = 1.0;
        time = 1.0;
        waterRation = 1.0;
        waterResource = availableWater - (numPeople * time * waterRation);

        //expected output return value
        expResult = 9.0;

        System.out.println("calcWaterConsumption(" + availableWater + ", " 
                + numPeople + ", " + time + ", " + waterRation + ")");

        //call function to run test
        result = ResourceControl.calcWaterConsumption(availableWater, 
                numPeople, time, waterRation);

        System.out.println(result);
        //compare expected and actual return values
        assertEquals(expResult, result, 0.0);

        //Test case 7
        System.out.println("\tTest 7");
        availableWater = 80.0;
        numPeople = 5.0;
        time = 20.0;
        waterRation = 1.0;
        waterResource = availableWater - (numPeople * time * waterRation);

        //expected output return value
        expResult = -999.0;

        System.out.println("calcWaterConsumption(" + availableWater + ", " 
                + numPeople + ", " + time + ", " + waterRation + ")");

        //call function to run test
        result = ResourceControl.calcWaterConsumption(availableWater, 
                numPeople, time, waterRation);

        System.out.println(result);
        //compare expected and actual return values
        assertEquals(expResult, result, 0.0);

        //Test case 8
        System.out.println("\tTest 8");
        availableWater = 100.0;
        numPeople = 5.0;
        time = 20.0;
        waterRation = 1.0;
        waterResource = availableWater - (numPeople * time * waterRation);

        //expected output return value
        expResult = -999.0;

        System.out.println("calcWaterConsumption(" + availableWater + ", " 
                + numPeople + ", " + time + ", " + waterRation + ")");

        //call function to run test
        result = ResourceControl.calcWaterConsumption(availableWater, 
                numPeople, time, waterRation);

        System.out.println(result);
        //compare expected and actual return values
        assertEquals(expResult, result, 0.0);
    }

}
