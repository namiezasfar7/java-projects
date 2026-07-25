import java.util.Scanner;
import java.util.Random;

//MAIN CLASS
public class Main {
    public static void main(String[] args){

        //CREATE SCANNER
        Scanner input = new Scanner(System.in);

        //DECLARE VARIABLES
        int balance = 100;
        int bet = 0;
        int payout = 0;

        String[] row;
        String playAgain;

        //DISPLAY WELCOME MESSAGE
        System.out.println("****************************");
        System.out.println("    WELCOME TO JAVA SLOTS   ");
        System.out.println("Symbols : 🍒 🍉 🥭 🔔 ⭐  ");
        System.out.println("****************************");

        //PLAY IF BALANCE > 0
        while(balance > 0){

            //ENTER BET AMOUNT
            System.out.println("Current Balance  : $" + balance);
            System.out.print("Place Bet Amount : $");
            bet = input.nextInt();

            input.nextLine();

            //VERIFY IF BET > BALANCE
            if(bet > balance){

                System.out.println("INSUFFICIENT FUNDS");
                
                continue;
            }
            //VERIFY IF BET > 0
            else if(bet <= 0){

                System.out.println("Bet must be greater than 0");
                
                continue;
            }
            else{

                //SUBTRACT BET FROM BALANCE
                balance -= bet;
            }

            //SPIN ROW
            System.out.println("Spinning ...");
            row = spinRow();

            //PRINT OUTPUT
            printRow(row);

            //GET PAYOUT
            payout = getPayout(row, bet);

            if(payout > 0){

                //PRINT PAYOUT
                System.out.println("You Won $" + payout);

                balance += payout;
            }
            else{

                //PRINT MESSAGE
                System.out.println("Sorry You Lost This Round!");
            }

            //ASK TO PLAY AGAIN
            System.out.print("Do You Want to Play Again [Y/N] : ");
            playAgain = input.nextLine().toUpperCase();

            //CHECK CONDITION
            if(!playAgain.equals("Y")){

                break;
            }
        }

        //DISPLAY EXIT MESSAGE
        System.out.println("GAME OVER! Your Final Balance is $" + balance);

        //CLOSE SCANNER
        input.close();
    }

    //SPIN ROW METHOD
    static String[] spinRow(){

        //DECLARE ARRAYS
        String[] symbols = {"🍒", "🍉", "🥭", "🔔", "⭐"};
        String[] row = new String[3];

        //CREATE RANDOM NUMBER
        Random random = new Random();

        //GENERATE RANDOM SYMBOLS
        for(int i = 0; i < 3; i ++){

            row[i] = symbols[random.nextInt(symbols.length)];
        }

        //RETURN ROW
        return row;
    }

    //PRINT ROW METHOD
    static void printRow(String[] row){

        //PRINT OUTPUT
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }

    //GET PAYOUT METHOUT
    static int getPayout(String[] row, int bet){

        //CHECK CONDITION
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            
            //RETURN VALUE
            return switch(row[0]){

                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🥭" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }
        else if(row[0].equals(row[1])){
            
            //RETURN VALUE
            return switch(row[0]){

                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🥭" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2])){
            
            //RETURN VALUE
            return switch(row[1]){

                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🥭" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }

        return 0;
    }
}