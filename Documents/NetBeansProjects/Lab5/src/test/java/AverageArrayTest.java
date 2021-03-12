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
        int[] a = {1,2,3,4,5};
        int expResult = 15;
        int result = AverageArray.getTotal(a);
        assertEquals(expResult, result);

    }

    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        int[] a = {1,2,3,4,5};
        double expResult = 7.5;
        double result = AverageArray.getAverage(a);
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testGetHighest() {
        System.out.println("getHighest");
        int[] a = {1,2,3,4,5};
        int expResult = 5;
        int result = AverageArray.getHighest(a);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetLowest() {
        System.out.println("getLowest");
        int[] a = {1,2,3,4,5};
        int expResult = 1;
        int result = AverageArray.getLowest(a);
        assertEquals(expResult, result);
        
    }
    
}
