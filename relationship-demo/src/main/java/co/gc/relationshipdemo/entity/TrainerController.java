package co.gc.relationshipdemo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.gc.relationshipdemo.repo.TrainerRepo;

@Controller
@RequestMapping("/trainer")
public class TrainerController {

	@Autowired
	private TrainerRepo trainerRepo;

	@RequestMapping("/")
	public ModelAndView index() {

		return new ModelAndView("trainer-list", "trainers", trainerRepo.findAll());
	}

	@RequestMapping("/add")
	public ModelAndView addTrainer() {
		return new ModelAndView("trainer-add");
	}

	@PostMapping("/add")
	public ModelAndView AddTrainer(Trainer trainer) {
		trainerRepo.save(trainer);
		return new ModelAndView("redirect:/trainer/");
	}

	@RequestMapping("/{id}")
	public ModelAndView showTrainer(@PathVariable("id") Trainer trainer) {

		return new ModelAndView("trainer-show", "trainer", trainer);

	}

}