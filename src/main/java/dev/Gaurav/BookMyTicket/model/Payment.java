package dev.Gaurav.BookMyTicket.model;

import dev.Gaurav.BookMyTicket.model.constant.PaymentModes;
import dev.Gaurav.BookMyTicket.model.constant.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import sun.security.krb5.internal.Ticket;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private LocalDateTime paymentTime;
    private double amount;
    private String referenceId;
    @ManyToOne
    private Ticket ticket;
    @Enumerated(EnumType.STRING)
    private   PaymentStatus paymentStatus;
    @Enumerated(EnumType.STRING)
    private PaymentModes paymentModes;
}

