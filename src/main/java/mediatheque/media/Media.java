package mediatheque.media;
import java.util.ArrayList;

import mediatheque.tool.PrintConsole;


public abstract class Media implements PrintConsole {
	private String title;
	private int year;
	
	public Media(String title, int year) {
		this.title = title;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public int getYear() {
		return year;
	}

	public abstract String printOut();
	
	
	
		
}
