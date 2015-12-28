package com.ihm.familyplan.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.familyplan.R;

public class AddActivity extends Activity{
	
	private ImageButton gateway = null;

	public void onCreate (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add);
		
		//bouton Agenda
		gateway = (ImageButton) findViewById(R.id.addAgenda);
		gateway.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent agendaAct = new Intent(AddActivity.this, AgendaActivity.class);
				startActivity(agendaAct);
			}
		});
		
		//bouton Meal
		gateway = (ImageButton) findViewById(R.id.addMeal);
		gateway.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent mealAct = new Intent(AddActivity.this, MealActivity.class);
				startActivity(mealAct);
			}
		});
		
		//bouton Shop
		gateway = (ImageButton) findViewById(R.id.addShop);
		gateway.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent shopAct = new Intent(AddActivity.this, ShopActivity.class);
				startActivity(shopAct);
			}
		});
		/*TODO : Ajouter le lien vers l'ajout d'ingrédient
		 * Il manque le bouton, il faudra choisir une image*/
		
		//bouton ajout plat
		gateway = (ImageButton) findViewById(R.id.buttonAddPlate);
		gateway.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent addPlateAct = new Intent(AddActivity.this, AddPlateActivity.class);
				startActivity(addPlateAct);
			}
		});
		
		gateway = (ImageButton) findViewById(R.id.ImageButton01);
		gateway.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent addIngAct = new Intent(AddActivity.this, AddIngredientActivity.class);
				startActivity(addIngAct);
			}
		});
	}
}
