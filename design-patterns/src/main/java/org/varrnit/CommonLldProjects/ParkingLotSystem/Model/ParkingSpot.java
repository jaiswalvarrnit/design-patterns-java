package org.varrnit.CommonLldProjects.ParkingLotSystem.Model;

public class ParkingSpot {
    private final String id;

    public ParkingSpot(int number) {
        this.id = "Spot-" + number;
    }

    public String getId() {
        return id;
    }

    // Other methods if needed
}

