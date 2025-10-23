package Movie;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private String director;
    private List<String> actors;
    private List<String> reviews;

    public Movie(String title, String director, List<String> actors) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = new ArrayList<>();
    }
    public String getTitle() {
        return title;

    }
    public String getDirector() {
        return director;
    }
    public List<String> getActors() {
        return actors;
    }
    public List<String> getReviews() {
        return reviews;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setActors(List<String> actors) {
        this.actors = actors;
    }
    public void setReview(String review) {
        reviews.add(review);
    }
    public List<String> retrieveReviews() {
        return reviews;

    }
}
