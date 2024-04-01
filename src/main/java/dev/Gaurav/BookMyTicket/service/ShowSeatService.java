package dev.Gaurav.BookMyTicket.service;

import dev.Gaurav.BookMyTicket.model.ShowSeat;
import dev.Gaurav.BookMyTicket.repository.ShowSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShowSeatService {
    @Autowired
    private ShowSeatRepository showSeatRepository;

    public ShowSeat getShowSeat(int showSeatId){
        return showSeatRepository.findById(showSeatId).get();
    }

    public ShowSeat saveShowSeat(ShowSeat showSeat){
        return showSeatRepository.save(showSeat); //save means both save and update ie upsert
    }
}
