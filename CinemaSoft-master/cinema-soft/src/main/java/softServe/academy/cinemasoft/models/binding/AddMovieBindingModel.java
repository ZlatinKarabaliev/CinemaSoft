package softServe.academy.cinemasoft.models.binding;

import java.util.List;

import javax.validation.constraints.*;

import org.springframework.beans.factory.annotation.Autowired;

public class AddMovieBindingModel {

	@NotEmpty(message = "Movie title cannot be empty.")
	public String title;
	
	@NotEmpty(message = "Movie's director cannot be empty.")
	public String director;
	
	public List<String> cast;
	
	public byte[] cover;
	
	public String trailer;
	
    @NotEmpty(message = "Virus description cannot be empty.")
    @Size(min=5, max=100, message = "Virus description must be between 5 and 100 symbols long.")
	public String description;
	
	public String duration;
	
	public double rating;

	@Autowired
	public AddMovieBindingModel() {
		
	}
	
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public List<String> getCast() {
		return cast;
	}

	public void setCast(List<String> cast) {
		this.cast = cast;
	}

	public byte[] getCover() {
		return cover;
	}

	public void setCover(byte[] cover) {
		this.cover = cover;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
}
