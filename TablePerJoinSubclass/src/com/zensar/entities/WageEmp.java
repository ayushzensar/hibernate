package com.zensar.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Ayush Kumar
 * @creation_date 27/09/2019
 * @modification_date 27/09/2019
 * @version 3.0
 * @copyright Zensar Technologies
 * @description It is a persistance class
 */

@Entity
@Table(name = "emp_master_2_2")
public class WageEmp extends Employee {
	private int hours;
	private float rate;
	
	public WageEmp() {
		// TODO Auto-generated constructor stub
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "WageEmp [hours=" + hours + ", rate=" + rate + "]";
	}

	public WageEmp(int empId, String name, LocalDate joinDate, double salary, int hours, float rate) {
		super(empId, name, joinDate, salary);
		this.hours = hours;
		this.rate = rate;
	}
	
	
	
}
