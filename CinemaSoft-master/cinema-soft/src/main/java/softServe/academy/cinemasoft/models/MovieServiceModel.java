package softServe.academy.cinemasoft.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


public class MovieServiceModel {
	
	
	public String id;
	
	public String title;
	
	public String director;
	
	public List<String> cast;
	
	public byte[] cover;
	
	public String trailer;
	
	public String description;
	
	public String duration;
	
	public double rating;

	public String getId() {
		return id;
	}
	
	@Autowired
	public MovieServiceModel() {
		
	}

	public void setId(String id) {
		this.id = id;
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
	
	//public List<Category> categories;
	
	//public List<Comment> comments;
}
