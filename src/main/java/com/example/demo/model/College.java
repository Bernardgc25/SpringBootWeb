package com.example.demo.model;
import javax.persistence.*;
@Entity
@Table(name="CollegeEntity")
public class College {
	@Id
	private int collegecode;
	public int getCollegecode() {
		return collegecode;
	}
	public void setCollegecode(int collegecode) {
		this.collegecode = collegecode;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private String collegename;
	private String city;
	@OneToOne(targetEntity=Address.class,cascade = CascadeType.ALL)
	@JoinColumn(name="addressid")
	private Address addobj;
	public Address getAddobj() {
		return addobj;
	}
	public void setAddobj(Address addobj) {
		this.addobj = addobj;
	}

}