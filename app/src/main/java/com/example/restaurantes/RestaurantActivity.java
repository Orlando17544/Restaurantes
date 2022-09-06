package com.example.restaurantes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {
    public static final String EXTRA_ITEMS_MENU = "com.example.restaurantes.ITEMS_MENU";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        Restaurant restaurant = getIntent().getParcelableExtra(MainActivity.EXTRA_RESTAURANT);

        String fragment = getIntent().getStringExtra(MainActivity.EXTRA_RESTAURANT_FRAGMENT);

        MaterialToolbar topAppBar = findViewById(R.id.topAppBar);

        topAppBar.setTitle(restaurant.getName());

        topAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        topAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.search:
                        ItemMenu[] itemsMenu = restaurant.getMenu().getItems();

                        Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
                        intent.putExtra("com.example.restaurantes.CALLING_ACTIVITY", "RestaurantActivity");
                        intent.putExtra(EXTRA_ITEMS_MENU, itemsMenu);
                        startActivity(intent);
                        return true;
                }
                return false;
            }
        });

        ViewPager2 viewPager2 = findViewById(R.id.viewPager2);

        viewPager2.setAdapter(new MenuPagerAdapter(this, restaurant.getMenu()));

        if (fragment != null) {
            if (fragment.equals("MealFragment"))  {
                viewPager2.setCurrentItem(0);
            } else if (fragment.equals("BeverageFragment")) {
                viewPager2.setCurrentItem(1);
            } else if (fragment.equals("ComplementFragment")) {
                viewPager2.setCurrentItem(2);
            }
        }

        TabLayout tabLayout = findViewById(R.id.tabLayout);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(
                tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        tab.setText("Comida");
                        break;
                    case 1:
                        tab.setText("Bebidas");
                        break;
                    case 2:
                        tab.setText("Complementos");
                        break;
                }
            }
        }
        );
        tabLayoutMediator.attach();
    }
}