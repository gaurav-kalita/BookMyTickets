package dev.Gaurav.BookMyTicket.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity //tells that this file should become a table
public class Actor extends BaseModel {
    private String name;
}
