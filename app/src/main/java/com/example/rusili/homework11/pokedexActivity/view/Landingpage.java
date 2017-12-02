package com.example.rusili.homework11.pokedexActivity.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.rusili.homework11.MainActivity;
import com.example.rusili.homework11.R;


/**
 * Created by melina.gonzalez on 12/2/17.
 */

public class Landingpage extends AppCompatActivity implements View.OnClickListener{
 private Button startbutton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pokedexmain);

        startbutton = findViewById(R.id.start_button);
        startbutton.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent k = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(k);

    }
}
