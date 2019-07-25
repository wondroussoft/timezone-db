package com.wondroussoft.timezone.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Timezone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	String zoneName;
	String abbreviation;
	Double gmtOffset;
	Boolean daylightSavingTime;
	String currentTimeNow;

	public Timezone() {

	}

	public Timezone(Long id, String zoneName, String abbreviation, Double gmtOffset, Boolean daylightSavingTime,
			String currentTimeNow) {
		this.id = id;
		this.zoneName = zoneName;
		this.abbreviation = abbreviation;
		this.gmtOffset = gmtOffset;
		this.daylightSavingTime = daylightSavingTime;
		this.currentTimeNow = currentTimeNow;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getZoneName() {
		return zoneName;
	}

	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public Double getGmtOffset() {
		return gmtOffset;
	}

	public void setGmtOffset(Double gmtOffset) {
		this.gmtOffset = gmtOffset;
	}

	public Boolean getDaylightSavingTime() {
		return daylightSavingTime;
	}

	public void setDaylightSavingTime(Boolean daylightSavingTime) {
		this.daylightSavingTime = daylightSavingTime;
	}

	public String getCurrentTimeNow() {
		return currentTimeNow;
	}

	public void setCurrentTimeNow(String currentTimeNow) {
		this.currentTimeNow = currentTimeNow;
	}

}
