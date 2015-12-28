package com.ihm.familyplan.activities;

import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import com.example.familyplan.R;

public class AddPlateActivity extends Activity{
	
	private ImageButton gateway = null;

	public void onCreate (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_plate);
		
		/*Button b1 = new Button(this);
		b1.setText(b);
		
		RelativeLayout r = (RelativeLayout)findViewById(R.id.shoplayout);
		r.addView(b1);*/
		//Ajout d'un check box avec une valeur passée d'une autre page
		String ingredients = getIntent().getStringExtra("ing0");
		CheckBox c = new CheckBox(this);
		c.setText(ingredients);
		RelativeLayout r = (RelativeLayout)findViewById(R.id.addPlatLayout);
		LayoutParams lp = new LayoutParams(800, 550, 0);
		r.addView(c, lp);
		
		
		//bouton Agenda
		gateway = (ImageButton) findViewById(R.id.addAgenda);
		gateway.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent agendaAct = new Intent(AddPlateActivity.this, AgendaActivity.class);
				startActivity(agendaAct);
			}
		});
		
		//bouton Meal
		gateway = (ImageButton) findViewById(R.id.addMeal);
		gateway.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent mealAct = new Intent(AddPlateActivity.this, MealActivity.class);
				startActivity(mealAct);
			}
		});
		
		//bouton Shop
		gateway = (ImageButton) findViewById(R.id.addShop);
		gateway.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent shopAct = new Intent(AddPlateActivity.this, ShopActivity.class);
				startActivity(shopAct);
			}
		});
		
		
		/*TODO : Ajouter le lien vers l'ajout d'ingrédient
		 * Il manque le bouton, il faudra choisir une image*/
		
		/*TODO : Il manque aussi la liste des ingrédient
		 * Lorsque l'user créer un plat, il peut choisir un ingrédient
		 * s'il existe déjà, il faut implémenter la liste et choisir l'affichage à l'écran*/
		
	}
}
