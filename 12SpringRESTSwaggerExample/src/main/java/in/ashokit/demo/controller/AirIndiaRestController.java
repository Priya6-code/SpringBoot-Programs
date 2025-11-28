package in.ashokit.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.demo.request.PassengerInfo;
import in.ashokit.demo.response.TicketInfo;

@RestController
public class AirIndiaRestController {
	
	@PostMapping("/bookFlightTicket")
	public ResponseEntity<TicketInfo> bookTicket(PassengerInfo pinfo){
		
		TicketInfo ti=new TicketInfo();
		ti.setName(pinfo.getFname()+" "+pinfo.getLname());
		ti.setFrom(pinfo.getFrom());
		ti.setTo(pinfo.getTo());
		ti.setJdate(pinfo.getJdate());
		ti.setTicketstatus("CONFIRMED");
		ti.setFlightId("24345");
		ti.setTicketprice("456.00 INR");
		
		return new ResponseEntity<>(ti,HttpStatus.CREATED);
	
	}

}
