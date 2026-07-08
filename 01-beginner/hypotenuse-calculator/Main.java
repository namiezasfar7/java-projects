import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //CREATE SCANNER
        Scanner input = new Scanner(System.in);

        //DECLARE VARIABLES
        double a = 0, b = 0, c = 0;

        //GET USER INPUT
        System.out.println("====HYPOTENUSE CALCULATOR====");
        System.out.println();

        System.out.print("Enter Length of Side A : ");
        a = input.nextDouble();

        System.out.print("Enter Length of Side B : ");
        b = input.nextDouble();
        System.out.println();

        //CALCULATE SIDE C
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        //PRINT OUTPUT
        System.out.println("The Length of the Hypotenuse [c] : " + c);

        //CLOSE SCANNER
        input.close();
    }
}