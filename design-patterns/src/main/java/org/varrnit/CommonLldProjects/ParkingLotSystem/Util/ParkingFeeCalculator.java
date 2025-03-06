package org.varrnit.CommonLldProjects.ParkingLotSystem.Util;

import org.varrnit.CommonLldProjects.ParkingLotSystem.Model.ParkingTicket;

import java.time.Duration;
import java.time.LocalDateTime;

public class ParkingFeeCalculator {
    private static final double HOURLY_RATE = 10.0;

    public static double calculateFee(ParkingTicket ticket) {
        if (ticket.getExitTime() == null) {
            throw new IllegalStateException("Exit time not set.");
        }
        Duration duration = Duration.between(ticket.getEntryTime(), ticket.getExitTime());
        long hours = duration.toHours();
        return hours * HOURLY_RATE;
    }
}

