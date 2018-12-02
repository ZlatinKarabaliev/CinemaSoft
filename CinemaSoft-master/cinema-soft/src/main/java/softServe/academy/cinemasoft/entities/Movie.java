package softServe.academy.cinemasoft.entities;

import org.hibernate.annotations.GenericGenerator;

import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="movie")
public class Movie {
	
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false, nullable = false)
    public String id;

    @Column(nullable = false, unique = true)
    public String title;
    

    @Column(nullable = false)
    public String director;
    

//    @Column(nullable = false)
//    @ElementCollection(targetClass=String.class)
//    public byte[] cast;
    

    @Column(nullable = false)
    public String trailer;
    
    @Column(nullable = false)
    public String discription;
    
    @Column(nullable = false)
    public String duration;
   
    @Column
    public double rating;
    
    /*
     *  @Column
    @OneToMany(mappedBy = "category")
    private List<Category> categories;
    */
    
    
    
    /*
     *  @Column
    @OneToMany(mappedBy = "comment")
    private List<Comment> comments;
    */


	public String getId() {
		return id;
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

//	public List<String> getCast() {
//		return cast;
//	}
//
//	public void setCast(List<String> cast) {
//		this.cast = cast;
//	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
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
