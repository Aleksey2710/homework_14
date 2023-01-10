package com.skypro.homework_14.transport;

public class Bus extends Transport{
    private final int numberOfSeats;
    private static final int DEFAULT_SEATS = 20;

    public Bus(String brand, String model, int year, String country, String color, int numberOfSeats, double maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
        if (numberOfSeats < 0) {
            this.numberOfSeats = Math.abs(numberOfSeats);
        } else if (numberOfSeats == 0) {
            this.numberOfSeats = DEFAULT_SEATS;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + getNumberOfSeats();
    }
}
