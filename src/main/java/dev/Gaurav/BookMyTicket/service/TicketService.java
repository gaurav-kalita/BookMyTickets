package dev.Gaurav.BookMyTicket.service;

import dev.Gaurav.BookMyTicket.model.ShowSeat;
import dev.Gaurav.BookMyTicket.model.Tickets;
import dev.Gaurav.BookMyTicket.model.constant.ShowSeatStatus;
import dev.Gaurav.BookMyTicket.repository.ShowSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TicketService {

    @Autowired
    private ShowSeatService showSeatService;

    public String greet(){
        return "Hello World";
    }

    public Tickets  bookTicket(List<Integer> showSeatIds, int userId) throws Exception{
        checkAndLockSeats(showSeatIds);
        startPayment(showSeatIds);
        return new Tickets();
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void checkAndLockSeats(List<Integer> showSwatIds) throws Exception {
        for(int showSeatId: showSwatIds){
            ShowSeat seat = showSeatService.getShowSeat(showSeatId);
            if(!seat.getShowSeatStatus().equals(ShowSeatStatus.AVAILABLE)){
                throw new Exception("Seat is not available");
            }
        }

        for(int showSeatId: showSwatIds){
            ShowSeat seat = showSeatService.getShowSeat(showSeatId);
            seat.setShowSeatStatus(ShowSeatStatus.LOCKED);
            showSeatService.saveShowSeat(seat);
        }
    }

    public boolean startPayment(List<Integer> showSeatIds){
        return true;
    }

}
