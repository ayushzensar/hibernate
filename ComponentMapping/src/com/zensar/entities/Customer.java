package com.zensar.entities;

import java.sql.Blob;
import java.sql.Clob;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ayush Kumar
 * @creation date- 26/09/2019
 * creation time-14:56
 * @version 1.0
 * @copyright Zensar Technologies
 *
 */

@Entity
@Table (name = "customer")
public class Customer {
	@Id
	@Column (name = "cid")
	private int customerId;
	private Name customerName;
	private String gender;
	private int age;
	@Column (nullable = false)
	private String address;
	private LocalDate birthDay;
	private Blob profilePhoto;
	private Clob description;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}


	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public Name getCustomerName() {
		return customerName;
	}

	public void setCustomerName(Name customerName) {
		this.customerName = customerName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public LocalDate getBirthDay() {
		return birthDay;
	}
	
	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public Blob getProfilePhoto() {
		return profilePhoto;
	}

	public void setProfilePhoto(Blob profilePhoto) {
		this.profilePhoto = profilePhoto;
	}
	

	public Clob getDescription() {
		return description;
	}


	public void setDescription(Clob description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", gender=" + gender + ", age=" + age + "]";
	}



	public Customer(int customerId, Name customerName, String gender, int age, String address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.gender = gender;
		this.age = age;
		this.address = address;
	}


}
