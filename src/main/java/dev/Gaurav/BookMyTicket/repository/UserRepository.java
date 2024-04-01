package dev.Gaurav.BookMyTicket.repository;

import dev.Gaurav.BookMyTicket.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
