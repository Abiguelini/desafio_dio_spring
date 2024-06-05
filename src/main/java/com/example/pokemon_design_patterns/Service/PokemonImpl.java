package com.example.pokemon_design_patterns.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pokemon_design_patterns.Model.Pokemon;
import com.example.pokemon_design_patterns.Repository.PokemonRepository;

@Service
public class PokemonImpl implements PokemonService {

    @Autowired
    PokemonRepository pokemonRepository;

    @Override
    public Pokemon salvarPokemon(Pokemon pokemon) {
        pokemonRepository.save(pokemon);
        throw new UnsupportedOperationException("Não foi possivel capturar esse Pokemon");
    }

    @Override
    public List<Pokemon> exibirTodosPokemon() {
        pokemonRepository.findAll();
        throw new UnsupportedOperationException("Não foi possivel mostrar todos Pokemon ");
    }

    @Override
    public Pokemon byIdPokemon(Long id) {
        Optional<Pokemon> PokemonId = pokemonRepository.findById(id);
        return PokemonId.orElseThrow(()-> new RuntimeException("Não foi possivel encontrar esse pokemon"));
    }

    

    @Override
    public void deletebyId(long id) {
       pokemonRepository.deleteById(id);
        throw new UnsupportedOperationException("Não foi possivel deletar pelo Id");
    }

}
