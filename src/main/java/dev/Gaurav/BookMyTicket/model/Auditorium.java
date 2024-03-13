package dev.Gaurav.BookMyTicket.model;

import dev.Gaurav.BookMyTicket.model.constant.AuditoriumFeatures;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Auditorium extends BaseModel{
    private String name;
    private int capacity;
    @OneToMany
    private List<Show> shows;
    @OneToMany
    private List<Seat> seats;
    @ElementCollection // when we have more then one enum we use this, here can can have both dolby and 2d
    @Enumerated(EnumType.STRING) // to create relation between entity class and enum in db
    private List<AuditoriumFeatures> auditoriumFeatures;
}
