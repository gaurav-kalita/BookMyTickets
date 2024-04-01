package dev.Gaurav.BookMyTicket.model;

import dev.Gaurav.BookMyTicket.model.constant.ShowSeatStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

///showseat is virtual identity as "availability" of 'seat' depends on 'show'
@Getter
@Setter
@Entity
public class ShowSeat  extends BaseModel{
    private  int price;
    @ManyToOne
    private Show show;
    @ManyToOne
    private Seat seat;
    @Enumerated(EnumType.STRING)
    private ShowSeatStatus showSeatStatus;

    public ShowSeat(int i, Show show, Seat seatBySeatNumber, ShowSeatStatus available) {
        super();
    }
}