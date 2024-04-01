package dev.Gaurav.BookMyTicket.repository;

import dev.Gaurav.BookMyTicket.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat, Integer> {
    Seat findSeatBySeatNumber(String seatNumber);
}
