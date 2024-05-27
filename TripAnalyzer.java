package com.uber.analysis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TripAnalyzer {
    private List<Trip> trips;

    public TripAnalyzer(String filePath) throws IOException {
        this.trips = new ArrayList<>();
        loadTrips(filePath);
    }

    private void loadTrips(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line = reader.readLine(); // Skip header

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            Trip trip = new Trip(
                Integer.parseInt(parts[0]),
                Integer.parseInt(parts[1]),
                Integer.parseInt(parts[2]),
                parts[3],
                parts[4],
                Double.parseDouble(parts[5]),
                Double.parseDouble(parts[6])
            );
            trips.add(trip);
        }
        reader.close();
    }

    public int getTotalTrips() {
        return trips.size();
    }

    public double getAverageDistance() {
        double totalDistance = 0;
        for (Trip trip : trips) {
            totalDistance += trip.getDistanceKm();
        }
        return totalDistance / trips.size();
    }

    public double getTotalRevenue() {
        double totalRevenue = 0;
        for (Trip trip : trips) {
            totalRevenue += trip.getFareAmount();
        }
        return totalRevenue;
    }
}
