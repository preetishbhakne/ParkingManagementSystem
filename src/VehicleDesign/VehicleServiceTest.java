package VehicleDesign;

public class VehicleServiceTest {
    public static void main(String[] args) {
        int id=1;

        Vehicle v1=new Car(id++,"KA-01-HH-1234",VehicleCategory.CAR);
        v1.getParking();

    }
}
