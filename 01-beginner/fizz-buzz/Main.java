public class Main {
    public static void main(String[] args){
        //DECLARE VARIABLES
        int count = 0, rem03 = 0, rem05 = 0;

        //LOOP UNTIL CONDITION IS TRUE
        while(count < 100){
            //CHECK REMAINDER
            rem03 = (count + 1) % 3;
            rem04 = (count + 1) % 5;

            //CHECK CONDITION
            if(rem03 == 0 && rem05 == 0){
                //PRINT OUTPUT
                System.out.println("Number " + (count + 1) + " : FIZZBUZZ");
            }
            else if(rem03 == 0){
                //PRINT OUTPUT
                System.out.println("Number " + (count + 1) + " : FIZZ");
            }
            else if(rem05 == 0){
                //PRINT OUTPUT
                System.out.println("Number " + (count + 1) + " : BUZZ");
            }
            else{
                //PRINT OUTPUT
                System.out.println("Number " + (count + 1) + " : NULL");
            }

            //ADD COUNTER
            count ++;
        }
    }
}