package com.example.rusili.homework11.pokedexActivity.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.rusili.homework11.R;
import com.example.rusili.homework11.pokedexActivity.model.Pokedex;
import com.example.rusili.homework11.pokedexActivity.model.objects.PokemonEntries;

import java.util.List;

/**
 * Created by c4q on 12/1/17.
 */

public class PokedexAdapter extends RecyclerView.Adapter<PokedexViewHolder> {

    private List<PokemonEntries> pokeList;
    private Context context;

    public PokedexAdapter(List<PokemonEntries> pokeList, Context context) {
        this.pokeList = pokeList;
        this.context = context;
    }

    @Override
    public PokedexViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.poke_itemview, parent, false);
        return new PokedexViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(PokedexViewHolder holder, int position) {
        PokemonEntries pokemons = pokeList.get(position);
        holder.bind(pokemons);
        Glide.with(context)
                .load(pokemons.getPokemon_species().getUrl())
                .into(holder.pokeimage);
    }

    @Override
    public int getItemCount() {
        return pokeList.size();
    }
}
