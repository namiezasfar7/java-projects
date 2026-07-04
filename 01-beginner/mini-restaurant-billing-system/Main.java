import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //CREATE SCANNER
        Scanner input = new Scanner(System.in);

        //DECLARE VARIABLE
        int choice = 0, numItems = 0, totalItems = 0;
        float totalBill = 0.0f;

        //LOOP UNTIL CONDITION IS TRUE
        while(choice != 4){
            //GET USER INPUT
            System.out.println("====RESTAURANT BILLING SYSTEM====");
            System.out.println();

            System.out.println("1. Burger - Rs. 800");
            System.out.println("2. Pizza - Rs. 1500");
            System.out.println("3. Coke - Rs. 250");
            System.out.println("4. Finish Order");
            System.out.println();

            System.out.print("Enter Choice : ");
            choice = input.nextInt();

            if(choice == 4){
                //PRINT OUTPUT
                System.out.println("Thank You For Using This System");
                break;
            }
            else if(choice == 3){
                //GET USER INPUT
                System.out.print("Enter Number of Items : ");
                numItems = input.nextInt();
                System.out.println();

                //ADD TO BILL
                totalBill += (250 * numItems);
                totalItems += numItems;
            }
            else if(choice == 2){
                //GET USER INPUT
                System.out.print("Enter Number of Items : ");
                numItems = input.nextInt();
                System.out.println();

                //ADD TO BILL
                totalBill += (1500 * numItems);
                totalItems += numItems;
            }
            else if(choice == 1){
                //GET USER INPUT
                System.out.print("Enter Number of Items : ");
                numItems = input.nextInt();
                System.out.println();
                
                //ADD TO BILL
                totalBill += (800 * numItems);
                totalItems += numItems;
            }
            else{
                //PRINT OUTPUT
                System.out.println("Invalid Choice! Try Again!");
            }
        }

        //PRINT OUTPUT
        System.out.println();
        System.out.println("====FINAL RECIEPT====");
        System.out.println();

        System.out.println("Total Bill : Rs." + totalBill);
        System.out.println("Total Number of Items : " + totalItems);
    }
}