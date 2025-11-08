package EntryExitDesign;

import VehicleDesign.Vehicle;

import static EntryExitDesign.EntryExitTest.vehicleSet;

public class Entry {
    public int floor;
    public int entryGate;
    public Entry(int floor, int entryGate) {
        this.floor = floor;
        this.entryGate = entryGate;
    }
    public void displayEntryInfo() {
        System.out.println("Entry Gate: " + entryGate + " on Floor: " + floor);
    }
    public void registerVehicle(Vehicle vehicle) {
        vehicleSet.add(vehicle.number);
        System.out.println("Vehicle: "+vehicle.number+" entered at Entry Gate: " + entryGate + " on Floor: " + floor);
    }


}
