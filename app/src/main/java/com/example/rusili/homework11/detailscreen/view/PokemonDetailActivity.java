package com.example.rusili.homework11.detailscreen.view;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.telecom.Call;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.rusili.homework11.R;
import com.example.rusili.homework11.detailscreen.api.PokemonApi;
import com.example.rusili.homework11.detailscreen.model.Pokemon;
import com.example.rusili.homework11.detailscreen.model.objects.Sprites;
import com.example.rusili.homework11.network.RetrofitFactory;
import com.example.rusili.homework11.pokedexActivity.api.PokedexApi;
import com.example.rusili.homework11.pokedexActivity.model.objects.PokemonEntries;

public class PokemonDetailActivity extends AppCompatActivity{
	private RetrofitFactory.PokemonNetworkListener pokemonNetworkListener;
	private Context context ;
	private TextView pokemon_type;
	private ImageView pokemon_img;
	private TextView poke_stats;
	@Override
	public void onCreate (@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.pokemon_details_itemview);
		poke_stats =  findViewById(R.id.poke_stat_textview);
		pokemon_type =  findViewById(R.id.poke_type_textview);
		pokemon_img = findViewById(R.id.poke_images_sprites);
		initialize();
	}

	private void initialize () {
		getPokemonDetails();
	}

	private void getPokemonDetails () {
		pokemonNetworkListener = new RetrofitFactory.PokemonNetworkListener() {
			@Override
			public void pokemonCallback (Pokemon pokemon) {
				//TODO: Display pokemon data
				//Hint: Learn how to use Glide to display an image.
				poke_stats.setText(pokemon.getStats().toString());
				pokemon_type.setText(pokemon.getTypes().toString());
				Glide.with(context)
						.load(pokemon.getSprites().getFront_default())
						.placeholder(R.mipmap.ic_launcher)
						.override(200, 125)
						.diskCacheStrategy(DiskCacheStrategy.ALL)
						.into(pokemon_img);
//

			}
		};
		RetrofitFactory.getInstance().setPokemonNetworkListener(pokemonNetworkListener);
//		RetrofitFactory.getInstance().getPokemon();
	}

}
