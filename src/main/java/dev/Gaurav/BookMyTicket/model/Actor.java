package dev.Gaurav.BookMyTicket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity //tells that this file should become a table
public class Actor extends BaseModel {
    private String name;
    @ManyToMany
    private List<Movie> movies;
}
