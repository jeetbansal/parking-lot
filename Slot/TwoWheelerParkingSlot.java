package Slot;

import Vehicle.Vehicle;

public class TwoWheelerParkingSlot implements ParkingSlot {

    Vehicle vehicle;
    Boolean isEmpty;
    int price;

    String id;

    public TwoWheelerParkingSlot(String id) {
        this.id = id;
        vehicle = null;
        isEmpty = true;
        price = 20;
    }

    @Override
    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        isEmpty = false;
    }

    @Override
    public void removeVehicle() {
        vehicle = null;
        isEmpty = true;
    }

    @Override
    public boolean isEmpty() {
        return isEmpty;
    }
}
