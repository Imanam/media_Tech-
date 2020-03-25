package mediatheque.tool;

import java.io.File;
import java.io.FileReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import jdk.internal.org.jline.terminal.Attributes;
import mediatheque.Main;
import mediatheque.media.Book;
import mediatheque.media.Media;
import mediatheque.media.Movie;
import mediatheque.media.Music;

public class ParserJson {

	public static void parseJson(String path) {
		JSONParser jsonParser = new JSONParser();

		try {
			// String fileName = "test.json";
			ClassLoader classLoader = new Main().getClass().getClassLoader();

			File file = new File(classLoader.getResource(path).getFile());

			// File is found
			System.out.println("File Found : " + file.exists());

			Object obj = jsonParser.parse(new FileReader(file));

			JSONObject jsonObject = (JSONObject) obj;
			// System.out.println(jsonObject);
			JSONObject structure = (JSONObject) jsonObject.get("bibliotheque");
			// System.out.println(structure);

			JSONArray movies = (JSONArray) structure.get("movies");
			// System.out.println(movies);

			Iterator<JSONObject> iterator = ((List) movies).iterator();

			ArrayList<Movie> arrayMovie = MediathequeData.getInstance().getMovieArray();

			while (iterator.hasNext()) {
				// System.out.println(iterator.next());
				JSONObject detail = (JSONObject) iterator.next();
				String title = (String) detail.get("title");
				String director = (String) detail.get("director");
				int year = ((Long) detail.get("year")).intValue();
				arrayMovie.add(new Movie(title, director, year));
				// System.out.println(arrayMovie.size());
			}

			JSONArray music = (JSONArray) structure.get("music");
			//System.out.println(music);

			Iterator<JSONObject> iteratorMusic = ((List) music).iterator();

			ArrayList<Music> arrayMusic = MediathequeData.getInstance().getMusicArray();

			while (iteratorMusic.hasNext()) {
				// System.out.println(iterator.next());
				JSONObject detail = (JSONObject) iteratorMusic.next();
				String title = (String) detail.get("title");
				String composer = (String) detail.get("composer");
				int year = ((Long) detail.get("year")).intValue();
				arrayMusic.add(new Music(title, composer, year));
				//System.out.println(arrayMusic.size());
			}
			
			
			JSONArray books = (JSONArray) structure.get("books");
			//System.out.println(books);

			Iterator<JSONObject> iteratorBook = ((List) books).iterator();

			ArrayList<Book> arrayBook = MediathequeData.getInstance().getBookArray();

			while (iteratorBook.hasNext()) {
				// System.out.println(iterator.next());
				JSONObject detail = (JSONObject) iteratorBook.next();
				String title = (String) detail.get("title");
				String author = (String) detail.get("author");
				int year = ((Long) detail.get("year")).intValue();
				Long isbn = (Long) detail.get("isbn");
				arrayBook.add(new Book(title, author, year, isbn));
				//System.out.println(arrayMovie.size());
			}
			
			/*
			 for (Book book : arrayBook) {
		            System.out.println(book);
		        }
			*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/*
	private List<? extends Media> parseArray(JSONArray array, String objectType, String[] keys) {
		
		Iterator<JSONObject> it = (Iterator<JSONObject>)(array.iterator());
		while (it.hasNext()) {
			JSONObject details = it.next();
			String[] values = new String[keys.length];
			for (int i=0;i<keys.length;i++) {
				values[i] = (String) details.get(keys[i]);
			}
			
			arrayBook.add(new Book(title, author, year, isbn));
			//System.out.println(arrayMovie.size());
		}
		
		ArrayList<Book> arrayBook = MediathequeData.getInstance().getBookArray();

		
	}
	*/
	public ArrayList<?> createArray(JSONObject obj, String argClassName, String argTitle, String secondeArg, String argYear) throws ParseException {
		JSONArray className = (JSONArray) obj.get(argClassName);
		System.out.println(className);

		Iterator<JSONObject> iterator = ((List) className).iterator();

		ArrayList<Music> arrayMusic = MediathequeData.getInstance().getMusicArray();

		while (iterator.hasNext()) {
			// System.out.println(iterator.next());
			JSONObject detail = (JSONObject) iterator.next();
			String title = (String) detail.get(argTitle);
			String composer = (String) detail.get(secondeArg);
			int year = ((Long) detail.get(argYear)).intValue();
			arrayMusic.add(new Music(title, composer, year));
			System.out.println(arrayMusic.size());
		}
		return arrayMusic;

	}

}
