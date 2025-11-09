package EntryExitDesign;

public class WrongVehicleExitException extends Exception{
    public WrongVehicleExitException(String vehicleNumber) {
        super("Vehicle: " + vehicleNumber + "does not exist in the parking lot");
    }
}
