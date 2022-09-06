package com.example.restaurantes;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Locale;

public class SearchActivity extends AppCompatActivity {
    private Object[] itemsSearch;
    private String nameActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        nameActivity = getIntent().getStringExtra("com.example.restaurantes.CALLING_ACTIVITY");

        if (nameActivity.equals("MainActivity")) {
            String[] restaurantsNames = getIntent().getStringArrayExtra(MainActivity.EXTRA_RESTAURANTS_NAMES);

            itemsSearch = new Object[restaurantsNames.length];

            for (int i = 0; i < restaurantsNames.length; i++) {
                itemsSearch[i] = restaurantsNames[i];
            }
        } else if (nameActivity.equals("RestaurantActivity")) {
            Parcelable[] itemsMenu = getIntent().getParcelableArrayExtra(RestaurantActivity.EXTRA_ITEMS_MENU);

            itemsSearch = new Object[itemsMenu.length];

            for (int i = 0; i < itemsMenu.length; i++) {
                itemsSearch[i] = itemsMenu[i];
            }
        }

        TextInputEditText searchEditText = findViewById(R.id.searchEditText);

        searchEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                LinearLayout linearLayout = findViewById(R.id.linear_layout);
                linearLayout.removeAllViewsInLayout();

                if (nameActivity.equals("RestaurantActivity")) {
                    for (Object object : itemsSearch) {
                        ItemMenu itemSearch = (ItemMenu) object;
                        String itemSearchString = itemSearch.getName();
                        if (itemSearchString.toLowerCase().contains(charSequence.toString().toLowerCase())) {
                            TextView textView1 = new TextView(getApplicationContext());
                            textView1.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                            textView1.setText(itemSearchString);
                            textView1.setTextSize(20);

                            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                            params.addRule(RelativeLayout.ALIGN_PARENT_END);

                            TextView textView2 = new TextView(getApplicationContext());
                            textView2.setLayoutParams(params);
                            textView2.setText("$ " + itemSearch.getPrice());
                            textView2.setTextSize(20);

                            View view = new View(getApplicationContext());
                            view.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 3));
                            view.setBackgroundColor(Color.parseColor("#dfdfdf"));

                            RelativeLayout itemRelativeLayout = new RelativeLayout(getApplicationContext());
                            itemRelativeLayout.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

                            itemRelativeLayout.addView(textView1);
                            itemRelativeLayout.addView(textView2);

                            linearLayout.addView(itemRelativeLayout);
                            linearLayout.addView(view);
                        }
                    }
                } else if (nameActivity.equals("MainActivity")) {
                    for (Object itemSearch : itemsSearch) {
                        String itemSearchString = (String) itemSearch;
                        if (itemSearchString.toLowerCase().contains(charSequence.toString().toLowerCase())) {
                            TextView textView = new TextView(getApplicationContext());
                            textView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                            textView.setText(itemSearchString);
                            textView.setTextSize(20);

                            View view = new View(getApplicationContext());
                            view.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 3));
                            view.setBackgroundColor(Color.parseColor("#dfdfdf"));

                            linearLayout.addView(textView);
                            linearLayout.addView(view);
                        }
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}