//ADDRESS CLASS
public class Address {

    //DECLARE ATTRIBUTES
    private String street;
    private String city;
    private String country;

    //INITIALIZE
    Address(String street, String city, String country){

        this.street = street;
        this.city = city;
        this.country = country;
    }

    //DECLARE METHODS
    //TO STRING
    @Override
    public String toString(){

        return "Address{ Street : " + this.street + ", City : " + this.city + ", Country : " + this.country + " }";
    }
}