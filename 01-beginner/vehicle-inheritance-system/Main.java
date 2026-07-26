//MAIN CLASS
public class Main {
    public static void main(String[] args){

        //CREATE OBJECT
        Vehicle vehicle01 = new Vehicle("Ford", 200);
        Car car01 = new Car("Toyota", 150, "Diesel");
        ElectricCar elecCar01 = new ElectricCar("Tesla", 110, "Battery", 50);

        //CALL METHODS
        vehicle01.move();
        System.out.println();

        car01.move();
        car01.refuel();
        System.out.println();

        elecCar01.move();
        elecCar01.refuel();
        elecCar01.charge();
    }
}