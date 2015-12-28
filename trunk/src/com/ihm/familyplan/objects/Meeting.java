package com.ihm.familyplan.objects;

import java.util.Calendar;

public class Meeting {

	private Calendar dateTime;
	private String object;
	private String place;
	
	public Meeting(Calendar dateTime, String object, String place) {
		super();
		this.dateTime = dateTime;
		this.object = object;
		this.place = place;
	}

	public Calendar getDateTime() {
		return dateTime;
	}

	public void setDateTime(Calendar dateTime) {
		this.dateTime = dateTime;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
}
