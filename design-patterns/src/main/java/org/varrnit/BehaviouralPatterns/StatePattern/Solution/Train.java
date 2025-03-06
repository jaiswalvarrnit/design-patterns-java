package org.varrnit.BehaviouralPatterns.StatePattern.Solution;

public class Train implements TransportationMode {
    @Override
    public int calcETA() {
        System.out.println("Calculating ETA (Train)");
        return 7;  // Example ETA for train
    }

    @Override
    public String getDirection() {
        return "Directions for train route";
    }
}