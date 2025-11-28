package com.Ashokit.Demo.Entity;




import jakarta.persistence.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name="ADD_TBL")
public class Address {
	
	public Address() {
		
	}
	
	@Id
	@Column(name="ADDR_ID")
    private Integer addrid;
 
   private String city;
   private String state;
   private  String country;
   
   @Column(name="EMP_ID")
   private Integer empid;

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}
   
public Integer getAddrId() {
    return addrid;
}

public void setAddrId(Integer addrid) {
    this.addrid = addrid;
}

public Integer getEmpId() {
    return empid;
}

public void setEmpId(Integer empid) {
    this.empid = empid;
}

}
