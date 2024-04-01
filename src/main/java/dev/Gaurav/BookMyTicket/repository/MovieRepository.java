package dev.Gaurav.BookMyTicket.repository;

import dev.Gaurav.BookMyTicket.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    Movie findMovieByName(String movieName);
}
