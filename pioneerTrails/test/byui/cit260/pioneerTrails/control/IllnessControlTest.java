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
        //Test Case 1
        System.out.println("\tTest 1");
        int choice = 1;
        int mortalityRate = 6;
        int chance = 2;
        int expResult = 8;
        int result = IllnessControl.calcIllnessOutcome(choice, mortalityRate, chance);
        System.out.println(result);
        assertEquals(expResult, result);
        
        
                //Test Case 2
        System.out.println("\tTest 2");
        choice = 2;
        mortalityRate = 6;
        chance = 2;
        expResult = -4;
        result = IllnessControl.calcIllnessOutcome(choice, mortalityRate, chance);
        System.out.println(result);
        assertEquals(expResult, result);
        
                
                     //Test Case 3
        System.out.println("\tTest 3");
        choice = -1;
        mortalityRate = 2;
        chance = 1;
        expResult = -1;
        result = IllnessControl.calcIllnessOutcome(choice, mortalityRate, chance);
        System.out.println(result);
        assertEquals(expResult, result); 
        
                
                //Test Case 4
        System.out.println("\tTest 4");
        choice = 1;
        mortalityRate = 11;
        chance = 1;
        expResult = -2;
        result = IllnessControl.calcIllnessOutcome(choice, mortalityRate, chance);
        System.out.println(result);
        assertEquals(expResult, result); 
        
        
                //Test Case 5
        System.out.println("\tTest 5");
        choice = 1;
        mortalityRate = 9;
        chance = 11;
        expResult = -3;
        result = IllnessControl.calcIllnessOutcome(choice, mortalityRate, chance);
        System.out.println(result);
        assertEquals(expResult, result); 
        
        
                //Test Case 6
        System.out.println("\tTest 6");
        choice = 1;
        mortalityRate = 1;
        chance = 1;
        expResult = 2;
        result = IllnessControl.calcIllnessOutcome(choice, mortalityRate, chance);
        System.out.println(result);
        assertEquals(expResult, result);  
        
        
                //Test Case 7
        System.out.println("\tTest 6");
        choice = 1;
        mortalityRate = 1;
        chance = 9;
        expResult = 10;
        result = IllnessControl.calcIllnessOutcome(choice, mortalityRate, chance);
        System.out.println(result);
        assertEquals(expResult, result); 
        
        
                //Test Case 8
        System.out.println("\tTest 8");
        choice = 1;
        mortalityRate = 9;
        chance = 1;
        expResult = 10;
        result = IllnessControl.calcIllnessOutcome(choice, mortalityRate, chance);
        System.out.println(result);
        assertEquals(expResult, result); 
        

                //Test Case 9
        System.out.println("\tTest 9");
        choice = 1;
        mortalityRate = 9;
        chance = 19;
        expResult = -3;
        result = IllnessControl.calcIllnessOutcome(choice, mortalityRate, chance);
        System.out.println(result);
        assertEquals(expResult, result); 
        
        
                //Test Case 10
        System.out.println("\tTest 10");
        choice = 2;
        mortalityRate = 1;
        chance = 1;
        expResult = 3;
        result = IllnessControl.calcIllnessOutcome(choice, mortalityRate, chance);
        System.out.println(result);
        assertEquals(expResult, result);
        
        
                //Test Case 11
        System.out.println("\tTest 11");
        choice = 2;
        mortalityRate = 1;
        chance = 1;
        expResult = 3;
        result = IllnessControl.calcIllnessOutcome(choice, mortalityRate, chance);
        System.out.println(result);
        assertEquals(expResult, result);
        
        
                //Test Case 12
        System.out.println("\tTest 12");
        choice = 2;
        mortalityRate = 9;
        chance = 1;
        expResult = -4;
        result = IllnessControl.calcIllnessOutcome(choice, mortalityRate, chance);
        System.out.println(result);
        assertEquals(expResult, result);
        
        
                //Test Case 13
        System.out.println("\tTest 13");
        choice = 2;
        mortalityRate = 9;
        chance = 9;
        expResult = -4;
        result = IllnessControl.calcIllnessOutcome(choice, mortalityRate, chance);
        System.out.println(result);
        assertEquals(expResult, result);
    }
    
}
