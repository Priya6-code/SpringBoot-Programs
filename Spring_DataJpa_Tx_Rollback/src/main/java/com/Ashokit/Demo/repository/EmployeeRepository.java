/*package com.Ashokit.Demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Ashokit.Demo.Entity.Employee;

public class EmployeeRepository extends JpaRepository<Employee,Serializable>{

	public void save(Employee emp) {
		// TODO Auto-generated method stub
	}	
	}*/


//EmployeeRepository.java
package com.Ashokit.Demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ashokit.Demo.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Serializable> {
}
