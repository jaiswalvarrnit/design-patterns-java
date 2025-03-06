package org.varrnit.CommonLldProjects.ParkingLotSystem.Model;

import java.util.*;

public class ParkingLot {
    private String name;
    private Map<String, ParkingSpot> parkingSpots;
    private Set<ParkingSpot> availableSpots;
    private Set<ParkingSpot> occupiedSpots;

    public ParkingLot(String name, int capacity) {
        this.name = name;
        this.parkingSpots = new HashMap<>();
        this.availableSpots = new HashSet<>();
        this.occupiedSpots = new HashSet<>();
        for (int i = 1; i <= capacity; i++) {
            ParkingSpot spot = new ParkingSpot(i);
            parkingSpots.put(spot.getId(), spot);
            availableSpots.add(spot);
        }
    }

    public ParkingSpot getAvailableSpot() {
        if (availableSpots.isEmpty()) {
            throw new IllegalStateException("No available parking spots.");
        }
        ParkingSpot spot = availableSpots.iterator().next();
        availableSpots.remove(spot);
        occupiedSpots.add(spot);
        return spot;
    }

    public void releaseSpot(ParkingSpot spot) {
        if (occupiedSpots.contains(spot)) {
            occupiedSpots.remove(spot);
            availableSpots.add(spot);
        } else {
            throw new IllegalArgumentException("Spot not occupied.");
        }
    }

    public String getName() {
        return name;
    }

    // Other getters and setters
}

