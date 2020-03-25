package mediatheque.tool;

import java.util.ArrayList;

import mediatheque.media.Book;
import mediatheque.media.Document;
import mediatheque.media.Movie;
import mediatheque.media.Music;
import mediatheque.media.Photograph;

public class MediathequeData {
	private static MediathequeData mInstance;
	private ArrayList<Movie> listMovie = null;
	private ArrayList<Document> listDocument = null;
	private ArrayList<Book> listBook = null;
	private ArrayList<Photograph> listPhotograph = null;
	private ArrayList<Music> listMusic = null;

	public static MediathequeData getInstance() {
		if (mInstance == null)
			mInstance = new MediathequeData();

		return mInstance;
	}

	private MediathequeData() {
		listMovie = new ArrayList<Movie>();
		listDocument = new ArrayList<Document>();
		listBook = new ArrayList<Book>();
		listPhotograph = new ArrayList<Photograph>();
		listMusic = new ArrayList<Music>();
	}

	// retrieve array from anywhere
	public ArrayList<Movie> getMovieArray() {
		return this.listMovie;
	}

	public ArrayList<Document> getDocuementArray() {
		return this.listDocument;
	}

	public ArrayList<Book> getBookArray() {
		return this.listBook;
	}

	public ArrayList<Photograph> getPhotographArray() {
		return this.listPhotograph;
	}

	public ArrayList<Music> getMusicArray() {
		return this.listMusic;
	}

	// Add element to array
    /*
	public void addToArray(Movie value) {
		list.add(value);
	}
	*/
}
