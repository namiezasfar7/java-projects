import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //CREATE SCANNER
        Scanner input = new Scanner(System.in);

        //DECLARE VARIABLE
        int count = 0, enterPin = 0;
        int defaultPin = 1234;

        //LOOP UNTIL CONDITION IS TRUE
        while(count < 3){
            //GET USER INPUT
            System.out.print("Enter PIN : ");
            enterPin = input.nextInt();

            //CHECK PIN
            if(enterPin == defaultPin){
                //PRINT OUTPUT
                System.out.println("Access Granted!");
                break;
            }
            else{
                //PRINT OUTPUT
                System.out.println("Incorrect PIN. " + (2 - count) + " attempt(s) remaining.");
            }

            //ADD INCREMENT
            count ++;
        }

        //PRINT MESSAGE IF COUNT IS 3
        if(count == 3){
            System.out.println("Account Locked!");
        }
    }
}