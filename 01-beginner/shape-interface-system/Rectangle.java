//RECTANGLE CLASS
public class Rectangle extends Shape implements Drawable, Resizable {

    //DECLARE ATTRIBUTES
    double width;
    double height;

    //INITIALIZE
    Rectangle(String color, double width, double height){

        super(color);

        this.width = width;
        this.height = height;
    }

    //DECLARE METHOD
    //TO STRING METHOD
    @Override
    public String toString(){

        return "Rectangle{ Color : " + super.color + ", Width : " + this.width + ", Height : " + this.height + " }";
    }

    //GET AREA METHOD
    @Override
    double getArea(){

        return this.height * this.width;
    }

    //DRAW METHOD
    @Override
    public void draw(){

        System.out.println("Drawing rectangle " + this.width + " x " + this.height);
    }

    //RESIZE METHOD
    @Override
    public void resize(double factor){

        System.out.println("New Width  : " + (this.width * factor));
        System.out.println("New Height : " + (this.height * factor));
    }
}