import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //CREATE SCANNER
        Scanner input = new Scanner(System.in);

        //DECLARE VARIABLE
        int balance = 1000, withdrawAmt = 0, depositAmt = 0, choice = 0;

        //LOOP UNTIL CONDITION IS TRUE
        while(choice != 4){
            //GET USER INPUT
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter Choice : ");
            choice = input.nextInt();
            System.out.println();

            if(choice == 4){
                System.out.println("Thank You For Using This System!");
                break;
            }
            else if(choice == 3){
                System.out.print("Enter Withdraw Amount : Rs.");
                withdrawAmt = input.nextInt();
                System.out.println();

                //CHECK VALIDITY
                if(withdrawAmt > balance){
                    //PRINT OUTPUT
                    System.out.println("Insufficient Balance!");
                    System.out.println();
                }
                else{
                    //REDUCE FROM BALANCE
                    balance -= withdrawAmt;
                }
            }
            else if(choice == 2){
                System.out.print("Enter Deposit Amount : Rs.");
                depositAmt = input.nextInt();
                System.out.println();

                //ADD TO BALANCE
                balance += depositAmt;
            }
            else if(choice == 1){
                //PRINT OUTPUT
                System.out.println("Balance : Rs." + balance);
                System.out.println();
            }
            else{
                System.out.println("Invalid Choice! Try Again!");
                System.out.println();
            }
        }
    }
}