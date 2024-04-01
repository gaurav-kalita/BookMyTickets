package dev.Gaurav.BookMyTicket.repository;

import dev.Gaurav.BookMyTicket.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreRepository extends JpaRepository<Theatre, Integer> {
    Theatre findTheatreByName(String theatreName);
}
