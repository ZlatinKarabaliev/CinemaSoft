package softServe.academy.cinemasoft.models.service;



public class movieServiceModel {

	  
	    public String id;

	    public String title;
	    
	  
	    public String director;
	    
//	    
//	    public byte[] cast;
	 
	    public String trailer;
	    
	    public String discription;
	    
	    public String duration;
	   
	    
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

//		public List<String> getCast() {
//			return cast;
//		}
	//
//		public void setCast(List<String> cast) {
//			this.cast = cast;
//		}

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
