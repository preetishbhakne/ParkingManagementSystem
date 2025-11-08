package EntryExitDesign;

import VehicleDesign.Vehicle;

public class Exit {
    public int floor;
    public int exitGate;
    public Vehicle vehicle;
    public Exit(int floor, int exitGate) {
        this.floor = floor;
        this.exitGate = exitGate;

    }
    public void displayExitInfo() {
        System.out.println("Exit Gate: " + exitGate + " on Floor: " + floor);
    }
    public void registerVehicleExit(Vehicle vehicle) {
        System.out.println("Vehicle "+vehicle.number+" exited at Exit Gate: " + exitGate + " on Floor: " + floor);
    }
}
