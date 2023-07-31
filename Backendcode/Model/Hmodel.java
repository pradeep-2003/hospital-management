package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "medical")
public class Hmodel {
	@Id
	@GeneratedValue
    private String name;
    private String email;
    private String phonenumber; 
    private String appointmentdate;
    private String appointmenttime;
    

   
public String getName() {
		return name;
	}
	public void setName(String name) {	
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPhonenumber() {	
		return phonenumber;
	}



	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}



	public String getAppointmentdate() {
		return appointmentdate;
	}



	public void setAppointmentdate(String appointmentdate) {
		this.appointmentdate = appointmentdate;
	}



	public String getAppointmenttime() {
		return appointmenttime;
	}



	public void setAppointmenttime(String appointmenttime) {
		this.appointmenttime = appointmenttime;
	}



public Hmodel(String name, String email, String phonenumber, String appointmentdate, String appointmenttime) {
		super();
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
		this.appointmentdate = appointmentdate;
		this.appointmenttime = appointmenttime;
	}



public Hmodel()
{
	
}
   
}