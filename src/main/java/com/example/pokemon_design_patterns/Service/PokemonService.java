package com.example.pokemon_design_patterns.Service;



import java.util.List;

import com.example.pokemon_design_patterns.Model.Pokemon;

public interface PokemonService {
    Pokemon salvarPokemon (Pokemon pokemon);
    List<Pokemon>exibirTodosPokemon();
    Pokemon byIdPokemon(Long id);
    void deletebyId(long id);


}
