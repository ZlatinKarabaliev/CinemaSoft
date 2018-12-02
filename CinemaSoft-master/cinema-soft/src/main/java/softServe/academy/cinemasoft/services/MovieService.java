package softServe.academy.cinemasoft.services;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import softServe.academy.cinemasoft.entities.Movie;
import softServe.academy.cinemasoft.models.MovieServiceModel;
import softServe.academy.cinemasoft.repositories.MovieRepository;
import org.modelmapper.ModelMapper;

public class MovieService{

	private MovieRepository movieRepository ;


	@Autowired
    public  MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
	

	
	public List<MovieServiceModel> getAllMovie() {
		  ModelMapper modelMapper = new ModelMapper();

	        return this.movieRepository
	                .findAll()
	                .stream()
	                .map(x -> modelMapper.map(x, MovieServiceModel.class))
	                .collect(Collectors.toList());
	
	}

	
	public void addMovie( MovieRepository movie) {
		  ModelMapper modelMapper = new ModelMapper();
	        Movie movieEntity = modelMapper.map(movie, Movie.class);
	        this.movieRepository.save(movieEntity);
		
	}
	
	public void deleteMovie(String id) {
        if(this.movieRepository.findById(id).orElse(null) != null) {
            this.movieRepository.deleteById(id);
        }
    }



	public void editMovie(String id, MovieRepository movie) {
	        Movie movieEntity = this.movieRepository
	        		.findById(id)
	                .orElse(null);

	        if(movieEntity == null) return;
	        
	        this.movieRepository.save(movieEntity);
		
	}


	
	
}
