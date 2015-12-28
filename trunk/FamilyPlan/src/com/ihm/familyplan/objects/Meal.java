package com.ihm.familyplan.objects;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	private List<Plate> plats = new ArrayList<Plate>();

	public List<Plate> getPlats() {
		return plats;
	}

	public void setPlats(List<Plate> plats) {
		this.plats = plats;
	}

	public Meal(List<Plate> plats) {
		super();
		this.plats = plats;
	}
}
