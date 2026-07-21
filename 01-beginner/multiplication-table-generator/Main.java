import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //CREATE SCANNER
        Scanner input = new Scanner(System.in);

        //DECLARE VARIABLES
        int number = 0;
        int times = 0;

        //GET USER INPUT
        System.out.println("******************************");
        System.out.println("MULTIPLICATION TABLE GENERATOR");
        System.out.println("******************************");

        System.out.print("Enter Number     : ");
        number = input.nextInt();

        System.out.print("Enter # of Times : ");
        times = input.nextInt();

        System.out.println();

        //LOOP UNTIL CONDITION IS TRUE
        for(int i = 0; i < times; i ++){

            //CALCULATE AND PRINT OUTPUT
            System.out.printf("%d x %d = %d\n", number, i + 1, (number * (i + 1)));
        }

        //CLOSE SCANNER
        input.close();
    }
}