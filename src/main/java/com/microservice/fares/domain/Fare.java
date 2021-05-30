package com.microservice.fares.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Fare {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	
	String flightNumber;
	String flightDate;
	String fare;
	
	
	public Fare() {
		super();
	}


	public Fare(String flightNumber, String flightDate, String fare) {
		super();
		this.flightNumber = flightNumber;
		this.flightDate = flightDate;
		this.fare = fare;
	}




	@Override
	public String toString() {
		return "Fares [id=" + id + ", flightNumber=" + flightNumber + ", flightDate=" + flightDate + ", fare=" + fare
				+ "]";
	}
	
	
	
}
