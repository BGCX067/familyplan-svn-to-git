package com.ihm.familyplan.objects;

import java.util.ArrayList;
import java.util.List;

public class Plate {

	private List<Ingredient> ingredients = new ArrayList<Ingredient>();

	public Plate(List<Ingredient> ingredients) {
		super();
		this.ingredients = ingredients;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
}
