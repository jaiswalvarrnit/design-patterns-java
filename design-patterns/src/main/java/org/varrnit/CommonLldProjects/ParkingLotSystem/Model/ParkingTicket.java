package org.varrnit.CommonLldProjects.ParkingLotSystem.Model;

import java.time.LocalDateTime;

public class ParkingTicket {
    private final String ticketId;
    private final String vehicleLicensePlate;
    private final LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private ParkingSpot spot;

    public ParkingTicket(String ticketId, String vehicleLicensePlate, ParkingSpot spot) {
        this.ticketId = ticketId;
        this.vehicleLicensePlate = vehicleLicensePlate;
        this.entryTime = LocalDateTime.now();
        this.spot = spot;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getVehicleLicensePlate() {
        return vehicleLicensePlate;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    // Other methods if needed
}

