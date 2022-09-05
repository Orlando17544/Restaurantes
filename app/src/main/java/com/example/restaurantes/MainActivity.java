package com.example.restaurantes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.appbar.MaterialToolbar;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_RESTAURANT = "com.example.restaurantes.RESTAURANT";

    private Restaurant restaurant;
    private Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialToolbar topAppBar = findViewById(R.id.topAppBar);

        topAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.search:
                        Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
                        intent.putExtra(EXTRA_RESTAURANT, restaurant);
                        startActivity(intent);
                        return true;
                }
                return false;
            }
        });

        TextView restaurantATextView = findViewById(R.id.restaurant_A_text_view);
        TextView restaurantBTextView = findViewById(R.id.restaurant_B_text_view);
        TextView restaurantCTextView = findViewById(R.id.restaurant_C_text_view);
        TextView restaurantDTextView = findViewById(R.id.restaurant_D_text_view);

        restaurantATextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu = new Menu(
                        new Meal[]{
                                new Meal("Comida A", 233),
                                new Meal("Comida B", 582),
                                new Meal("Comida C", 582),
                                new Meal("Comida D", 132)
                        },
                        new Beverage[]{
                                new Beverage("Bebida E", 816),
                                new Beverage("Bebida F", 318),
                                new Beverage("Bebida G", 592),
                                new Beverage("Bebida H", 285),
                        },
                        new Complement[]{
                                new Complement("Complemento I", 581),
                                new Complement("Complemento J", 671),
                                new Complement("Complemento K", 891),
                                new Complement("Complemento L", 931),
                        }
                );

                restaurant = new Restaurant("Restaurante A", menu);

                Intent intent = new Intent(getApplicationContext(), RestaurantActivity.class);
                intent.putExtra(EXTRA_RESTAURANT, restaurant);
                startActivity(intent);
            }
        });

        restaurantBTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu = new Menu(
                        new Meal[]{
                                new Meal("Comida A", 123),
                                new Meal("Comida B", 258),
                                new Meal("Comida C", 812),
                                new Meal("Comida D", 491)
                        },
                        new Beverage[]{
                                new Beverage("Bebida E", 198),
                                new Beverage("Bebida F", 216),
                                new Beverage("Bebida G", 538),
                                new Beverage("Bebida H", 718),
                        },
                        new Complement[]{
                                new Complement("Complemento I", 918),
                                new Complement("Complemento J", 361),
                                new Complement("Complemento K", 381),
                                new Complement("Complemento L", 408),
                        }
                );

                restaurant = new Restaurant("Restaurante B", menu);

                Intent intent = new Intent(getApplicationContext(), RestaurantActivity.class);
                intent.putExtra(EXTRA_RESTAURANT, restaurant);
                startActivity(intent);
            }
        });

        restaurantCTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu = new Menu(
                        new Meal[]{
                                new Meal("Comida A", 839),
                                new Meal("Comida B", 182),
                                new Meal("Comida C", 848),
                                new Meal("Comida D", 188)
                        },
                        new Beverage[]{
                                new Beverage("Bebida E", 382),
                                new Beverage("Bebida F", 178),
                                new Beverage("Bebida G", 582),
                                new Beverage("Bebida H", 581),
                        },
                        new Complement[]{
                                new Complement("Complemento I", 578),
                                new Complement("Complemento J", 189),
                                new Complement("Complemento K", 183),
                                new Complement("Complemento L", 285),
                        }
                );

                restaurant = new Restaurant("Restaurante C", menu);

                Intent intent = new Intent(getApplicationContext(), RestaurantActivity.class);
                intent.putExtra(EXTRA_RESTAURANT, restaurant);
                startActivity(intent);
            }
        });

        restaurantDTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu = new Menu(
                        new Meal[]{
                                new Meal("Comida A", 389),
                                new Meal("Comida B", 289),
                                new Meal("Comida C", 581),
                                new Meal("Comida D", 418)
                        },
                        new Beverage[]{
                                new Beverage("Beverage E", 917),
                                new Beverage("Beverage F", 136),
                                new Beverage("Beverage G", 267),
                                new Beverage("Beverage H", 386),
                        },
                        new Complement[]{
                                new Complement("Complemento I", 839),
                                new Complement("Complemento J", 189),
                                new Complement("Complemento K", 289),
                                new Complement("Complemento L", 567),
                        }
                );

                restaurant = new Restaurant("Restaurante D", menu);

                Intent intent = new Intent(getApplicationContext(), RestaurantActivity.class);
                intent.putExtra(EXTRA_RESTAURANT, restaurant);
                startActivity(intent);
            }
        });
    }
}