package dev.Gaurav.BookMyTicket.dto;

import dev.Gaurav.BookMyTicket.model.City;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TheatreRequestDTO {
    private String name;
    private String address;
    private int cityId;

}
