package com.skypro.homework_14.transport;

import java.time.LocalDate;

public class Car extends Transport{
    public static class Key {
        private boolean remoteEngineStart;
        private boolean keylessStart;

        public Key(boolean remoteEngineStart, boolean keylessStart) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessStart = keylessStart;
        }
        public Key() {
            this(false, false);
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public void setRemoteEngineStart(boolean remoteEngineStart) {
            this.remoteEngineStart = remoteEngineStart;
        }

        public boolean isKeylessStart() {
            return keylessStart;
        }

        public void setKeylessStart(boolean keylessStart) {
            this.keylessStart = keylessStart;
        }

        @Override
        public String toString() {
            return "Key " + remoteEngineStart + ", keylessStart " + keylessStart;
        }
    }
    private Key key;
//    private final String brand;
//    private final String model;
    private double engineVolume;
//    private String color;
//    private final int year;
//    private final String country;
    private String transmission;
    private final String bodyType;
    private int registrationNumber;
    private final int numberOfSeats;
    private String tires;

    //    private boolean summerTires;
//    private boolean winterTires;

    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGINE_VOLUME = 1.5;
    private static final int DEFAULT_SEATS = 5;

    private static final double MAX_SPEED = 80.0;



    public Car(boolean remoteEngineStart, boolean keylessStart, String brand, String model, double engineVolume, String color, int year, String country,
               String transmission, String bodyType, int registrationNumber, int numberOfSeats, String tires, double maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
        setKey(remoteEngineStart, keylessStart);
//        if (brand.isBlank() && brand.isEmpty() || brand == null) {
//            this.brand = DEFAULT_VALUE;
//        } else {
//            this.brand = brand;
//        }
//        if (model.isBlank() && model.isEmpty() || model == null) {
//            this.model = DEFAULT_VALUE;
//        } else {
//            this.model = model;
//        }
        setEngineVolume(engineVolume);
        setColor(color);
//        if (year < 0) {
//            this.year = Math.abs(year);
//        } else if (year == 0) {
//            this.year = DEFAULT_YEAR;
//        } else {
//            this.year = year;
//        }
//        if (country.isBlank() && country.isEmpty() || country == null) {
//            this.country = DEFAULT_VALUE;
//        } else {
//            this.country = country;
//        }
        setTransmission(transmission);
        if (bodyType.isBlank() && bodyType.isEmpty() || bodyType == null) {
            this.bodyType = null;
        } else {
            this.bodyType = bodyType;
        }
        setRegistrationNumber(registrationNumber);
        if (numberOfSeats < 0) {
            this.numberOfSeats = Math.abs(numberOfSeats);
        } else if (numberOfSeats == 0) {
            this.numberOfSeats = DEFAULT_SEATS;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        setTires();
    }

    /*public Car(String brand, String model, int year, String country, String color, double engineVolume,
               String transmission, String bodyType, int registrationNumber, int numberOfSeats, String tires) {
        if (brand.isBlank() && brand.isEmpty()) {
            this.brand = null;
        } else {
            this.brand = brand;
        }
        if (model.isBlank() && model.isEmpty()) {
            this.model = null;
        } else {
            this.model = model;
        }
        if (engineVolume < 0) {
            this.engineVolume = Math.abs(engineVolume);
        } else {
            this.engineVolume = engineVolume;
        }
        if (color.isBlank() && color.isEmpty()) {
            this.color = null;
        } else {
            this.color = color;
        }
        if (year < 0) {
            this.year = Math.abs(numberOfSeats);
        } else {
            this.year = year;
        }
        if (country.isBlank() && country.isEmpty()) {
            this.country = null;
        } else {
            this.country = country;
        }
        if (transmission.isBlank() && transmission.isEmpty()) {
            this.transmission = null;
        } else {
            this.transmission = transmission;
        }
        if (bodyType.isBlank() && bodyType.isEmpty()) {
            this.bodyType = null;
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber < 0) {
            this.registrationNumber = Math.abs(numberOfSeats);
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberOfSeats < 0) {
            this.numberOfSeats = Math.abs(numberOfSeats);
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        if (tires.isBlank() && tires.isEmpty()) {
            this.tires = changeTire();
        } else {
            this.tires = tires;
        }
    }*/

    /*public Car(String brand, String model, int year, String country, String color, double engineVolume) {
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
        this("default", "default", year, "default", color, engineVolume);

    }*/

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume < 0) {
            this.engineVolume = Math.abs(engineVolume);
        } else if (engineVolume == 0) {
            this.engineVolume = DEFAULT_ENGINE_VOLUME;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    /*public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isBlank() && color.isEmpty()) {
            this.color = DEFAULT_COLOR;
        } else {
            this.color = color;
        }
    }*/

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission.isBlank() && transmission.isEmpty() || transmission == null) {
            this.transmission = DEFAULT_VALUE;
        } else {
            this.transmission = transmission;
        }
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        if (registrationNumber < 0) {
            this.registrationNumber = Math.abs(registrationNumber);
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public String getTires() {
        return tires;
    }

    public void setTires() {
        this.tires = changeTire();
    }

    /*public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return this.year;
    }

    public String getCountry() {
        return country;
    }*/

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String changeTire() {
        if (LocalDate.now().getMonthValue() >= 10 || LocalDate.now().getMonthValue() <= 3) {
            this.tires = "Зимняя резина";
        } else {
            this.tires = "Летняя резина";
        }
        return this.tires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(boolean remoteEngineStart, boolean keylessStart) {
        this.key = new Key(remoteEngineStart, keylessStart);
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", " + getYear() + " год выпуска, сборка в "
                + getCountry() + ", цвет - " + getColor() + ", объем двигателя - " + getEngineVolume()
                + " л." + getTransmission() + ", " + getBodyType() + ", " + getRegistrationNumber() + ", " + getNumberOfSeats() + ", " +
                tires + ", " + key + ", максимальная скорость: " + getMaxSpeed() + " км/ч.";
    }
}
