package com.example.demo.model;
import javax.persistence.*;
@Entity
@Table(name="AddObj")
public class Address {
	@Id
	private int addid;
	public int getAddid() {
		return addid;
	}
	public void setAddid(int addid) {
		this.addid = addid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	private String city;
	private String state;
	

}
