package org.varrnit.CommonLldProjects.ParkingLotSystem;

import org.varrnit.CommonLldProjects.ParkingLotSystem.Model.ParkingLot;
import org.varrnit.CommonLldProjects.ParkingLotSystem.Model.ParkingTicket;
import org.varrnit.CommonLldProjects.ParkingLotSystem.Model.Vehicle;
import org.varrnit.CommonLldProjects.ParkingLotSystem.Model.VehicleType;
import org.varrnit.CommonLldProjects.ParkingLotSystem.Service.ParkingLotManager;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot("Central Parking", 10);
        ParkingLotManager manager = new ParkingLotManager(parkingLot);

        Vehicle car1 = new Vehicle("KA-01-1234", VehicleType.CAR);
        Vehicle bike1 = new Vehicle("KA-02-5678", VehicleType.MOTORBIKE);

        ParkingTicket ticket1 = manager.parkVehicle(car1);
        ParkingTicket ticket2 = manager.parkVehicle(bike1);

        manager.releaseVehicle(ticket1);
        manager.releaseVehicle(ticket2);
    }
}

