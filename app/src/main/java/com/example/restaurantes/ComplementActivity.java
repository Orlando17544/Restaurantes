package com.example.restaurantes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.appbar.MaterialToolbar;

public class ComplementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complement);

        Complement complement = getIntent().getParcelableExtra(ComplementFragment.EXTRA_COMPLEMENT);

        MaterialToolbar topAppBar = findViewById(R.id.topAppBar);

        topAppBar.setTitle(complement.getName());

        topAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        TextView complementName = findViewById(R.id.complement_name);
        TextView complementPrice = findViewById(R.id.complement_price);

        complementName.setText(complement.getName());
        complementPrice.setText("$ " + complement.getPrice());
    }
}