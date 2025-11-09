package EntryExitDesign;

import VehicleDesign.Vehicle;
import static EntryExitDesign.EntryExitTest.vehicleSet;

public class Entry {
    private static int count = 0;
    private static int maxInstances = 2;

    public int floor;
    public int entryGate;

    // Private constructor — controlled creation
    private Entry(int floor, int entryGate) throws MaxExitEntryLimitReachedException {
        if (count >= maxInstances) {
            throw new MaxExitEntryLimitReachedException("Entry", maxInstances);
        }
        count++;

        this.floor = floor;
        this.entryGate = entryGate;
        System.out.println("✅ Entry #" + count + " created for Floor: " + floor + ", Gate: " + entryGate);
    }

    // ✅ Public factory method
    public static Entry createEntry(int floor, int entryGate) throws MaxExitEntryLimitReachedException {
        return new Entry(floor, entryGate);
    }

    public static void setMaxInstances(int max) {
        if (max < count) {
            System.out.println("⚠️ Warning: Current entry objects exceed new limit!");
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
        System.out.println("Entry Gate: " + entryGate + " on Floor: " + floor);
    }

    public void registerVehicleEntry(Vehicle vehicle) {
        vehicleSet.add(vehicle.number);
        System.out.println("🚗 Vehicle: " + vehicle.number +
                " entered at Entry Gate: " + entryGate +
                " on Floor: " + floor);
    }
}
