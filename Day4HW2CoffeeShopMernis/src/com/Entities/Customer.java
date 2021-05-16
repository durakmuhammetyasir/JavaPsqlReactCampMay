package com.Entities;

import java.util.Date;

import com.Abstracts.IEntity;

public class Customer implements IEntity{
	//int _id;
	//String _firstName;
	//String _lastName;
	//GregorianCalendar _dateOfBirth;
	//long _nationalId;
	
	private int _id;
	private String _firstName;
	private String _lastName;
	private String _nationalityId;
	private Date _dateOfBirth;
	
	public Customer() {
		
	}

	public Customer(int id, String firstName, String lastName, String nationalityId, Date dateOfBirth) {
		super();
		this._id = id;
		this._firstName = firstName;
		this._lastName = lastName;
		this._nationalityId = nationalityId;
		this._dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		this._id = id;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		this._firstName = firstName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		this._lastName = lastName;
	}

	public String getNationalityId() {
		return _nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this._nationalityId = nationalityId;
	}

	public Date getDateOfBirth() {
		return _dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this._dateOfBirth = dateOfBirth;
	}
	
	
}
