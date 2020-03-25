package mediatheque.media;

import java.util.Date;

public class Movie extends Media {
	private String director;
	

	public Movie(String title, String director, int year) {
		super(title, year);
		this.director = director;

	}

	@Override
	public String printOut() {
		return getTitle()+" "+ director +" "+ getYear();
	}

}
