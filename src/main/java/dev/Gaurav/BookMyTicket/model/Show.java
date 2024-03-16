package dev.Gaurav.BookMyTicket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModel {
        private LocalDateTime startDate;
        private LocalDateTime endDate;
        private Movie movie;
        private Auditorium auditorium;
        @ManyToMany
        private List<ShowSeat> showSeats;
}
