package dev.Gaurav.BookMyTicket.model;

import dev.Gaurav.BookMyTicket.model.constant.ShowSeatStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;

///showseat is virtual identity as "availability" of 'seat' depends on 'show'
class ShowSeat  extends BaseModel{
    private  int price;
    @OneToMany
    private Show show;
    @OneToMany
    private Seat seat;
    @Enumerated(EnumType.STRING)
    private ShowSeatStatus showSeatStatus;
}