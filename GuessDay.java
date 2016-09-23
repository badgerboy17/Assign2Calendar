/**
 * Name: Bryce Sulin (sulin)
 * Course: CSCI 241 - Computer Science I
 * Section: 001
 * Assignment:2
 * 
 * Project/Class Description:
 * This class "plays" the game of guessing a month and day
 * 
 * Rather than getting a random month and day, it has to ask
 * the user to enter a month and day.
 * It then goes through series of arithmetic operations
 * which will reproduce that month and day.
 * 
 * Here is the algorithm:
 * 1. Enter the month and day from the keyboard
 * 2. Multiply the month by 7
 * 3. Subtract 1
 * 4. Multiply by 13
 * 5. Add the day
 * 6. Add 3
 * 7. Multiply by 11
 * 8. Subtract the month
 * 9. Subtract the day
 * 10. Divide by 10
 * 11. Add 11
 *
 * Known bugs:  LOTS!!!
 * /
        /**
           * Perform the operations, in order specified in algorithm
             */
            
import java.util.Scanner;

public class GuessDay{
    public static void main(String[] args) 
    {
        // Set up Scanner for input from keyboard
        Scanner input = new Scanner(System.in);
       
        System.out.println("Welcome to my date-guessing program!");
        
        System.out.println("This program will guess the month and day entered after performing a series of arithmetic operations.");
    
        // Prompt for date (month entered first, then day)
        System.out.println("Enter the month: ");
        System.out.println("Enter the day: ");
            
        //num holds the running total
        int num = input.nextInt();
        int month = num / 100;
        int day = num - month * 100;
        num = month * 7;   
        num = num - 1;
        num = num * 13;
        num = num + day;
        num = num + 3;
        num = num * 11;
        num = num - month;
        num = num - day;
        num = num / 10;
        num = num + 11;
    
        //2 new variables, extract the guess in 2 parts
        // Set variables guessMonth and guessDay
        int guessMonth = num / 100;
        int guessDay = num - guessMonth * 100;
    
        // print the results
        System.out.println();
        System.out.println("Your month was: " + guessMonth);
        System.out.println("Your day was: " + guessDay);
        }
}