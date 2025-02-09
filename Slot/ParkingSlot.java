package Slot;

import Vehicle.Vehicle;
public interface ParkingSlot {

    void parkVehicle(Vehicle vehicle);
    void removeVehicle();
    boolean isEmpty();

}
