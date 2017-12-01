package com.example.rusili.homework11;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

/**
 * Created by melina.gonzalez on 11/29/17.
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain);

        RecyclerView pokeRecyclerView = (RecyclerView) findViewById(R.id.poke_recyclerview);
    }
}
