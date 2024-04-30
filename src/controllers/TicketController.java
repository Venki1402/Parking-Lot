package controllers;

import dtos.IssueTicketRequestDto;
import dtos.IssueTicketResponseDto;
import exceptions.InvalidGateException;
import services.TicketService;

public class TicketController {
    private TicketService ticketService;
    TicketController(TicketService ticketService) {
        this.ticketService=ticketService;
    }
    public IssueTicketResponseDto createTicket(IssueTicketRequestDto issueTicketRequestDTO) throws InvalidGateException {
        return  ticketService.issueTicket(issueTicketRequestDTO);
    }
}
