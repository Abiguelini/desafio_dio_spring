package com.example.pokemon_design_patterns.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pokemon_design_patterns.Model.Pokemon;

@Repository
public interface PokemonRepository  extends JpaRepository<Pokemon, Long> {

}
