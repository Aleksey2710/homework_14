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
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private int registrationNumber;
    private final int numberOfSeats;
    private String tires;


    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGINE_VOLUME = 1.5;
    private static final int DEFAULT_SEATS = 5;

    private static final double MAX_SPEED = 80.0;



    public Car(boolean remoteEngineStart, boolean keylessStart, String brand, String model, double engineVolume, String color, int year, String country,
               String transmission, String bodyType, int registrationNumber, int numberOfSeats, String tires, double maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
        setKey(remoteEngineStart, keylessStart);
        setEngineVolume(engineVolume);
        setColor(color);
        setTransmission(transmission);
        if (bodyType == null || bodyType.isBlank() || bodyType.isEmpty()) {
            this.bodyType = DEFAULT_VALUE;
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

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank() || transmission.isEmpty()) {
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
