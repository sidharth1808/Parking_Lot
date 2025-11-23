package com.pm.parkinglot.models;

import java.util.Date;

public class Ticket {
    private String number;
    private Date entryTime;
    private Vehicle vehicle;
    private ParkingSpot assignedParkingSpot;
    private Gate genratedAt;
    private Operator generatedBy;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Gate getGenratedAt() {
        return genratedAt;
    }

    public void setGenratedAt(Gate genratedAt) {
        this.genratedAt = genratedAt;
    }

    public Operator getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(Operator generatedBy) {
        this.generatedBy = generatedBy;
    }

    public ParkingSpot getAssignedParkingSpot() {
        return assignedParkingSpot;
    }

    public void setAssignedParkingSpot(ParkingSpot assignedParkingSpot) {
        this.assignedParkingSpot = assignedParkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }
}
