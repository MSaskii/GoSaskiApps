package com.kii.gosaskiapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_menu);
    }

    public void clickRS(View view) {
        // Gambar RS di click
        Intent i = new Intent(this, RS.class);
        startActivity(i);
    }

    public void clickPolice(View view) {
        Intent i = new Intent(this, PL.class);
        startActivity(i);
    }

    public void clickMarket(View view) {
        Intent i = new Intent(this, MR.class);
        startActivity(i);
    }

    public void clickSchool(View view) {
        Intent i = new Intent(this, SC.class);
        startActivity(i);
    }
}
