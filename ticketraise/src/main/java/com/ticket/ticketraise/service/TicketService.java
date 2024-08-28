package com.ticket.ticketraise.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.ticketraise.entity.Ticket;
import com.ticket.ticketraise.repository.TicketRepo;

@Service
public class TicketService {
    @Autowired
    private TicketRepo Ticketrepo;

    public Ticket raiseTicket(Ticket ticket) {
        return Ticketrepo.save(ticket);
    }

    public List<Ticket> viewTicketsByPriority(String priority) {
        return Ticketrepo.findByPriority(priority);
    }

    public Ticket resolveTicket(Long ticketId) {
        Ticket ticket = Ticketrepo.findById(ticketId).orElseThrow();
        ticket.setStatus("raised");
        ticket.setResolvedAt(LocalDateTime.now());
        return Ticketrepo.save(ticket);
    }

    public Ticket getTicketById(Long ticketId) {
        return Ticketrepo.findById(ticketId).orElseThrow();
    }

}
