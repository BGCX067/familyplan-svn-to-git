package com.ihm.familyplan.activities;

import java.util.ArrayList;
import android.app.Activity;
import android.app.ActionBar.LayoutParams;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import com.example.familyplan.R;

public class AddIngredientActivity extends Activity{
	
	private ImageButton gateway = null;
	private Button create = null;

	public void onCreate (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_ingredient);
		
		ArrayList<CharSequence> ingredients = getIntent().getCharSequenceArrayListExtra("ingredients");
		
		if (ingredients != null){
			for (CharSequence cs : ingredients){
				CheckBox c = new CheckBox(this);
				c.setText(cs);
				RelativeLayout r = (RelativeLayout)findViewById(R.id.addIngLayout);
				LayoutParams lp = new LayoutParams(800, 550, 0);
				r.addView(c, lp);
			}
			
		}
		
		//bouton Agenda
		gateway = (ImageButton) findViewById(R.id.addAgenda);
		gateway.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent agendaAct = new Intent(AddIngredientActivity.this, AgendaActivity.class);
				startActivity(agendaAct);
			}
		});
		
		//bouton Meal
		gateway = (ImageButton) findViewById(R.id.addMeal);
		gateway.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent mealAct = new Intent(AddIngredientActivity.this, MealActivity.class);
				startActivity(mealAct);
			}
		});
		
		//bouton Shop
		gateway = (ImageButton) findViewById(R.id.addShop);
		gateway.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent shopAct = new Intent(AddIngredientActivity.this, ShopActivity.class);
				startActivity(shopAct);
			}
		});
		
		//bouton add
		gateway = (ImageButton) findViewById(R.id.addAdd);
		gateway.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent addAct = new Intent(AddIngredientActivity.this, AddActivity.class);
				startActivity(addAct);
			}
		});
		
		//bouton créer
		create = (Button) findViewById(R.id.buttonCreate);
		create.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent addIngAct = new Intent(AddIngredientActivity.this, AddIngredientActivity.class);
				//Récupération de l'éventuelle liste existante d'ingrédients
				ArrayList<CharSequence> ingredients = addIngAct.getCharSequenceArrayListExtra("ingredients");
				
				//sinon, je créé la liste
				if (ingredients == null){
					ingredients = new ArrayList<CharSequence>();
				}
				// Récupération de ce qu'a saisi l'utilisateur
				EditText et = (EditText) findViewById(R.id.editIng);
				String ingredient = et.getText().toString();
				//Ajout de l'ingrédient saisi à la liste d'ingrédients
				ingredients.add(ingredient);
				// Ajout de la liste modifiée
				addIngAct.putCharSequenceArrayListExtra("ingredients", ingredients);

				startActivity(addIngAct);
			}
		});
		
	}

	
	
}
