package com.flight_reservation_app_1.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Flight extends AbstractEntity {
	

	@Column(name="flight_number",length=100,nullable=false)
	private String flightNumber;
	@Column(name="operating_airlines",length=100,nullable=false)
	private String operatingAirlines;
	@Column(name="departure_City",length=100,nullable=false)
	private String departureCity;
	@Column(name="arrival_City",length=100,nullable=false)
	private String arrivalCity;
	@Column(name="dateOf_departure",length=100,nullable=false)
	private Date dateOfDeparture;
	@Column(name="estimated_departure_time",length=100,nullable=false)
	private Timestamp estimatedDepartureTime;
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getOperatingAirlines() {
		return operatingAirlines;
	}
	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}
	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	public Timestamp getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}
	public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}
	
	

}
