package Slot;

import Vehicle.Vehicle;

public class FourWheelerParkingSlot implements ParkingSlot {

    Vehicle vehicle;
    Boolean isEmpty;
    int price;
    String id;

    public FourWheelerParkingSlot(String id) {
        vehicle = null;
        isEmpty = true;
        price = 40;
        this.id = id;
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
