package com.ihm.familyplan.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import com.example.familyplan.R;

public class ShopActivity extends Activity{
	
	private ImageButton gateway = null;

	public void onCreate (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_shop);
		
		//String b = getIntent().getStringExtra("i1");
		//String temp = b.getString("i1");
		/*Button b1 = new Button(this);
		b1.setText(b);
		
		RelativeLayout r = (RelativeLayout)findViewById(R.id.shoplayout);
		r.addView(b1);*/
		
		//bouton Agenda 
		gateway = (ImageButton) findViewById(R.id.shopAgenda);
		gateway.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent agendaAct = new Intent(ShopActivity.this, AgendaActivity.class);
				startActivity(agendaAct);
			}
		});
		
		//bouton Meal
		gateway = (ImageButton) findViewById(R.id.shopMeal);
		gateway.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent mealAct = new Intent(ShopActivity.this, MealActivity.class);
				startActivity(mealAct);
			}
		});
		
		//bouton Add
		gateway = (ImageButton) findViewById(R.id.shopAdd);
		gateway.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent addAct = new Intent(ShopActivity.this, AddActivity.class);
				startActivity(addAct);
			}
		});
	}
}
