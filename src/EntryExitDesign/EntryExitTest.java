package EntryExitDesign;

import VehicleDesign.Car;
import VehicleDesign.Truck;
import VehicleDesign.Vehicle;
import VehicleDesign.VehicleCategory;

import java.util.HashSet;

public class EntryExitTest {
    static HashSet<String> vehicleSet=new HashSet<>();
    public static void main(String[] args) {


        Vehicle v = new Car(2, "KA-01-HH-9999", VehicleCategory.CAR);
        Entry entry1 = null;
        try {
            entry1 = Entry.createEntry(1, 101);
        } catch (MaxExitEntryLimitReachedException e) {
            e.printStackTrace();
        }

        entry1.registerVehicleEntry(v);

        Exit exit1 = null;
        try {
            exit1 = Exit.createExit(1, 201);
        } catch (MaxExitEntryLimitReachedException e) {
            e.printStackTrace();
            ;
        }
        exit1.displayExitInfo();
        try {
            exit1.registerVehicleExit(new Truck(3, "KA-01-HH-8888", VehicleCategory.TRUCK));
            exit1.registerVehicleExit(v);
        } catch (WrongVehicleExitException e) {
            e.printStackTrace();
        }
    }
}
