package com.example.EventManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.EventManagementSystem.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
