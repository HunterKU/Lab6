/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hunte
 */
import java.util.*;
public class HigherNumbersArray {
    public static void main(String[] args) {
        int[] a=array();
        int n = 33;
        System.out.println("The numbers in the array that are greater than "+n+" are: " );
        for (int i=0; i<a.length; i++)
            if(a[i]>n)
        System.out.println(a[i]);
    }
    public static int[] array()
    {
        int array [] = {5,11,23,29,43,86,101};
        return array;
    }
}

