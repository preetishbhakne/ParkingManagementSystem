package EntryExitDesign;

import VehicleDesign.Vehicle;
import static EntryExitDesign.EntryExitTest.vehicleSet;

public class Entry {
    private static int count = 0;
    private static int maxInstances = 2;

    public int floor;



    private Entry(int floor) throws MaxExitEntryLimitReachedException {
        if (count >= maxInstances) {
            throw new MaxExitEntryLimitReachedException("Entry", maxInstances);
        }
        count++;

        this.floor = floor;

        System.out.println("Entry #" + count + " created for Floor: " + floor);
    }


    public static Entry createEntry(int floor) throws MaxExitEntryLimitReachedException {
        return new Entry(floor);
    }

    public static void setMaxInstances(int max) {
        if (max < count) {
            System.out.println("Warning: Current entry objects exceed new limit!");
        }
        maxInstances = max;
    }

    public static int getMaxInstances() {
        return maxInstances;
    }

    public static int getCount() {
        return count;
    }

    public void displayEntryInfo() {
        System.out.println("Entry Gate: " + count + " on Floor: " + floor);
    }

    public void registerVehicleEntry(Vehicle vehicle) {
        vehicleSet.add(vehicle.number);
        System.out.println("Vehicle: " + vehicle.number +
                " entered at Entry Gate: " + count +
                " on Floor: " + floor);
    }
}
