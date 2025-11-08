package VehicleDesign;

import static java.util.UUID.randomUUID;

public class Vehicle {
    public int id;
    public String number;
    public VehicleCategory type;

    public Vehicle(int id, String number, VehicleCategory type){
        this.id = id;
        this.number = number;
        this.type = type;

    }
    public final void getParking(){
        System.out.println("Vehicle Number: " + number + " Parking ID: " + randomUUID().toString());

    }

}
