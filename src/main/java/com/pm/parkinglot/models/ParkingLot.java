package com.pm.parkinglot.models;

import java.util.List;

public class ParkingLot extends BaseModel{
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private ParkingLotStatus parkingLotStatus;
    private List<VehicleType> supportedVehicleTypes;
    private SpotAssignmentStratergyType spotAssignmentStratergyType;
    private FeeCalculationType feeCalculationType;

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<VehicleType> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public void setSupportedVehicleTypes(List<VehicleType> supportedVehicleTypes) {
        this.supportedVehicleTypes = supportedVehicleTypes;
    }

    public SpotAssignmentStratergyType getSpotAssignmentStratergyType() {
        return spotAssignmentStratergyType;
    }

    public void setSpotAssignmentStratergyType(SpotAssignmentStratergyType spotAssignmentStratergyType) {
        this.spotAssignmentStratergyType = spotAssignmentStratergyType;
    }

    public FeeCalculationType getFeeCalculationType() {
        return feeCalculationType;
    }

    public void setFeeCalculationType(FeeCalculationType feeCalculationType) {
        this.feeCalculationType = feeCalculationType;
    }
}
