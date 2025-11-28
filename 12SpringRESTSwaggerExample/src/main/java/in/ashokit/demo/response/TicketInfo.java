package in.ashokit.demo.response;

import lombok.Data;

@Data
public class TicketInfo {
	   private String name;
	   private String from;
	   private String to;
	   private String flightId;
	   private String jdate;
	   private String ticketid;
	   public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getJdate() {
		return jdate;
	}
	public void setJdate(String jdate) {
		this.jdate = jdate;
	}
	public String getTicketid() {
		return ticketid;
	}
	public void setTicketid(String ticketid) {
		this.ticketid = ticketid;
	}
	public String getTicketstatus() {
		return ticketstatus;
	}
	public void setTicketstatus(String ticketstatus) {
		this.ticketstatus = ticketstatus;
	}
	public String getTicketprice() {
		return ticketprice;
	}
	public void setTicketprice(String ticketprice) {
		this.ticketprice = ticketprice;
	}
	private String ticketstatus;
	   private String ticketprice;
}
