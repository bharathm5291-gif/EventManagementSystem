package com.example.EventManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.EventManagementSystem.entity.Ticket;
import com.example.EventManagementSystem.repository.TicketRepository;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketRepository ticketRepo;

    @GetMapping
    public List<Ticket> getAllTickets() { return ticketRepo.findAll(); }

    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket) { return ticketRepo.save(ticket); }
}
