package dev.Gaurav.BookMyTicket.controller;

import dev.Gaurav.BookMyTicket.dto.BookTicketRequestDTO;
import dev.Gaurav.BookMyTicket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @Autowired//create the dependency and inject inside controller
    private TicketService ticketService;

    @GetMapping("/hello")
    public ResponseEntity greet(){
        String greet = ticketService.greet();
        return ResponseEntity.ok(greet);
    }

    @GetMapping("/ticket")
    public ResponseEntity bookticket(@RequestBody BookTicketRequestDTO bookTicketRequestDTO) throws Exception {
        //todo: validate empty list and all but donot
        // call database from controller just do the basic check for inputs

        return ResponseEntity.ok(
                ticketService.bookTicket(bookTicketRequestDTO.getShowSeatIds(), bookTicketRequestDTO.getUserId())
        );
    }

}
