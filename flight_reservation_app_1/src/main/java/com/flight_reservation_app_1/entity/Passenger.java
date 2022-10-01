package com.flight_reservation_app_1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Passenger extends AbstractEntity {
	@Column(name="first_name",length=100,nullable=false)
 private String firstName;
	@Column(name="last_name",length=100,nullable=false)
 private String lastName;
	@Column(name="middle_name",length=100,nullable=false)
 private String middleName;
	@Column(name="email",length=100,nullable=false)
 private String email;
	@Column(name="phone",length=100,nullable=false)
 private String phone;
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
public String getMiddleName() {
	return middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
 
}
