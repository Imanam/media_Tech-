package mediatheque.media;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Music extends Media {
	private String composer;
	//private Date year;
	

	public Music(String title, String composer, int year) throws ParseException {
		super(title, year);
		this.composer = composer;
		/*
		String yearString = Integer.toString(year); 
		SimpleDateFormat originalFormat = new SimpleDateFormat("yyyy");
		this.year = originalFormat.parse(yearString);
		*/
	}

	@Override
	public String printOut() {
		return getTitle()+" "+ composer +" "+ getYear();
	}

	

}
