/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hunte
 */
public class AverageArrayTest {
    
    public AverageArrayTest() {
    }

    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        int[] a = null;
        int expResult = 0;
        int result = AverageArray.getTotal(a);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        int[] a = null;
        double expResult = 0.0;
        double result = AverageArray.getAverage(a);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetHighest() {
        System.out.println("getHighest");
        int[] a = null;
        int expResult = 0;
        int result = AverageArray.getHighest(a);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetLowest() {
        System.out.println("getLowest");
        int[] a = null;
        int expResult = 0;
        int result = AverageArray.getLowest(a);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
