package dev.Gaurav.BookMyTicket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import sun.security.krb5.internal.Ticket;

import java.util.List;

@Getter
@Setter
@Entity(name = "BOOKING_USER")
public class User extends  BaseModel{
    private String name;
    private String email;
    @OneToMany
    private List<Ticket> tickets;
}
