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
public class WagonControlTest {

    public WagonControlTest() {
    }

    /**
     * Test of calcWagonWheelDegradation method, of class WagonControl.
     */
    @Test
    public void testCalcWagonWheelDegradation() {
        System.out.println("calcWagonWheelDegradation");

        //Test Case 1
        System.out.println("\tTest 1");
        double wagonWheelDurability = 100.0;
        double normalDegradation = 10.0;
        String terrainDifficulty = "Normal";

        //Expected output return value
        double expResult = 90.0;
        System.out.println("calcWagonWheelDegradation(" + wagonWheelDurability + ", " + normalDegradation + ", " + terrainDifficulty + ")");

        //Call function to test result
        double result = WagonControl.calcWagonWheelDegradation(wagonWheelDurability, normalDegradation, terrainDifficulty);
        System.out.println(result);

        //compare expected and actual return values
        assertEquals(expResult, result, 0.0);

        //Test Case 2
        System.out.println("\tTest 2");
        wagonWheelDurability = 80.0;
        normalDegradation = 10.0;
        terrainDifficulty = "Medium";

        //Expected output return value
        expResult = 60.0;
        System.out.println("calcWagonWheelDegradation(" + wagonWheelDurability + ", " + normalDegradation + ", " + terrainDifficulty + ")");

        //Call function to test result
        result = WagonControl.calcWagonWheelDegradation(wagonWheelDurability, normalDegradation, terrainDifficulty);
        System.out.println(result);

        //compare expected and actual return values
        assertEquals(expResult, result, 0.0);

        //Test Case 3
        System.out.println("\tTest 3");
        wagonWheelDurability = 60.0;
        normalDegradation = 10.0;
        terrainDifficulty = "Difficult";

        //Expected output return value
        expResult = 30.0;
        System.out.println("calcWagonWheelDegradation(" + wagonWheelDurability + ", " + normalDegradation + ", " + terrainDifficulty + ")");

        //Call function to test result
        result = WagonControl.calcWagonWheelDegradation(wagonWheelDurability, normalDegradation, terrainDifficulty);
        System.out.println(result);

        //compare expected and actual return values
        assertEquals(expResult, result, 0.0);

        //Test Case 4
        System.out.println("\tTest 4");
        wagonWheelDurability = 0.0;
        normalDegradation = 10.0;
        terrainDifficulty = "Normal";

        //Expected output return value
        expResult = -1.0;
        System.out.println("calcWagonWheelDegradation(" + wagonWheelDurability + ", " + normalDegradation + ", " + terrainDifficulty + ")");

        //Call function to test result
        result = WagonControl.calcWagonWheelDegradation(wagonWheelDurability, normalDegradation, terrainDifficulty);
        System.out.println(result);

        //compare expected and actual return values
        assertEquals(expResult, result, 0.0);

        //Test Case 5
        System.out.println("\tTest 5");
        wagonWheelDurability = 101.0;
        normalDegradation = 10.0;
        terrainDifficulty = "Medium";

        //Expected output return value
        expResult = -1.0;
        System.out.println("calcWagonWheelDegradation(" + wagonWheelDurability + ", " + normalDegradation + ", " + terrainDifficulty + ")");

        //Call function to test result
        result = WagonControl.calcWagonWheelDegradation(wagonWheelDurability, normalDegradation, terrainDifficulty);
        System.out.println(result);

        //compare expected and actual return values
        assertEquals(expResult, result, 0.0);

        //Test Case 6
        System.out.println("\tTest 6");
        wagonWheelDurability = 50.0;
        normalDegradation = 9.0;
        terrainDifficulty = "Difficult";

        //Expected output return value
        expResult = -2.0;
        System.out.println("calcWagonWheelDegradation(" + wagonWheelDurability + ", " + normalDegradation + ", " + terrainDifficulty + ")");

        //Call function to test result
        result = WagonControl.calcWagonWheelDegradation(wagonWheelDurability, normalDegradation, terrainDifficulty);
        System.out.println(result);

        //compare expected and actual return values
        assertEquals(expResult, result, 0.0);

        //Test Case 7
        System.out.println("\tTest 7");
        wagonWheelDurability = 100.0;
        normalDegradation = 10.0;
        terrainDifficulty = "norml";

        //Expected output return value
        expResult = -999.0;
        System.out.println("calcWagonWheelDegradation(" + wagonWheelDurability + ", " + normalDegradation + ", " + terrainDifficulty + ")");

        //Call function to test result
        result = WagonControl.calcWagonWheelDegradation(wagonWheelDurability, normalDegradation, terrainDifficulty);
        System.out.println(result);

        //compare expected and actual return values
        assertEquals(expResult, result, 0.0);

        //Test Case 8
        System.out.println("\tTest 8");
        wagonWheelDurability = 1.0;
        normalDegradation = 10.0;
        terrainDifficulty = "Normal";

        //Expected output return value
        expResult = -4.0;
        System.out.println("calcWagonWheelDegradation(" + wagonWheelDurability + ", " + normalDegradation + ", " + terrainDifficulty + ")");

        //Call function to test result
        result = WagonControl.calcWagonWheelDegradation(wagonWheelDurability, normalDegradation, terrainDifficulty);
        System.out.println(result);

        //compare expected and actual return values
        assertEquals(expResult, result, 0.0);

        //Test Case 9
        System.out.println("\tTest 9");
        wagonWheelDurability = 100.0;
        normalDegradation = 10.0;
        terrainDifficulty = "Normal";

        //Expected output return value
        expResult = 90.0;
        System.out.println("calcWagonWheelDegradation(" + wagonWheelDurability + ", " + normalDegradation + ", " + terrainDifficulty + ")");

        //Call function to test result
        result = WagonControl.calcWagonWheelDegradation(wagonWheelDurability, normalDegradation, terrainDifficulty);
        System.out.println(result);

        //compare expected and actual return values
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of calcFoodWeight method, of class WagonControl. Bonnie's method
     */
    @Test
    public void testCalcFoodWeight() {
        System.out.println("calcFoodWeight");

        //Test Case 1
        System.out.println("\tTest 1");
        double resourceItemWeight = 100.0;
        double quantityResourceItem = 5.0;
        double percentSpoiled = .1;

        //Expected output return value
        double expResult = 450.0;
        System.out.println("calcFoodWeight(" + resourceItemWeight + ", " + quantityResourceItem + ", " + percentSpoiled + ")");

        //Call function to test result
        double result = WagonControl.calcFoodWeight(resourceItemWeight, quantityResourceItem, percentSpoiled);
        System.out.println(result);

        //Compare expected and actual values
        assertEquals(expResult, result, 0.0);

        //Test Case 2
        System.out.println("\tTest 2");
        resourceItemWeight = 500.0;
        quantityResourceItem = 4.0;
        percentSpoiled = .02;

        //Expected output return value
        expResult = -1.0;
        System.out.println("calcFoodWeight(" + resourceItemWeight + ", " + quantityResourceItem + ", " + percentSpoiled + ")");

        //Call function to test result
        result = WagonControl.calcFoodWeight(resourceItemWeight, quantityResourceItem, percentSpoiled);
        System.out.println(result);

        //Compare expected and actual values
        assertEquals(expResult, result, 0.0);

        //Test Case 3
        System.out.println("\tTest 3");
        resourceItemWeight = 3.0;
        quantityResourceItem = -1.0;
        percentSpoiled = .04;

        //Expected output return value
        expResult = -2.0;
        System.out.println("calcFoodWeight(" + resourceItemWeight + ", " + quantityResourceItem + ", " + percentSpoiled + ")");

        //Call function to test result
        result = WagonControl.calcFoodWeight(resourceItemWeight, quantityResourceItem, percentSpoiled);
        System.out.println(result);

        //Compare expected and actual values
        assertEquals(expResult, result, 0.0);

        //Test Case 4
        System.out.println("\tTest 4");
        resourceItemWeight = 5.0;
        quantityResourceItem = 5.0;
        percentSpoiled = 1.1;

        //Expected output return value
        expResult = -3.0;
        System.out.println("calcFoodWeight(" + resourceItemWeight + ", " + quantityResourceItem + ", " + percentSpoiled + ")");

        //Call function to test result
        result = WagonControl.calcFoodWeight(resourceItemWeight, quantityResourceItem, percentSpoiled);
        System.out.println(result);

        //Compare expected and actual values
        assertEquals(expResult, result, 0.0);

        //Test Case 5
        System.out.println("\tTest 5");
        resourceItemWeight = 10.0;
        quantityResourceItem = 1.0;
        percentSpoiled = 1.0;

        //Expected output return value
        expResult = 0.0;
        System.out.println("calcFoodWeight(" + resourceItemWeight + ", " + quantityResourceItem + ", " + percentSpoiled + ")");

        //Call function to test result
        result = WagonControl.calcFoodWeight(resourceItemWeight, quantityResourceItem, percentSpoiled);
        System.out.println(result);

        //Compare expected and actual values
        assertEquals(expResult, result, 0.0);

        //Test Case 6
        System.out.println("\tTest 6");
        resourceItemWeight = 400.0;
        quantityResourceItem = 5.0;
        percentSpoiled = 0.0;

        //Expected output return value
        expResult = -4.0;
        System.out.println("calcFoodWeight(" + resourceItemWeight + ", " + quantityResourceItem + ", " + percentSpoiled + ")");

        //Call function to test result
        result = WagonControl.calcFoodWeight(resourceItemWeight, quantityResourceItem, percentSpoiled);
        System.out.println(result);

        //Compare expected and actual values
        assertEquals(expResult, result, 0.0);

        //Test Case 7
        System.out.println("\tTest 7");
        resourceItemWeight = 400.0;
        quantityResourceItem = 4.0;
        percentSpoiled = .1;

        //Expected output return value
        expResult = 1440.0;
        System.out.println("calcFoodWeight(" + resourceItemWeight + ", " + quantityResourceItem + ", " + percentSpoiled + ")");

        //Call function to test result
        result = WagonControl.calcFoodWeight(resourceItemWeight, quantityResourceItem, percentSpoiled);
        System.out.println(result);

        //Compare expected and actual values
        assertEquals(expResult, result, 0.0);

    }
}
