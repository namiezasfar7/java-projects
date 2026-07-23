//BOOK CLASS
class Book {

    //DECLARE ATTRIBUTES
    protected String code;
    protected String title;
    protected double unitPrice;

    //PARAMETERIZE CONSTRUCTOR
    public Book(String code, String title, double unitPrice){

        this.code = code;
        this.title = title;
        this.unitPrice = unitPrice;
    }
}

//NOVEL CLASS
class Novel extends Book {

    //DECLARE ATTRIBUTES
    double discountRate;

    //PARAMETERIZE CONSTRUCTOR
    public Novel(String code, String title, double unitPrice, double discountRate){

        //CALL PARENT CONSTRUCTOR
        super(code, title, unitPrice);

        this.discountRate = discountRate;
    }

    //DECLARE METHODS
    //CALCULATE DISCOUNT
    public double calculateDiscountPrice() {

        return unitPrice - (unitPrice * discountRate / 100);
    }

    //PRINT OUTPUT
    public void display(){

        System.out.println("Code : " + code);
        System.out.println("Title : " + title);
        System.out.println("Discounted Price : " + calculateDiscountPrice());
        System.out.println();
    }
}

//MAIN CLASS
public class Main {
    public static void main(String[] args) {

        //DECLARE OBJECT
        Novel novel01 = new Novel("N101", "Harry Potter", 2500, 10);
        Novel novel02 = new Novel("N102", "The Alchemist", 1800, 15);

        //CALL METHODS
        novel01.display();
        novel02.display();
    }
}