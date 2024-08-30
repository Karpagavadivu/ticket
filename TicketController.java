package com.ticket.ticketraise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.ticketraise.entity.Ticket;
import com.ticket.ticketraise.service.TicketService;

@RestController
@RequestMapping("/api/support_tickets")
public class TicketController {
    @Autowired
    private TicketService Ticketservice;

    @PostMapping("/raise")
    public Ticket raiseTicket(@RequestBody Ticket ticket) {
        return Ticketservice.raiseTicket(ticket);
    }

    @GetMapping("/view-by-priority")
    public List<Ticket> viewTicketsByPriority(@RequestParam String priority) {
        return Ticketservice.viewTicketsByPriority(priority);
    }

    @GetMapping("/view/{ticketId}")
    public Ticket getTicketById(@PathVariable Long ticketId) {
        return Ticketservice.getTicketById(ticketId);
    }

    @PutMapping("{ticketId}")
    public Ticket resolveTicket(@PathVariable Long ticketId) {
        return Ticketservice.resolveTicket(ticketId);
    }



}
