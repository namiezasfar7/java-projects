import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //CREATE SCANNER
        Scanner input = new Scanner(System.in);

        //DECLARE VARIABLE
        int i = 0;
        String password = "";
        boolean hasDigit = false;
        boolean hasUppercase = false;

        //GET USER INPUT
        System.out.print("Enter Password : ");
        password = input.nextLine();

        //CHECK LENGTH
        if(password.length() < 8){
            //PRINT MESSAGE
            System.out.println("Password Must have at least 8 Characters!\n");
        }
        else{
            
            //CHECK EVERY CHARACTER
            while(i < password.length()){

                //DECLARE TEMPORARY VARIABLE
                char ch = password.charAt(i);

                //CHECK DIGIT
                if (ch >= '0' && ch <= '9'){
                    hasDigit = true;
                }

                //CHECK UPPERCASE LETTER
                if (ch >= 'A' && ch <= 'Z'){
                    hasUppercase = true;
                }

                //ADD COUNTER
                i ++;
            }

            //DISPLAY RESULT
            if(hasDigit && hasUppercase){
                System.out.println("Password Successful!");
            }
            else if(!hasDigit && !hasUppercase){
                System.out.println("Password must contain at least one digit and one uppercase letter!");
            }
            else if(!hasDigit){
                System.out.println("Password must contain at least one digit!");
            }
            else{
                System.out.println("Password must contain at least one uppercase letter!");
            }
        }

        //CLOSE SCANNER
        input.close();
    }
}