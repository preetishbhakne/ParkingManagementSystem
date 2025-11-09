package EntryExitDesign;

import VehicleDesign.Car;
import VehicleDesign.Truck;
import VehicleDesign.Vehicle;
import VehicleDesign.VehicleCategory;

import java.util.HashSet;

public class EntryExitTest {
    static HashSet<String> vehicleSet=new HashSet<>();
    public static void main(String[] args) {


        Vehicle v1 = new Car(2, "KA-01-HH-9999", VehicleCategory.CAR);
        Vehicle v2 = new Car(2, "KA-01-HH-1234", VehicleCategory.CAR);
        Vehicle v3 = new Truck(3, "KA-01-HH-7777", VehicleCategory.TRUCK);
        Entry entry1 = null;
        Entry entry2 = null;
        Entry entry3 = null;
        try {
            entry1 = Entry.createEntry(1);
            entry2 = Entry.createEntry(1);
            entry3 = Entry.createEntry(2);
            entry1.registerVehicleEntry(v1);
            entry2.registerVehicleEntry(v2);
            entry3.registerVehicleEntry(v3);
            entry1.displayEntryInfo();
        } catch (MaxExitEntryLimitReachedException | RuntimeException e) {
            e.printStackTrace();
        }




        Exit exit1 = null;
        try {
            exit1 = Exit.createExit(1);
        } catch (MaxExitEntryLimitReachedException e) {
            e.printStackTrace();
            ;
        }
        exit1.displayExitInfo();
        try {
           // exit1.registerVehicleExit(new Truck(3, "KA-01-HH-8888", VehicleCategory.TRUCK));
            exit1.registerVehicleExit(v1);
        } catch (WrongVehicleExitException e) {
            e.printStackTrace();
        }
    }
}
