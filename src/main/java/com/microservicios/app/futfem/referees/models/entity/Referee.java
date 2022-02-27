package com.microservicios.app.futfem.referees.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="referees")
public class Referee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String surname;
	private String country;
	
	private int casero;
	private int valiente;
	private int tarjetero;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getCasero() {
		return casero;
	}

	public void setCasero(int casero) {
		this.casero = casero;
	}

	public int getValiente() {
		return valiente;
	}

	public void setValiente(int valiente) {
		this.valiente = valiente;
	}

	public int getTarjetero() {
		return tarjetero;
	}

	public void setTarjetero(int tarjetero) {
		this.tarjetero = tarjetero;
	}

}
