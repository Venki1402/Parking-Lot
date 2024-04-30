package services;

import dtos.ResponseStatus;
import exceptions.InvalidGateException;
import models.Gate;
import models.Ticket;
import models.VehicleType;
import repositories.GateRepository;
import dtos.IssueTicketRequestDto;
import dtos.IssueTicketResponseDto;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    // dependency injection
    private GateRepository gateRepository;
    public TicketService(GateRepository gateRepository){
        this.gateRepository = gateRepository;
    }

    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto issueTicketRequestDTO) throws InvalidGateException {
        // fetch details
        Long gateId = issueTicketRequestDTO.getGateId();
        VehicleType vehicleType = issueTicketRequestDTO.getVehicleType();
        String vehicleNumber = issueTicketRequestDTO.getVehicleNumber();
        String ownerName = issueTicketRequestDTO.getOwnerName();
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        Optional<Gate> optionalGate = gateRepository.findById(gateId);
        if(optionalGate.isEmpty()){
            throw new InvalidGateException("Invalid Gate Id");
        }
        Gate gate = optionalGate.get();
        ticket.setGeneratedAt(gate);
        ticket.setGeneratedBy(gate.getOperator());
        IssueTicketResponseDto  issueTicketResponseDTO = new IssueTicketResponseDto();
        issueTicketResponseDTO.setTicket(ticket);
        issueTicketResponseDTO.setResponseStatus(ResponseStatus.SUCCESS);
        return issueTicketResponseDTO;
    }
}
