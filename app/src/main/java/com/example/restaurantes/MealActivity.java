package com.example.restaurantes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.appbar.MaterialToolbar;

public class MealActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal);

        Meal meal = getIntent().getParcelableExtra(MealFragment.EXTRA_MEAL);

        MaterialToolbar topAppBar = findViewById(R.id.topAppBar);

        topAppBar.setTitle(meal.getName());

        topAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        TextView mealName = findViewById(R.id.meal_name);
        TextView mealPrice = findViewById(R.id.meal_price);

        mealName.setText(meal.getName());
        mealPrice.setText("$ " + meal.getPrice());
    }
}