package ParkingStrategy;

import Slot.ParkingSlot;

import java.util.List;

public interface ParkingStrategy {

    ParkingSlot findSlot(List<ParkingSlot> parkingSlotList);
}
