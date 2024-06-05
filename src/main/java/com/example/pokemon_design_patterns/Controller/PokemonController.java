package com.example.pokemon_design_patterns.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pokemon_design_patterns.Model.Pokemon;
import com.example.pokemon_design_patterns.Service.PokemonService;

@RestController
@RequestMapping("/api/pokemons")
public class PokemonController {
  
    @Autowired
    PokemonService pokemonService;

     @PostMapping
    public ResponseEntity<Pokemon> criarPokemon(@RequestBody Pokemon pokemon) {
        Pokemon novoPokemon = pokemonService.salvarPokemon(pokemon);
        return ResponseEntity.ok(novoPokemon);
    }
    @GetMapping
    public ResponseEntity<List<Pokemon>> mostrarTodosPokemon (){
        List<Pokemon> poke = pokemonService.exibirTodosPokemon();
        return ResponseEntity.ok(poke);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Pokemon> mostrarPorId(@PathVariable Long id){
        Pokemon pokemon = pokemonService.byIdPokemon(id);
        return ResponseEntity.ok(pokemon);
    }
      @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPokemon(@PathVariable Long id) {
        pokemonService.deletebyId(id);
        return ResponseEntity.noContent().build();
    }


}