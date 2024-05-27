package com.uber.analysis;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            TripAnalyzer analyzer = new TripAnalyzer("data/trips.csv");

            System.out.println("Total number of trips: " + analyzer.getTotalTrips());
            System.out.println("Average distance per trip: " + analyzer.getAverageDistance() + " km");
            System.out.println("Total revenue: Rs." + analyzer.getTotalRevenue());
        } catch (IOException e) {
            System.err.println("Error reading trip data: " + e.getMessage());
        }
    }
}
