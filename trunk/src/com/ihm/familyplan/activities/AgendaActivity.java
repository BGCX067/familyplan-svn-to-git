package com.ihm.familyplan.activities;

import com.example.familyplan.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AgendaActivity extends Activity{
	
	private ImageButton gateway = null;

	public void onCreate (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_agenda);
		
		//bouton Meal
		gateway = (ImageButton) findViewById(R.id.agendaMeal);
		gateway.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent agendaAct = new Intent(AgendaActivity.this, MealActivity.class);
				startActivity(agendaAct);
			}
		});
		
		//bouton Shop
		gateway = (ImageButton) findViewById(R.id.agendaShop);
		gateway.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent shopAct = new Intent(AgendaActivity.this, ShopActivity.class);
				startActivity(shopAct);
			}
		});
		
		//bouton add
		gateway = (ImageButton) findViewById(R.id.agendaAdd);
		gateway.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent addAct = new Intent(AgendaActivity.this, AddActivity.class);
				startActivity(addAct);
			}
		});
	}
}
