package com.ihm.familyplan.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.familyplan.R;

public class MealActivity extends Activity {

	private ImageButton gateway = null;
	
	public void onCreate (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_meal);
		
		//bouton Agenda
		gateway = (ImageButton) findViewById(R.id.mealAgenda);
		gateway.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent agendaAct = new Intent(MealActivity.this, AgendaActivity.class);
				startActivity(agendaAct);
			}
		});
		
		//bouton Shop
		gateway = (ImageButton) findViewById(R.id.mealShop);
		gateway.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent shopAct = new Intent(MealActivity.this, ShopActivity.class);
				startActivity(shopAct);
			}
		});
		
		//bouton add
		gateway = (ImageButton) findViewById(R.id.mealAdd);
		gateway.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent addAct = new Intent(MealActivity.this, AddActivity.class);
				startActivity(addAct);
			}
		});
	}
}
