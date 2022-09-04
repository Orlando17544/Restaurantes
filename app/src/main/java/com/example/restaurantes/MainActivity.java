package com.example.restaurantes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_RESTAURANT = "com.example.restaurantes.RESTAURANT";

    private Restaurant restaurant;
    private Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                                new Beverage("Comida E", 816),
                                new Beverage("Comida F", 318),
                                new Beverage("Comida G", 592),
                                new Beverage("Comida H", 285),
                        },
                        new Complement[]{
                                new Complement("Comida I", 581),
                                new Complement("Comida J", 671),
                                new Complement("Comida K", 891),
                                new Complement("Comida L", 931),
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
                                new Beverage("Comida E", 198),
                                new Beverage("Comida F", 216),
                                new Beverage("Comida G", 538),
                                new Beverage("Comida H", 718),
                        },
                        new Complement[]{
                                new Complement("Comida I", 918),
                                new Complement("Comida J", 361),
                                new Complement("Comida K", 381),
                                new Complement("Comida L", 408),
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
                                new Beverage("Comida E", 382),
                                new Beverage("Comida F", 178),
                                new Beverage("Comida G", 582),
                                new Beverage("Comida H", 581),
                        },
                        new Complement[]{
                                new Complement("Comida I", 578),
                                new Complement("Comida J", 189),
                                new Complement("Comida K", 183),
                                new Complement("Comida L", 285),
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
                                new Beverage("Comida E", 917),
                                new Beverage("Comida F", 136),
                                new Beverage("Comida G", 267),
                                new Beverage("Comida H", 386),
                        },
                        new Complement[]{
                                new Complement("Comida I", 839),
                                new Complement("Comida J", 189),
                                new Complement("Comida K", 289),
                                new Complement("Comida L", 567),
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