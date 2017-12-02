package com.example.rusili.homework11;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.rusili.homework11.pokedexActivity.view.PokedexFragment;

/**
 * Created by melina.gonzalez on 12/1/17.
 */

public class MainActivity  extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        PokedexFragment pokedexFragment = new PokedexFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_container, pokedexFragment);
        fragmentTransaction.commit();

    }
}
