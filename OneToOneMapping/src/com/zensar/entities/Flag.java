package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author Ayush Kumar
 * @creation_date- 26/09/2019
 * @creation_time-14:56
 * @modification_date- 26/09/2019
 * @modification_time- 14:58
 * @version 1.0
 * @copyright Zensar Technologies
 * @description- One to One Mapping
 */

@Entity
public class Flag {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flagId;
	private String flaName;
	private String description;
	
	@OneToOne(mappedBy = "flag")
	@JoinColumn(name = "country_Id")
	private Country country;
	public int getFlagId() {
		return flagId;
	}
	public void setFlagId(int flagId) {
		this.flagId = flagId;
	}
	public String getFlaName() {
		return flaName;
	}
	public void setFlaName(String flaName) {
		this.flaName = flaName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	
	
	

}
