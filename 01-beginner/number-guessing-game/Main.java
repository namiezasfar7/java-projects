import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        //GENERATE RANDOM NUMBER
        Random random = new Random();

        //DECLARE VARIABLE
        int min = 1, max = 101;
        int answer = random.nextInt(min, max);
        int guess = 0, tries = 0;

        //CREATE SCANNER
        Scanner input = new Scanner(System.in);

        System.out.println("====NUMBER GUESSING GAME====");
        System.out.println();

        //LOOP UNTIL CONDITION IS TRUE
        while(guess != answer){
            //GET USER INPUT
            System.out.print("Guess a Number between " + min + " and " + (max - 1) + " : ");
            guess = input.nextInt();
            tries ++;

            //CHECK CONDITION
            if(guess > answer){
                System.out.println("TOO HIGH!");
            }
            else if(guess < answer){
                System.out.println("TOO LOW!");
            }
            else{
                System.out.println("CORRECT!");
            }
        }

        //PRINT OUTPUT
        System.out.println("The Answer is : " + answer);
        System.out.println("Number of Tries : " + tries);

        //CLOSE SCANNER
        input.close();
    }
}