package org.varrnit.CommonLldProjects.ParkingLotSystem.Service;

import org.varrnit.CommonLldProjects.ParkingLotSystem.Model.ParkingLot;
import org.varrnit.CommonLldProjects.ParkingLotSystem.Model.ParkingSpot;
import org.varrnit.CommonLldProjects.ParkingLotSystem.Model.ParkingTicket;
import org.varrnit.CommonLldProjects.ParkingLotSystem.Model.Vehicle;
import org.varrnit.CommonLldProjects.ParkingLotSystem.Util.ParkingFeeCalculator;

import java.time.LocalDateTime;
import java.util.UUID;

public class ParkingLotManager {
    private ParkingLot parkingLot;

    public ParkingLotManager(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingTicket parkVehicle(Vehicle vehicle) {
        ParkingSpot spot = parkingLot.getAvailableSpot();
        ParkingTicket ticket = new ParkingTicket(UUID.randomUUID().toString(), vehicle.getLicensePlate(), spot);
        System.out.println("Vehicle " + vehicle.getLicensePlate() + " parked at " + spot.getId());
        return ticket;
    }

    public void releaseVehicle(ParkingTicket ticket) {
        ticket.setExitTime(LocalDateTime.now());
        parkingLot.releaseSpot(ticket.getSpot());
        double fee = ParkingFeeCalculator.calculateFee(ticket);
        System.out.println("Vehicle " + ticket.getVehicleLicensePlate() + " left. Parking fee: " + fee);
    }

    // Other methods if needed
}
