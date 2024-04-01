package dev.Gaurav.BookMyTicket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class BookMyTicketApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMyTicketApplication.class, args);
	}

}
