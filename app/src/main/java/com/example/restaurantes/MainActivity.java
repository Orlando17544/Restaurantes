package com.example.restaurantes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MEAL_1 = "com.example.restaurantes.MEAL_1";
    public static final String EXTRA_MEAL_2 = "com.example.restaurantes.MEAL_2";
    public static final String EXTRA_MEAL_3 = "com.example.restaurantes.MEAL_3";
    public static final String EXTRA_MEAL_4 = "com.example.restaurantes.MEAL_4";

    public static final String EXTRA_MEAL_PRICE_1 = "com.example.restaurantes.MEAL_PRICE_1";
    public static final String EXTRA_MEAL_PRICE_2 = "com.example.restaurantes.MEAL_PRICE_2";
    public static final String EXTRA_MEAL_PRICE_3 = "com.example.restaurantes.MEAL_PRICE_3";
    public static final String EXTRA_MEAL_PRICE_4 = "com.example.restaurantes.MEAL_PRICE_4";

    
    public static final String EXTRA_BEVERAGE_1 = "com.example.restaurantes.BEVERAGE_1";
    public static final String EXTRA_BEVERAGE_2 = "com.example.restaurantes.BEVERAGE_2";
    public static final String EXTRA_BEVERAGE_3 = "com.example.restaurantes.BEVERAGE_3";
    public static final String EXTRA_BEVERAGE_4 = "com.example.restaurantes.BEVERAGE_4";

    public static final String EXTRA_BEVERAGE_PRICE_1 = "com.example.restaurantes.BEVERAGE_PRICE_1";
    public static final String EXTRA_BEVERAGE_PRICE_2 = "com.example.restaurantes.BEVERAGE_PRICE_2";
    public static final String EXTRA_BEVERAGE_PRICE_3 = "com.example.restaurantes.BEVERAGE_PRICE_3";
    public static final String EXTRA_BEVERAGE_PRICE_4 = "com.example.restaurantes.BEVERAGE_PRICE_4";


    public static final String EXTRA_COMPLEMENT_1 = "com.example.restaurantes.COMPLEMENT_1";
    public static final String EXTRA_COMPLEMENT_2 = "com.example.restaurantes.COMPLEMENT_2";
    public static final String EXTRA_COMPLEMENT_3 = "com.example.restaurantes.COMPLEMENT_3";
    public static final String EXTRA_COMPLEMENT_4 = "com.example.restaurantes.COMPLEMENT_4";

    public static final String EXTRA_COMPLEMENT_PRICE_1 = "com.example.restaurantes.COMPLEMENT_PRICE_1";
    public static final String EXTRA_COMPLEMENT_PRICE_2 = "com.example.restaurantes.COMPLEMENT_PRICE_2";
    public static final String EXTRA_COMPLEMENT_PRICE_3 = "com.example.restaurantes.COMPLEMENT_PRICE_3";
    public static final String EXTRA_COMPLEMENT_PRICE_4 = "com.example.restaurantes.COMPLEMENT_PRICE_4";

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
                Intent intent = new Intent(getApplicationContext(), RestaurantActivity.class);
                intent.putExtra(EXTRA_MEAL_1, "Comida A");
                intent.putExtra(EXTRA_MEAL_2, "Comida B");
                intent.putExtra(EXTRA_MEAL_3, "Comida C");
                intent.putExtra(EXTRA_MEAL_4, "Comida D");
                intent.putExtra(EXTRA_MEAL_PRICE_1, 100);
                intent.putExtra(EXTRA_MEAL_PRICE_2, 200);
                intent.putExtra(EXTRA_MEAL_PRICE_3, 300);
                intent.putExtra(EXTRA_MEAL_PRICE_4, 400);

                intent.putExtra(EXTRA_BEVERAGE_1, "Bebida A");
                intent.putExtra(EXTRA_BEVERAGE_2, "Bebida B");
                intent.putExtra(EXTRA_BEVERAGE_3, "Bebida C");
                intent.putExtra(EXTRA_BEVERAGE_4, "Bebida D");
                intent.putExtra(EXTRA_BEVERAGE_PRICE_1, 500);
                intent.putExtra(EXTRA_BEVERAGE_PRICE_2, 600);
                intent.putExtra(EXTRA_BEVERAGE_PRICE_3, 700);
                intent.putExtra(EXTRA_BEVERAGE_PRICE_4, 800);

                intent.putExtra(EXTRA_COMPLEMENT_1, "Complemento A");
                intent.putExtra(EXTRA_COMPLEMENT_2, "Complemento B");
                intent.putExtra(EXTRA_COMPLEMENT_3, "Complemento C");
                intent.putExtra(EXTRA_COMPLEMENT_4, "Complemento D");
                intent.putExtra(EXTRA_COMPLEMENT_PRICE_1, 900);
                intent.putExtra(EXTRA_COMPLEMENT_PRICE_2, 1000);
                intent.putExtra(EXTRA_COMPLEMENT_PRICE_3, 1100);
                intent.putExtra(EXTRA_COMPLEMENT_PRICE_4, 1200);
                startActivity(intent);
            }
        });

        restaurantBTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RestaurantActivity.class);
                intent.putExtra(EXTRA_MEAL_1, "Comida E");
                intent.putExtra(EXTRA_MEAL_2, "Comida F");
                intent.putExtra(EXTRA_MEAL_3, "Comida G");
                intent.putExtra(EXTRA_MEAL_4, "Comida H");
                intent.putExtra(EXTRA_MEAL_PRICE_1, 1300);
                intent.putExtra(EXTRA_MEAL_PRICE_2, 1400);
                intent.putExtra(EXTRA_MEAL_PRICE_3, 1500);
                intent.putExtra(EXTRA_MEAL_PRICE_4, 1600);

                intent.putExtra(EXTRA_BEVERAGE_1, "Bebida E");
                intent.putExtra(EXTRA_BEVERAGE_2, "Bebida F");
                intent.putExtra(EXTRA_BEVERAGE_3, "Bebida G");
                intent.putExtra(EXTRA_BEVERAGE_4, "Bebida H");
                intent.putExtra(EXTRA_BEVERAGE_PRICE_1, 1700);
                intent.putExtra(EXTRA_BEVERAGE_PRICE_2, 1800);
                intent.putExtra(EXTRA_BEVERAGE_PRICE_3, 1900);
                intent.putExtra(EXTRA_BEVERAGE_PRICE_4, 2000);

                intent.putExtra(EXTRA_COMPLEMENT_1, "Complemento E");
                intent.putExtra(EXTRA_COMPLEMENT_2, "Complemento F");
                intent.putExtra(EXTRA_COMPLEMENT_3, "Complemento G");
                intent.putExtra(EXTRA_COMPLEMENT_4, "Complemento H");
                intent.putExtra(EXTRA_COMPLEMENT_PRICE_1, 2100);
                intent.putExtra(EXTRA_COMPLEMENT_PRICE_2, 2200);
                intent.putExtra(EXTRA_COMPLEMENT_PRICE_3, 2300);
                intent.putExtra(EXTRA_COMPLEMENT_PRICE_4, 2400);
                startActivity(intent);
            }
        });

        restaurantCTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RestaurantActivity.class);
                intent.putExtra(EXTRA_MEAL_1, "Comida I");
                intent.putExtra(EXTRA_MEAL_2, "Comida J");
                intent.putExtra(EXTRA_MEAL_3, "Comida K");
                intent.putExtra(EXTRA_MEAL_4, "Comida L");
                intent.putExtra(EXTRA_MEAL_PRICE_1, 2500);
                intent.putExtra(EXTRA_MEAL_PRICE_2, 2600);
                intent.putExtra(EXTRA_MEAL_PRICE_3, 2700);
                intent.putExtra(EXTRA_MEAL_PRICE_4, 2800);

                intent.putExtra(EXTRA_BEVERAGE_1, "Bebida I");
                intent.putExtra(EXTRA_BEVERAGE_2, "Bebida J");
                intent.putExtra(EXTRA_BEVERAGE_3, "Bebida K");
                intent.putExtra(EXTRA_BEVERAGE_4, "Bebida L");
                intent.putExtra(EXTRA_BEVERAGE_PRICE_1, 2900);
                intent.putExtra(EXTRA_BEVERAGE_PRICE_2, 3000);
                intent.putExtra(EXTRA_BEVERAGE_PRICE_3, 3100);
                intent.putExtra(EXTRA_BEVERAGE_PRICE_4, 3200);

                intent.putExtra(EXTRA_COMPLEMENT_1, "Complemento I");
                intent.putExtra(EXTRA_COMPLEMENT_2, "Complemento J");
                intent.putExtra(EXTRA_COMPLEMENT_3, "Complemento K");
                intent.putExtra(EXTRA_COMPLEMENT_4, "Complemento L");
                intent.putExtra(EXTRA_COMPLEMENT_PRICE_1, 3300);
                intent.putExtra(EXTRA_COMPLEMENT_PRICE_2, 3400);
                intent.putExtra(EXTRA_COMPLEMENT_PRICE_3, 3500);
                intent.putExtra(EXTRA_COMPLEMENT_PRICE_4, 3600);
                startActivity(intent);
            }
        });

        restaurantDTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RestaurantActivity.class);
                intent.putExtra(EXTRA_MEAL_1, "Comida M");
                intent.putExtra(EXTRA_MEAL_2, "Comida N");
                intent.putExtra(EXTRA_MEAL_3, "Comida O");
                intent.putExtra(EXTRA_MEAL_4, "Comida P");
                intent.putExtra(EXTRA_MEAL_PRICE_1, 3700);
                intent.putExtra(EXTRA_MEAL_PRICE_2, 3800);
                intent.putExtra(EXTRA_MEAL_PRICE_3, 3900);
                intent.putExtra(EXTRA_MEAL_PRICE_4, 4000);

                intent.putExtra(EXTRA_BEVERAGE_1, "Bebida M");
                intent.putExtra(EXTRA_BEVERAGE_2, "Bebida N");
                intent.putExtra(EXTRA_BEVERAGE_3, "Bebida O");
                intent.putExtra(EXTRA_BEVERAGE_4, "Bebida P");
                intent.putExtra(EXTRA_BEVERAGE_PRICE_1, 4100);
                intent.putExtra(EXTRA_BEVERAGE_PRICE_2, 4200);
                intent.putExtra(EXTRA_BEVERAGE_PRICE_3, 4300);
                intent.putExtra(EXTRA_BEVERAGE_PRICE_4, 4400);

                intent.putExtra(EXTRA_COMPLEMENT_1, "Complemento M");
                intent.putExtra(EXTRA_COMPLEMENT_2, "Complemento N");
                intent.putExtra(EXTRA_COMPLEMENT_3, "Complemento O");
                intent.putExtra(EXTRA_COMPLEMENT_4, "Complemento P");
                intent.putExtra(EXTRA_COMPLEMENT_PRICE_1, 4500);
                intent.putExtra(EXTRA_COMPLEMENT_PRICE_2, 4600);
                intent.putExtra(EXTRA_COMPLEMENT_PRICE_3, 4700);
                intent.putExtra(EXTRA_COMPLEMENT_PRICE_4, 4800);
                startActivity(intent);
            }
        });
    }
}