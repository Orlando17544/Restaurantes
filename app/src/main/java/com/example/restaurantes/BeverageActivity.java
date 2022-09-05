package com.example.restaurantes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.appbar.MaterialToolbar;

public class BeverageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverage);

        Beverage beverage = getIntent().getParcelableExtra(BeverageFragment.EXTRA_BEVERAGE);

        MaterialToolbar topAppBar = findViewById(R.id.topAppBar);

        topAppBar.setTitle(beverage.getName());

        topAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        TextView beverageName = findViewById(R.id.beverage_name);
        TextView beveragePrice = findViewById(R.id.beverage_price);

        beverageName.setText(beverage.getName());
        beveragePrice.setText("$ " + beverage.getPrice());
    }
}