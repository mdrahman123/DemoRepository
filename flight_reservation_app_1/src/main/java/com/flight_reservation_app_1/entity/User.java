package com.flight_reservation_app_1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User extends AbstractEntity {

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name="first_name",length=100,nullable=false)
	private String firstName;
	@Column(name="last_name",length=100,nullable=false)
	private String lastName;
	@Column(name="email",length=100,nullable=false,unique=true)
	private String email;
	@Column(name="password",length=100,nullable=false)
	private String password;
	
	

}
