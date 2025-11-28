package in.ashokit.demo.request;

import lombok.Data;

@Data
public class PassengerInfo {
   private String fname;
   private String lname;
   private String from;
   private String to;
   private String flightId;
   private String jdate;
  
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
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

   
}
