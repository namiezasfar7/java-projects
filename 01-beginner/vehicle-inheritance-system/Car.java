//CAR CLASS
public class Car extends Vehicle {

    //DECLARE ATTRIBUTES
    String fuelType;

    //PARAMETERIZE CONSTRUCTORS
    Car(String brand, int speed, String fuelType){

        super(brand, speed);

        this.fuelType = fuelType;
    }

    //DECLARE METHODS
    void refuel(){

        System.out.println(this.brand + " is refueling with " + fuelType);
    }
}