package com.pm.parkinglot.services;

import com.pm.parkinglot.exceptions.GateNotFoundException;
import com.pm.parkinglot.factory.SpotAssignmentStartergyFactory;
import com.pm.parkinglot.models.*;

import com.pm.parkinglot.respositories.GateRepository;
import com.pm.parkinglot.respositories.ParkingLotRepositoy;
import com.pm.parkinglot.respositories.TicketRepsoitory;
import com.pm.parkinglot.respositories.VehicleRepository;
import com.pm.parkinglot.stratergies.SpotAssignmentStratergy;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepositoy parkingLotRepositoy;
    private TicketRepsoitory ticketRepsoitory;
    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, ParkingLotRepositoy parkingLotRepositoy, TicketRepsoitory ticketRepsoitory) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepositoy = new ParkingLotRepositoy();
        this.ticketRepsoitory = ticketRepsoitory;
    }
    public Ticket issueTicket(Long gateId, String vehicleNumber, String vehicleOwnerName, VehicleType vehicleType) throws GateNotFoundException {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        Optional<Gate> optionalGate = gateRepository.findGateById(gateId);
        if(optionalGate.isEmpty()){
            throw new GateNotFoundException("Gate not found");
        }
        Gate gate = optionalGate.get();
        ticket.setGenratedAt(gate);
        ticket.setGeneratedBy(gate.getOperator());
        Optional<Vehicle> optionalVehicle =vehicleRepository.findByVehicleNumber(vehicleNumber);
        Vehicle savedVehicle = null;
                if(optionalVehicle.isEmpty()){
                    Vehicle vehicle = new Vehicle();
                    vehicle.setVehicleNumber(vehicleNumber);
                    vehicle.setVehicleType(vehicleType);
                    vehicle.setOwnerName(vehicleOwnerName);
                    savedVehicle = vehicleRepository.save(vehicle);
                }else {
                    savedVehicle = optionalVehicle.get();
                }
                ticket.setVehicle(savedVehicle);
        ParkingLot parkingLot = parkingLotRepositoy.getParkingLotById(gateId);
        SpotAssignmentStratergyType spotAssignmentStratergyType = parkingLot.getSpotAssignmentStartergy();
        SpotAssignmentStratergy spotAssignmentStratergy = SpotAssignmentStartergyFactory.getSpotAssignmentStartergy(spotAssignmentStratergyType);
        ParkingSpot parkingSpot = spotAssignmentStratergy.assignSpot(vehicleType,gate);
        ticket.setAssignedParkingSpot(parkingSpot);
        ticket.setNumber("TICKET"+ticket.getEntryTime().getTime());
        return ticketRepsoitory.save(ticket);



        return null;
    }
}
