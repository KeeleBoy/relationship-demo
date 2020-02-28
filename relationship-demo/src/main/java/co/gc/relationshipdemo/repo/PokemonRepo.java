package co.gc.relationshipdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import co.gc.relationshipdemo.entity.Pokemon;

public interface PokemonRepo extends JpaRepository<Pokemon, Long> {

}
