import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //CREATE SCANNER
        Scanner input = new Scanner(System.in);

        //DECLARE VARIABLES
        int maths = 0, science = 0, english = 0, total = 0;
        double avg = 0.0f;
        char grade;

        //GET USER INPUT
        System.out.println("====MARKS CALCULATOR====");

        System.out.print("Enter Maths Marks : ");
        maths = input.nextInt();

        System.out.print("Enter Science Marks : ");
        science = input.nextInt();

        System.out.print("Enter English Marks : ");
        english = input.nextInt();
        System.out.println();

        //GET TOTAL
        total = maths + science + english;

        //GET AVERAGE
        avg = (double) total / 3.0;

        //GET GRADE
        if(avg >= 75){
            grade = 'A';
        }
        else if(avg >= 65){
            grade = 'B';
        }
        else if(avg >= 55){
            grade = 'C';
        }
        else if(avg >= 45){
            grade = 'D';
        }
        else{
            grade = 'W';
        }

        //PRINT OUPUT
        System.out.println("====FINAL RESULT====");
        System.out.println("Maths Marks : " + maths);
        System.out.println("Science Marks : " + science);
        System.out.println("English Marks : " + english);
        System.out.println();

        System.out.println("Total Marks : " + total);
        System.out.println("Average Marks : " + avg);
        System.out.println("Grade : " + grade);
        System.out.println();

        //CHECK PASS OR FAIL
        if(maths >= 35 && science >= 35 && english >= 35){
            System.out.println("Final Result : PASS");
        }
        else{
            System.out.println("Final Result : FAIL");
        }

        //CLOSE SCANNER
        input.close();
    }
}