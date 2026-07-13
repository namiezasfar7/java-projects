import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        //CREATE SCANNER
        Scanner input = new Scanner(System.in);

        //GENERATE RANDOM NUMBER
        Random random = new Random();

        //DECLARE VARIABLE
        int choice = 0;
        int number = random.nextInt(3) + 1;
        String choiceName = "";
        String computerName = "";

        //DISPLAY MENU
        System.out.println("====ROCK PAPER SCISSORS GAME====\n");

        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");

        //GET USER CHOICE
        System.out.print("\nEnter Your Choice : ");
        choice = input.nextInt();

        if(choice < 1 || choice > 3){
            System.out.println("\nWhat's That?\n");
            return;
        }

        //CHECK CONDITION FOR COMPUTER
        switch(number){
            case 1 ->
                computerName = "Rock";

            case 2 ->
                computerName = "Paper";

            case 3 ->
                computerName = "Scissors";
        }

        //CHECK CONDITION FOR USER
        switch(choice){
            case 1 ->
                choiceName = "Rock";

            case 2 ->
                choiceName = "Paper";

            case 3 ->
                choiceName = "Scissors";
        }

        //CHECK WINNER
        if((choice == 1 && number == 1) || (choice == 2 && number == 2) || (choice == 3 && number == 3)){
            System.out.printf("\nYou Chose %s", choiceName);
            System.out.printf("\nComputer Chose %s", computerName);
            System.out.println("\nIts a draw!");
        }
        else if((choice == 1 && number == 3) || (choice == 2 && number == 1) || (choice == 3 && number == 2)){
            System.out.printf("\nYou Chose %s", choiceName);
            System.out.printf("\nComputer Chose %s", computerName);
            System.out.println("\nYou Win!");
        }
        else{
            System.out.printf("\nYou Chose %s", choiceName);
            System.out.printf("\nComputer Chose %s", computerName);
            System.out.println("\nYou Lose!");
        }

        //CLOSE SCANNER
        input.close();
    }
}