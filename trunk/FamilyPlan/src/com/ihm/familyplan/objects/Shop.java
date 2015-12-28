package com.ihm.familyplan.objects;

import java.util.ArrayList;
import java.util.List;

public class Shop {

	private List<Ingredient> ingredients = new ArrayList<Ingredient>();

	public Shop(List<Ingredient> ingredients) {
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
