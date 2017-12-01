package com.example.rusili.homework11.pokedexActivity.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rusili.homework11.R;
import com.example.rusili.homework11.pokedexActivity.model.Pokedex;
import com.example.rusili.homework11.pokedexActivity.model.objects.PokemonEntries;

import java.util.List;

/**
 * Created by c4q on 12/1/17.
 */

public class PokedexViewHolder extends RecyclerView.ViewHolder {


   ImageView pokeimage;
    TextView pokename;
    TextView pokeID;

    public PokedexViewHolder(View itemView) {
        super(itemView);

        pokename = (TextView) itemView.findViewById(R.id.);
        pokeID = (TextView) itemView.findViewById(R.id.);
        pokeimage = (ImageView) itemView.findViewById(R.id.);

    }

    public void bind(PokemonEntries pokemonEntries){

        pokename.setText(pokemonEntries.getPokemon_species().getName());
        pokeID.setText(pokemonEntries.getEntry_number());
        //glide

    }



}
