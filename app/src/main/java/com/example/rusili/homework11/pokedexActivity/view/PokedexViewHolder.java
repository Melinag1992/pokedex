package com.example.rusili.homework11.pokedexActivity.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
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

    String url;

    public PokedexViewHolder(View itemView) {
        super(itemView);

        pokename = (TextView) itemView.findViewById(R.id.poke_name);
        pokeID = (TextView) itemView.findViewById(R.id.poke_number);
        pokeimage = (ImageView) itemView.findViewById(R.id.poke_image);

    }

    public void bind(PokemonEntries pokemonEntries) {

        url = pokemonEntries.getPokemon_species().getUrl();
        pokename.setText(pokemonEntries.getPokemon_species().getName());
        pokeID.setText(String.valueOf(pokemonEntries.getEntry_number()));

        Glide.with(itemView.getContext())
                .load(url)
                .into(pokeimage);
    }


}
