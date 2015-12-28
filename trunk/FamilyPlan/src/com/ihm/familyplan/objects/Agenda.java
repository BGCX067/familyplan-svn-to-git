package com.ihm.familyplan.objects;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private List<Meeting> meetings = new ArrayList<Meeting>();

	public List<Meeting> getMeetings() {
		return meetings;
	}

	public void setMeetings(List<Meeting> meetings) {
		this.meetings = meetings;
	}

	public Agenda(List<Meeting> meetings) {
		super();
		this.meetings = meetings;
	}
}
