package EntryExitDesign;

import VehicleDesign.Car;
import VehicleDesign.Truck;
import VehicleDesign.Vehicle;
import VehicleDesign.VehicleCategory;

public class EntryExitTest {
    public static void main(String[] args) {


        Vehicle v=new Car(2,"KA-01-HH-9999", VehicleCategory.CAR);

        Exit exit1 = new Exit(1, 201);
        exit1.displayExitInfo();
        exit1.registerVehicleExit(v);
    }
}
