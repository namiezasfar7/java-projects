//VEHICLE CLASS
public abstract class Vehicle {

    //DECLARE ATTRIBUTES
    String brand;
    int speed;

    //INITIALIZE
    Vehicle(String brand, int speed){

        this.brand = brand;
        this.speed = speed;
    }

    //DECLARE METHODS
    @Override
    public String toString(){

        return "Vehicle{ Brand : " + brand + ", Speed : " + speed + "}";
    }

    abstract void fuelUp();

    void move(){

        System.out.println(brand + " is moving at " + speed + " km/h");
    }
}