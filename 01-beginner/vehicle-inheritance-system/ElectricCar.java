//ELECTRIC CAR CLASS
public class ElectricCar extends Car {

    //DECLARE ATTRIBUTES
    int batteryLevel;

    //PARAMETERIZE CONSTRUCTORS
    ElectricCar(String brand, int speed, String fuelType, int batteryLevel){

        super(brand, speed, fuelType);

        this.batteryLevel = batteryLevel;
    }

    //DECLARE METHODS
    void charge(){

        System.out.println(this.brand + " is charging. Battery : " + batteryLevel + "%");
    }
}