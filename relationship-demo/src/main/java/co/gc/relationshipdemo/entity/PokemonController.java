package co.gc.relationshipdemo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.gc.relationshipdemo.repo.PokemonRepo;
import co.gc.relationshipdemo.repo.TrainerRepo;

@Controller
@RequestMapping("/pokemon")
public class PokemonController {

	@Autowired
	private PokemonRepo pokeRepo;

	@Autowired
	private TrainerRepo trainRepo;

	@RequestMapping("/")
	public ModelAndView index() {

		return new ModelAndView("pokemon-list", "pokemons", pokeRepo.findAll());

	}

	@RequestMapping("/add")
	public ModelAndView addPokemon() {
		return new ModelAndView("pokemon-add", "trainers", trainRepo.findAll());

	}

	@PostMapping("/add")
	public ModelAndView addPokemon(Pokemon poke) {

		pokeRepo.save(poke);

		return new ModelAndView("redirect:/pokemon/");

	}

}
