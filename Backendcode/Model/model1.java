package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Diag")	
public class model1 {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    private String patientId;
    private double weight;
    private double height;
    private String gender;
    private String bloodPressure;
    private String sugarLevel;
    private String asthmaProblem;
    private String covidPositive;
	
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBloodPressure() {
		return bloodPressure;
	}
	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}
	public String getSugarLevel() {
		return sugarLevel;
	}
	public void setSugarLevel(String sugarLevel) {
		this.sugarLevel = sugarLevel;
	}
	public String getAsthmaProblem() {
		return asthmaProblem;
	}
	public void setAsthmaProblem(String asthmaProblem) {
		this.asthmaProblem = asthmaProblem;
	}
	public String getCovidPositive() {
		return covidPositive;
	}
	public void setCovidPositive(String covidPositive) {
		this.covidPositive = covidPositive;
	}
	public model1( String patientId, double weight, double height, String gender, String bloodPressure,
			String sugarLevel, String asthmaProblem, String covidPositive) {
		super();
		
		this.patientId = patientId;
		this.weight = weight;
		this.height = height;
		this.gender = gender;
		this.bloodPressure = bloodPressure;
		this.sugarLevel = sugarLevel;
		this.asthmaProblem = asthmaProblem;
		this.covidPositive = covidPositive;
	}
	public model1() {
		super();
		
	}
    
    
}
