import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //CREATE SCANNER
        Scanner input = new Scanner(System.in);

        //DECLARE VARIABLES
        String adjective01 = "", adjective02 = "", adjective03 = "";
        String noun01 = "";
        String verb01 = "";

        //GET USER INPUT
        System.out.print("Enter an adjectice (description) : ");
        adjective01 = input.nextLine();

        System.out.print("Enter a noun (animal or person) : ");
        noun01 = input.nextLine();

        System.out.print("Enter an adjectice (description) : ");
        adjective02 = input.nextLine();

        System.out.print("Enter a verb ending with -ing (action) : ");
        verb01 = input.nextLine();

        System.out.print("Enter an adjectice (description) : ");
        adjective03 = input.nextLine();

        //PRINT OUTPUT
        System.out.println();
        System.out.println("Today I went to a " + adjective01 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun01 + ".");
        System.out.println(noun01 + " was " + adjective02 + " and " + verb01 + "!");
        System.out.println("I was " + adjective03 + "!");

        //CLOSE SCANNER
        input.close();
    }
}