import java.util.Scanner;

//MAIN CLASS
public class Main {
    public static void main(String[] args){

        //CREATE SCANNER
        Scanner input = new Scanner(System.in);

        //DECLARE VARIABLES
        String password = "Java2026";
        String answer;

        boolean passwordLength = false;
        boolean firstCharacter = false;
        boolean lastCharacter = false;

        //LOOP UNTIL CONDITION IS TRUE
        for(int i = 5; i > 0; i --){

            //GET USER INPUT
            System.out.println("*********************");
            System.out.println("PASSWORD GUESSER GAME");
            System.out.println("*********************");

            System.out.print("Enter Guess : ");
            answer = input.nextLine();

            //CHECK LENGTH
            if(answer.length() != password.length()){

                System.out.println("Incorrect Length!");
                System.out.printf("\nYou have %d Attempt(s) Left", i - 1);
                continue;
            }
            else{

                passwordLength = true;
            }

            //CHECK FIRST CHARACTER
            if(answer.charAt(0) != password.charAt(0)){

                System.out.println("Incorrect First Character!");
                System.out.printf("\nYou have %d Attempt(s) Left", i - 1);
                continue;
            }
            else{

                firstCharacter = true;
            }

            //CHECK LAST CHARACTER
            if(answer.charAt(answer.length() - 1) != password.charAt(password.length() - 1)){

                System.out.println("Incorrect Last Character!");
                System.out.printf("\nYou have %d Attempt(s) Left", i - 1);
                continue;
            }
            else{

                lastCharacter = true;
            }

            //CHECK IF ALL TRUE
            if(passwordLength && firstCharacter && lastCharacter){

                if(answer.equals(password)){
                    
                    System.out.println("Password Successful!");
                    break;
                }
                else{

                    System.out.println("Correct length, first and last character.");
                    System.out.println("But the password is still incorrect.");
                    System.out.printf("You have %d Attempt(s) Left%n", i - 1);
                }
            }

            //GAME OVER
            if(i == 1){
                System.out.println("\nGame Over!");
                System.out.println("The correct password was: " + password);
            }
        }

        //CLOSE SCANNER
        input.close();
    }
}