package dev.Gaurav.BookMyTicket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class City {
    private String  name;
    @OneToMany
    private List<Theatre> theatres;
}
