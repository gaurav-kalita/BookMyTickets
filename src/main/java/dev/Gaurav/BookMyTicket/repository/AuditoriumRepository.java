package dev.Gaurav.BookMyTicket.repository;

import dev.Gaurav.BookMyTicket.model.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditoriumRepository extends JpaRepository<Auditorium, Integer> {
    Auditorium findAuditoriumByName(String name);
}
