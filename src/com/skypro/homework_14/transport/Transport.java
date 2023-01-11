package com.skypro.homework_14.transport;

public abstract class Transport {
    private String brand;
    private String model;
    private final int year;
    private final String country;
    private String color;
    private double maxSpeed;

    private static final String DEFAULT_VALUE = "default";
    private static final double MAX_SPEED = 80.0;
    private static final int DEFAULT_YEAR = 2000;
    private static final String DEFAULT_COLOR = "white";

    public Transport(String brand, String model, int year, String country, String color, double maxSpeed) {
        setBrand(brand);
        setModel(model);
        if (year < 0) {
            this.year = Math.abs(year);
        } else if (year == 0) {
            this.year = DEFAULT_YEAR;
        } else {
            this.year = year;
        }
        if (country == null || country.isBlank() || country.isEmpty()) {
            this.country = DEFAULT_VALUE;
        } else {
            this.country = country;
        }
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }
    }

    public int getYear() {
        return year;
    }


    public String getCountry() {
        return country;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = DEFAULT_COLOR;
        } else {
            this.color = color;
        }
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed < 0) {
            this.maxSpeed = Math.abs(maxSpeed);
        } else if (maxSpeed == 0) {
            this.maxSpeed = MAX_SPEED;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", " + getYear() + ", " + getCountry() + ", " + getColor() + ", " + getMaxSpeed();
    }
}
