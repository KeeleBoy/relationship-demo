package co.gc.relationshipdemo.entity;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.gc.relationshipdemo.repo.TrainerRepo;

@Controller

public class LoginController {

	@Autowired
	private TrainerRepo trainRepo;

	@Autowired
	private HttpSession sesh;

	@RequestMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("login-form");

	}

	@PostMapping("/login")
	public ModelAndView loginSubmit(@RequestParam("username") String username,
			@RequestParam("password") String password, RedirectAttributes redir) {

		Trainer trainer = trainRepo.findByUsernameIgnoreCase(username);

		if (trainer == null || !password.equals(trainer.getPassword())) {
			ModelAndView mav = new ModelAndView("login-form");
			mav.addObject("message", "Wrong user name or password loser");
			return mav;
		}

		sesh.setAttribute("user", trainer);

		redir.addFlashAttribute("message", "Logged you in fam " + trainer.getUsername());

		return new ModelAndView("redirect:/trainer/" + trainer.getId());

	}

	@RequestMapping("/logout")
	public ModelAndView logout(RedirectAttributes redir) {

		sesh.invalidate();

		redir.addFlashAttribute("message", "logged you out :/");
		return new ModelAndView("redirect:/login");

	}

}
