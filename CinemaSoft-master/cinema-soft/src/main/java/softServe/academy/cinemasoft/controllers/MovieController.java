package softServe.academy.cinemasoft.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MovieController {
			@GetMapping("/")
			public ModelAndView index (ModelAndView modelAndView) {
				modelAndView.setViewName("index");
				modelAndView.addObject("messege", "Hello mate!");
				return modelAndView;
			}

}
