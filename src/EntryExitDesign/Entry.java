package EntryExitDesign;

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
    public void registerVehicle() {
        System.out.println("Vehicle entered at Entry Gate: " + entryGate + " on Floor: " + floor);
    }


}
