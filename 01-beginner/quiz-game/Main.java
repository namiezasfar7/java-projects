import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //CREATE SCANNER
        Scanner input = new Scanner(System.in);

        //DECLARE VARIABLE
        int choice = 0, score = 0;

        //GET USER INPUT
        System.out.println("What does CPU stand for?");
        System.out.println("1) Central Process Unit");
        System.out.println("2) Central Processing Unit");
        System.out.println("3) Computer Personal Unit");
        System.out.println("4) Central Program Utility");

        System.out.print("Answer : ");
        choice = input.nextInt();

        //CHECK ANSWER
        if(choice == 2){
            score ++;
            System.out.println("Correct!");
        }
        else{
            System.out.println("Wrong!");
        }

        System.out.println();
        System.out.println("Which number system does a computer mainly use?");
        System.out.println("1) Decimal");
        System.out.println("2) Binary");
        System.out.println("3) Octal");
        System.out.println("4) Roman");

        System.out.print("Answer : ");
        choice = input.nextInt();

        //CHECK ANSWER
        if(choice == 2){
            score ++;
            System.out.println("Correct!");
        }
        else{
            System.out.println("Wrong!");
        }

        System.out.println();
        System.out.println("Which device is used to type text into a computer?");
        System.out.println("1) Monitor");
        System.out.println("2) Mouse");
        System.out.println("3) Keyboard");
        System.out.println("4) Printer");

        System.out.print("Answer : ");
        choice = input.nextInt();

        //CHECK ANSWER
        if(choice == 3){
            score ++;
            System.out.println("Correct!");
        }
        else{
            System.out.println("Wrong!");
        }

        //PRINT OUTPUT
        System.out.println("You Got " + score + "/3");
    }
}