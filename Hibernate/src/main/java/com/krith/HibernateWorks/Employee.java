package com.krith.HibernateWorks;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY) //default cache type NONE
public class Employee {
	
	@Id
	private int id;
	private String name;
	//@Column(name="field")
	private String domain;
	//private CountryVisit tour;
	//@OneToOne
	//private Laptop lap;
	
	/*public Laptop getLap() {
		return lap;
	}
	public void setLap(Laptop lap) {
		this.lap = lap;
	}*/
	/*@OneToMany(mappedBy="employee")//fetch=Fetch.Type.EAGER
	private List<Laptop> lapList = new ArrayList<Laptop>();
	
	public List<Laptop> getLapList() {
		return lapList;
	}
	public void setLapList(List<Laptop> lapList) {
		this.lapList = lapList;
	}
	public CountryVisit getTour() {
		return tour;
	}
	public void setTour(CountryVisit tour) {
		this.tour = tour;
	}*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", domain=" + domain + "]";
	}	
}
