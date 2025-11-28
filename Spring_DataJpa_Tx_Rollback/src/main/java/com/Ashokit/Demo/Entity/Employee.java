package com.Ashokit.Demo.Entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EMP_TBL")
public class Employee {
	
	public Employee() {
		
	}
	
   public Employee(Integer empid,String empname,Double empsal) {
	   this.empid=empid;
	   this.empname=empname;
	   this.empsal=empsal;
	}
   
   @Id
   @Column(name="EMP_ID")
   private Integer empid;
   
   @Column(name="EMP_NAME")
   private String empname;
   
   @Column(name="EMP_SAL")
   private  Double empsal;
   
   public Integer getEmpid() {
	return empid;
}

public void setEmpid(Integer empid) {
	this.empid = empid;
}

public String getEmpname() {
	return empname;
}

public void setEmpname(String empname) {
	this.empname = empname;
}

public Double getEmpsal() {
	return empsal;
}

public void setEmpsal(Double empsal) {
	this.empsal = empsal;
}



}
