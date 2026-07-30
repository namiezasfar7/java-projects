//MAIN CLASS
public class Main {
    public static void main(String[] args){

        //CREATE OBJECT
        Vehicle vehicle01 = new Vehicle("Ford", 200);
        Car car01 = new Car("Toyota", 150, "Diesel");
        ElectricCar elecCar01 = new ElectricCar("Tesla", 110, "Battery", 50);

        //CREATE ARRAY
        Vehicle[] vehicles = {vehicle01, car01, elecCar01};

        //LOOP UNTIL CONDITION IS TRUE
        for(Vehicle vehicle : vehicles){

            //CALL METHODS
            vehicle.move();

            //ACCESS SUBCLASS METHODS SAFELY
            if(vehicle instanceof Car){

                //CREATE OBJECT
                Car c = (Car) vehicle;

                //CALL METHODS
                c.refuel();
            }

            if(vehicle instanceof ElectricCar){

                //CREATE OBJECT
                ElectricCar ec = (ElectricCar) vehicle;

                //CALL METHODS
                ec.charge();
            }
        }
    }
}