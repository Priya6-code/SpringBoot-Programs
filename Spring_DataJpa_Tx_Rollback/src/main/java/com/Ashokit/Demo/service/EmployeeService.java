package com.Ashokit.Demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Ashokit.Demo.Entity.Address;
import com.Ashokit.Demo.Entity.Employee;
import com.Ashokit.Demo.repository.AddressRepository;
import com.Ashokit.Demo.repository.EmployeeRepository;




@Service
public class EmployeeService {

	 private EmployeeRepository emprepo;
	 private AddressRepository  adrrepo;
	 
	 @Autowired
	 public EmployeeService(EmployeeRepository emprepo,AddressRepository  adrrepo) {
		 super();
		 this.emprepo=emprepo;
		 this.adrrepo=adrrepo;
	 }
	 @Transactional(rollbackFor=Exception.class)
	 public void saveData() {
		 
		 Employee emp=new Employee();
		 emp.setEmpid(201);
		 emp.setEmpname("Priya");
		 emp.setEmpsal(60000.00);
		 emprepo.save(emp);
		 
		 int i=10/0;
		 
		 Address add=new Address();
		 add.setCity("Gnt");
		 add.setState("AP");
		 add.setCountry("India");
		 add.setAddrId(501);
		 add.setEmpId(201);
		 adrrepo.save(add);
		 
		 
	 }
	 
}
