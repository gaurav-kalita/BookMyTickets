package dev.Gaurav.BookMyTicket.repository;

import dev.Gaurav.BookMyTicket.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
