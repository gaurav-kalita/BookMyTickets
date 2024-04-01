package dev.Gaurav.BookMyTicket.repository;

import dev.Gaurav.BookMyTicket.model.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Tickets, Integer> {
}
