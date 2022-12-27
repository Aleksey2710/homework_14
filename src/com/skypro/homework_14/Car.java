package com.skypro.homework_14;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String model, int year, String country, String color, double engineVolume) {
        this.brand = brand;
        this.model = model;
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color.isBlank()) {
            this.color = "white";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        this.country = country;
    }

    public Car(int year, String color, double engineVolume) {
        this("default", "default", year,"default", color, engineVolume);
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + year + " год выпуска, сборка в "
                + country + ", цвет - " + color + ", объем двигателя - " + engineVolume
                + " л.";
    }
}
