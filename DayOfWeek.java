
/**
 * Name: Bryce Sulin (sulin)
 * Course: CSCI 241 - Computer Science I
 * Section: 001
 * Assignment:2
 * 
 * Project/Class Description:
 * This class finds the day of the week for a given date
 * The user enters the date in parts and the program will
 * use this formula to find the day of the week.
 * 
 * Here are the formulas used to calculate variables:
 * 1. D = (d+m+yy+q+c)modulus 7
 * 2. c = (39-cc)modulus 4 * 2
 * 
 * Test Dates:
 * 1. September 17, 1994; Expected Day of Week: Saturday(6)
 * 2. May 18, 1967; Expected Day of Week: Thursday(4)
 * 3. December 5, 1944; Expected Day of Week: Tuesday(2)
 * 
 * Known bugs: none
 */

import java.util.Scanner;

public class DayOfWeek{
    public static void main(String[] args)
    {
       
        // Set up scanner for input from keyboard
        Scanner input = new Scanner(System.in);
        
        System.out.println("This program calculates the day of the week for any year, month and day.");
        
        
        // Prompt for date (year entered first, then month, and day, and set as variables)
        System.out.println("Enter year (4 digits):");
        int year = input.nextInt();
        
        System.out.println("Here is the offset numbers table:");
        System.out.println("Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec");
        System.out.println(" 0   3   3   6   1   4   6   2   5   0   3   5");
        
        System.out.println("Enter the month offset:");
        int month = input.nextInt();
        System.out.println("Enter day (1-31):");
        int day = input.nextInt();
   
        
        System.out.println(day + " " + month + " " + year);
        
        // set intermediate variables for calculations
        // calculate year within century (yy), yy/4 (q), and 2-digit century (cc)
        int yy = year - ((year / 100) * 100);
        int q = yy / 4;
        int cc = year / 100;
        
        // calculate century offset (c)
        // c=(39-cc)modulus4x2
        int c = (39 - cc) % 4 * 2;
        
        // calculate Day of Week (D)
        // D=(day+month+yy+q+c)modulus7
        int D = (day + month + yy + q + c) % 7;
        
        System.out.println("I got it!");
        
        System.out.println("Answer key:");
        System.out.println("0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday");
        
        
        
   
        // print the results
        System.out.println("The answer is:" + D);
    }
}
