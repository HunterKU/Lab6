/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hunte
 */
import java.util.Scanner;

public class AverageArray {
public static void main(String[] args) {
int numbers [] = {5,11,23,29,43,86,101};
getTotal(numbers);
getAverage(numbers);
getHighest(numbers);
getLowest(numbers);
}

public static int getTotal(int[] a) {
int total = 0;
for (int random = 0; random < a.length; random++) {
total += a[random];
}
System.out.println("Total: " + total);
return total;
}

public static double getAverage(int[] a) {
int total = 0;
for (int random = 0; random < a.length; random++) {
total += a[random];
}
double average = (total / 2.0);
System.out.println("Average: " + average);
return average;
}

public static int getHighest(int[] a) {
int highest = a[0];
for (int random = 1; random < a.length; random++) {
if (a[random] > highest)
highest = a[random];
}
System.out.println("Highest Value: " + highest);
return highest;
}

public static int getLowest(int[] a) {
int lowest = a[0];
for (int random = 1; random < a.length; random++) {
if (a[random] < lowest)
lowest = a[random];
}
System.out.println("Lowest Value: " + lowest);
return lowest;
    }
}

