import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //CREATE SCANNER
        Scanner input = new Scanner(System.in);

        //DECLARE VARIABLES
        int choice = 0, quantity = 0, totalItems = 0;
        double price = 0.0, total = 0.0, discount = 0.0, finalAmt = 0.0;

        System.out.println("====VENDING MACHINE====");

        //LOOP UNTIL CONDITION IS TRUE
        while(choice != 4){
            //RESET PRICE & QUANTITY
            price = 0.0f;
            quantity = 0;

            //DISPLAY MENU
            System.out.println("\n1. Coke     250");
            System.out.println("2. Pepsi    300");
            System.out.println("3. Water    100");
            System.out.println("4. Finish\n");

            //GET USER INPUT
            System.out.print("Enter Choice : ");
            choice = input.nextInt();

            //CHECK CHOICE
            if(choice == 1 || choice == 2 || choice == 3){
                System.out.print("Enter Quantity : ");
                quantity = input.nextInt();

                //CHECK VALIDITY
                if(quantity < 1){
                    System.out.println("\nInvalid Quantity!");
                    continue;
                }
            }

            //CHECK CONDITION
            switch(choice){
                case 1 ->
                    price = 250;
                case 2 ->
                    price = 300;
                case 3 ->
                    price = 100;
                case 4 ->
                    System.out.println("\nThank You For Using This System!");
                default ->
                    System.out.println("\nInvalid Choice! Try Again!");
            }

            //CALCULATE ONLY IF CHOICE IS VALID
            if(choice == 1 || choice == 2 || choice == 3){
                //CALCULATE TOTAL
                total += (price * quantity);

                //CALCULATE TOTAL ITEMS
                totalItems += quantity;
            }
        }

        //CHECK FOR DISCOUNT
        if(total > 1000){
            discount = total * 0.1;
            finalAmt = total - discount;
        }
        else{
            finalAmt = total;
        }

        //PRINT OUTPUT
        System.out.println("===============INVOICE===============\n");
        System.out.println("Total Items Purchased  :   " + totalItems + " Item(s)");
        System.out.printf("\nBill Amount            :   Rs. %.2f\n", total);
        System.out.printf("Discount               :   Rs. %.2f\n", discount);
        System.out.printf("\nFinal Bill Amount      :   Rs. %.2f\n", finalAmt);
        System.out.println("=====================================");

        //CLOSE SCANNER
        input.close();
    }
}