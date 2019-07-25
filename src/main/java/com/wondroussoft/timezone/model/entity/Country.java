package com.wondroussoft.timezone.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	String nameEng;
	String nameTelugu;
	String nameKannnada;
	String nameHindi;
	String nameTamil;
	String presidentNameEng;
	int area;
	int population;
	String capital;
	String time;
	String date;

	
	public Country() {
	}
	
	

	public Country(Long id, String nameEng, String nameTelugu, String nameKannnada, String nameHindi, String nameTamil,
			String presidentNameEng, int area, int population, String capital, String time, String date) {
		this.id = id;
		this.nameEng = nameEng;
		this.nameTelugu = nameTelugu;
		this.nameKannnada = nameKannnada;
		this.nameHindi = nameHindi;
		this.nameTamil = nameTamil;
		this.presidentNameEng = presidentNameEng;
		this.area = area;
		this.population = population;
		this.capital = capital;
		this.time = time;
		this.date = date;
	}
	
	public Country(String presidentNameEng, int area, int population, String capital, String time,String date) {

		this.presidentNameEng = presidentNameEng;
		this.area = area;
		this.population = population;
		this.capital = capital;
		this.time=time;
		this.date=date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameEng() {
		return nameEng;
	}

	public void setNameEng(String nameEng) {
		this.nameEng = nameEng;
	}

	public String getNameTelugu() {
		return nameTelugu;
	}

	public void setNameTelugu(String nameTelugu) {
		this.nameTelugu = nameTelugu;
	}

	public String getNameKannnada() {
		return nameKannnada;
	}

	public void setNameKannnada(String nameKannnada) {
		this.nameKannnada = nameKannnada;
	}

	public String getNameHindi() {
		return nameHindi;
	}

	public void setNameHindi(String nameHindi) {
		this.nameHindi = nameHindi;
	}

	public String getNameTamil() {
		return nameTamil;
	}

	public void setNameTamil(String nameTamil) {
		this.nameTamil = nameTamil;
	}

	public String getPresidentNameEng() {
		return presidentNameEng;
	}

	public void setPresidentNameEng(String presidentNameEng) {
		this.presidentNameEng = presidentNameEng;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	}
