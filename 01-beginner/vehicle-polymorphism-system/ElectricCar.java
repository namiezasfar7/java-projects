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
    @Override
    void move(){

        System.out.println(this.brand + " is moving at " + this.speed + " km/h with Fuel Type " + fuelType + " and Battery Level " + batteryLevel);
    }

    void charge(){

        System.out.println(this.brand + " is charging. Battery : " + batteryLevel + "%");
    }
}