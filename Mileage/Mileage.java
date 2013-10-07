// This program will get the values for miles driven and gallons of gas used to calculate the mpg of a car.
/* Michael White
 * September 25th, 2013
 */

import java.util.Scanner;

public class Mileage 
{ 
  public static void main(String[] args) 
  { 
    Scanner keyboard = new Scanner(System.in);
    
    // Declaring variables
    double mileage; // Miles driven
    double gas;     // Gallons of gas used
    double mpg;     // Miles per gallon
    
    // Program input and calculation
    System.out.println("How many miles did you drive?");
    mileage = keyboard.nextDouble();
    System.out.println("How much gas (in gallons) did you use?");
    gas = keyboard.nextDouble();
    mpg = mileage / gas;  // divides mileage by gallons used to get the miles per gallon
 //   if (gas = 0.0) {
      string infinicar = new String("You must've used some gas.  Try again."); }
    
      
    // Program output and result
  //  System.out.println("You car has " + mpg + " miles per gallon.");
    
    
// add your declaration and code here 
  } 
}