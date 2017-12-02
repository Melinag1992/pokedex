package com.example.rusili.homework11.pokedexActivity.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

import com.example.rusili.homework11.R;
import com.example.rusili.homework11.network.RetrofitFactory;
import com.example.rusili.homework11.pokedexActivity.model.Pokedex;
import com.example.rusili.homework11.pokedexActivity.model.objects.PokemonEntries;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rusi.li on 11/22/17.
 */

public class PokedexFragment extends Fragment {
    private RetrofitFactory.PokedexNetworkListener pokedexNetworkListener;
    private RecyclerView recyclerView;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pokedex , container , false);

        recyclerView = (RecyclerView) view.findViewById(R.id.pokedex_recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        getPokedexList();

        return view;
    }

    private void getPokedexList() {
        pokedexNetworkListener = new RetrofitFactory.PokedexNetworkListener() {
            @Override
            public void pokedexCallback(Pokedex pokedex) {
                // TODO: show Pokemon
                // Each pokemon is in the Pokemon_Species object.
                List<PokemonEntries> pokemon_species = Arrays.asList(pokedex.getPokemon_entries());

                PokedexAdapter pokedexAdapter  = new PokedexAdapter(pokemon_species,getContext());

                GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),3);
                recyclerView.setAdapter(pokedexAdapter);
                recyclerView.setLayoutManager(gridLayoutManager);
            }
        };
        RetrofitFactory.getInstance().setPokedexListener(pokedexNetworkListener);
        RetrofitFactory.getInstance().getPokedex(2);

    }
}
