package com.pm.parkinglot.stratergies;

import com.pm.parkinglot.models.Gate;
import com.pm.parkinglot.models.ParkingSpot;
import com.pm.parkinglot.models.VehicleType;

public interface SpotAssignmentStratergy {
    public ParkingSpot assignSpot(VehicleType vehicleType, Gate gate);
}
