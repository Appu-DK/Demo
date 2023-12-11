package com.jspiders.hibernate.TestCase1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int personId;
	private String personName;
	private long PersonPhone;
	
	@OneToOne
	private Pan panUniqueId;
	
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public long getPersonPhone() {
		return PersonPhone;
	}
	public void setPersonPhone(long personPhone) {
		PersonPhone = personPhone;
	}
	public Pan getAddress() {
		return panUniqueId;
	}
	public void setpanUniueID(Pan panUniqueID) {
		this.panUniqueId = panUniqueID;
	}
	

}
