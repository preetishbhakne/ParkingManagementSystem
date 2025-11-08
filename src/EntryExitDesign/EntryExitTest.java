package EntryExitDesign;

import VehicleDesign.Car;
import VehicleDesign.Truck;
import VehicleDesign.Vehicle;
import VehicleDesign.VehicleCategory;

import java.util.HashSet;

public class EntryExitTest {
    static HashSet<String> vehicleSet=new HashSet<>();
    public static void main(String[] args) {


        Vehicle v=new Car(2,"KA-01-HH-9999", VehicleCategory.CAR);
        Entry entry1 = new Entry(1, 101);

        entry1.registerVehicle(v);

        Exit exit1 = new Exit(1, 201);
        exit1.displayExitInfo();
        exit1.registerVehicleExit(new Truck(3,"KA-01-HH-8888", VehicleCategory.TRUCK));
        exit1.registerVehicleExit(v);
    }
}
