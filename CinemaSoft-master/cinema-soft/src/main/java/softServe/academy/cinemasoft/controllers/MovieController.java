package softServe.academy.cinemasoft.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RestController;

import softServe.academy.cinemasoft.models.view.AddMovieViewModel;
import softServe.academy.cinemasoft.services.MovieService;

@Controller
@RestController
@RequestMapping("/movie")
public class MovieController {
	 private MovieService movieService;
	 
    @GetMapping("/")
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("index");

        modelAndView.addObject("movie", this.movieService.getAllMovie());

        return modelAndView;
    }
    
    
    @GetMapping("/add-movie")
    public ModelAndView add(ModelAndView modelAndView) {
        modelAndView.setViewName("add-movie");
        
        AddMovieViewModel viewModel = new AddMovieViewModel();
        
       
        modelAndView.addObject("model", viewModel);
        return modelAndView;
    }
    
    
    @GetMapping("/show-movies")
    public ModelAndView showMovie(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        modelAndView.addObject("movies", this.movieService.getAllMovie());
        return modelAndView;
    }

}

