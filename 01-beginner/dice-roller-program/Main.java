import java.util.Scanner;
import java.util.Random;

//MAIN CLASS
public class Main {
    public static void main(String[] args){

        //CREATE SCANNER
        Scanner input = new Scanner(System.in);

        //CREATE RANDOM NUMBER
        Random random = new Random();

        //DECLARE VARIABLES
        int numOfDice;
        int total = 0;

        //GET USER INPUT
        System.out.print("Enter the # of dice to roll : ");
        numOfDice = input.nextInt();

        //CHECK VALIDITY
        if(numOfDice > 0){

            //ROLL DICE
            for(int i = 0; i < numOfDice; i ++){
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled : " + roll);

                //GET SUM
                total += roll;
            }
            System.out.println("Total : " + total);

        }
        else{
            System.out.println("# of dice must be graeter than 0");
        }

        //CLOSE SCANNER
        input.close();
    }

    //DISPLAY ASCII ART
    static void printDie(int roll){

        String dice01 = """
                        -------
                       |       |
                       |   ●   |
                       |       |
                        -------
                        """;

        String dice02 = """
                        -------
                       | ●     |
                       |       |
                       |     ● |
                        -------
                        """;

        String dice03 = """
                        -------
                       | ●     |
                       |   ●   |
                       |     ● |
                        -------
                        """;

        String dice04 = """
                        -------
                       | ●   ● |
                       |       |
                       | ●   ● |
                        -------
                        """;

        String dice05 = """
                        -------
                       | ●   ● |
                       |   ●   |
                       | ●   ● |
                        -------
                        """;

        String dice06 = """
                        -------
                       | ●   ● |
                       | ●   ● |
                       | ●   ● |
                        -------
                        """;

        //CHECK CONDITION
        switch(roll){
            case 1 -> System.out.print(dice01);
            case 2 -> System.out.print(dice02);
            case 3 -> System.out.print(dice03);
            case 4 -> System.out.print(dice04);
            case 5 -> System.out.print(dice05);
            case 6 -> System.out.print(dice06);
            default -> System.out.print("Invalid Roll");
        }
    }
}