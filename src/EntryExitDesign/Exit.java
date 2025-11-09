package EntryExitDesign;

import VehicleDesign.Vehicle;
import static EntryExitDesign.EntryExitTest.vehicleSet;

public class Exit {
    private static int count = 0;
    private static int maxInstances = 2;

    public int floor;


    // Private constructor — controlled creation
    private Exit(int floor) throws MaxExitEntryLimitReachedException {
        if (count >= maxInstances) {
            throw new MaxExitEntryLimitReachedException("Exit", maxInstances);
        }
        count++;

        this.floor = floor;

        System.out.println("Exit #" + count + " created for Floor: " + floor );
    }


    public static Exit createExit(int floor) throws MaxExitEntryLimitReachedException {
        return new Exit(floor);
    }

    public static void setMaxInstances(int max) {
        if (max < count) {
            System.out.println("Warning: Current exit objects exceed new limit!");
        }
        maxInstances = max;
    }

    public static int getMaxInstances() {
        return maxInstances;
    }

    public static int getCount() {
        return count;
    }

    public void displayExitInfo() {
        System.out.println("Exit Gate: " + count + " on Floor: " + floor);
    }

    public void registerVehicleExit(Vehicle vehicle) throws WrongVehicleExitException {
        if (!vehicleSet.contains(vehicle.number)) {
           throw new WrongVehicleExitException(vehicle.number);
        }
            vehicleSet.remove(vehicle.number);
            System.out.println("Vehicle: " + vehicle.number +
                    " exited at Entry Gate: " + count +
                    " on Floor: " + floor);

    }
}
