package com.project.celebrityChallenge.model;

import java.io.Serializable;

public class Member implements Serializable{
	
	/**
	 * @author davinsongomez
	 */
	private static final long serialVersionUID = -1514378746132092678L;
	 
	private String name;
	private String lastname;
	private String role;
	private Boolean knowAnybody;
	private String knownPerson;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Boolean getKnowAnybody() {
		return knowAnybody;
	}
	public void setKnowAnybody(Boolean knowAnybody) {
		this.knowAnybody = knowAnybody;
	}
	public String getKnownPerson() {
		return knownPerson;
	}
	public void setKnownPerson(String knownPerson) {
		this.knownPerson = knownPerson;
	}
	
	
}
