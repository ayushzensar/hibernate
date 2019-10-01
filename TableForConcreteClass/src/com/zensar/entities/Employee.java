package com.zensar.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * @author Ayush Kumar
 * @creation_date 27/09/2019
 * @modification_date 27/09/2019
 * @version 2.0
 * @modification_time 14:20
 * @copyright Zensar Technologies
 * @description It is a persistance class
 */

@Entity
@Table (name = "emp_master_1")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String name;
	private LocalDate joinDate;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", joinDate=" + joinDate + ", salary=" + salary + "]";
	}

	public Employee(int empId, String name, LocalDate joinDate, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.joinDate = joinDate;
		this.salary = salary;
	}
	
}
