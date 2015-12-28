package com.example.familyplan;

import com.ihm.familyplan.activities.AddActivity;
import com.ihm.familyplan.activities.AgendaActivity;
import com.ihm.familyplan.activities.MealActivity;
import com.ihm.familyplan.activities.ShopActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {
	
	private ImageButton gateway = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//imageButton1 = bouton Agenda
		gateway = (ImageButton) findViewById(R.id.imageButton1);
		gateway.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent agendaAct = new Intent(MainActivity.this, AgendaActivity.class);
				startActivity(agendaAct);
			}
		});
		
		//imageButton2 = bouton Meal
		gateway = (ImageButton) findViewById(R.id.imageButton2);
		gateway.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent mealAct = new Intent(MainActivity.this, MealActivity.class);
				startActivity(mealAct);
			}
		});
		
		//imageButton3 = bouton Shop
		gateway = (ImageButton) findViewById(R.id.imageButton3);
		gateway.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent shopAct = new Intent(MainActivity.this, ShopActivity.class);
				startActivity(shopAct);
			}
		});
		
		//imageButton4 = bouton add
		gateway = (ImageButton) findViewById(R.id.imageButton4);
		gateway.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent addAct = new Intent(MainActivity.this, AddActivity.class);
				startActivity(addAct);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
