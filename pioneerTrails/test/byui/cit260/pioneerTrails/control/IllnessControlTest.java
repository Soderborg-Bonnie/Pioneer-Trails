/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tamlyn Laurence
 */
public class IllnessControlTest {
    
    public IllnessControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcIllnessOutcome method, of class IllnessControl.
     */
    @Test
    public void testCalcIllnessOutcome() {
        System.out.println("calcIllnessOutcome1");
        int choice = 1;
        int mortalityRate = 6;
        int chance = 2;
        int expResult = 8;
        int result = IllnessControl.calcIllnessOutcome(choice, mortalityRate, chance);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Something went wrong");
    }
    
}
