package ParkingManager;

import ParkingStrategy.ParkingStrategy;
import Slot.ParkingSlot;
import Vehicle.Vehicle;

import java.util.List;

public class ParkingManager {

    List<ParkingSlot> parkingSlotList;
    ParkingStrategy parkingStrategy;

    public ParkingManager(List<ParkingSlot> list, ParkingStrategy parkingStrategy) {
        parkingSlotList = list;
        this.parkingStrategy = parkingStrategy;
    }

    private ParkingSlot findSlot() {
        return parkingStrategy.findSlot(parkingSlotList);
    }

    void addSlot(ParkingSlot parkingSlot) {
        parkingSlotList.add(parkingSlot);
    }
    void removeSlot(ParkingSlot parkingSlot) {
        parkingSlotList.remove(parkingSlot);
    }

    void parkVehicle(Vehicle vehicle) {
        ParkingSlot parkingSlot = findSlot();
        parkingSlot.parkVehicle(vehicle);
    }
    void removeVehicle(ParkingSlot slot) {
        slot.removeVehicle();
    }
}
