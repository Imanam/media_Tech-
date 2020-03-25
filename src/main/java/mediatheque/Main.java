package mediatheque;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import mediatheque.media.Book;
import mediatheque.media.Document;
import mediatheque.media.Media;
import mediatheque.media.Movie;
import mediatheque.media.Music;
import mediatheque.media.Photograph;
import mediatheque.tool.MediathequeData;
import mediatheque.tool.MyDate;
import mediatheque.tool.OverWriteJson;
import mediatheque.tool.ParserJson;

public class Main {

	public static void main(String[] args) throws IOException, ParseException, NullPointerException {
		// TODO Auto-generated method stub
		// System.out.println("Hello Zoo!!");

		Photograph photo = new Photograph("toto", "Cindy Button", 2001);
		System.out.println(photo);

		Music music = new Music("Fur Elise", "Beethoven", 1810);
		System.out.println(music);

		Movie movie = new Movie("From dusk till dawn", "Quentin Taranino", 1996);
		System.out.println(movie);

		//MyDate mydate = new MyDate(8, 10, 2016);
		//Book book = new Book("Hamlet", "William Shakespeare", mydate, 9781539404002L);
		Book book = new Book("Hamlet", "William Shakespeare", 1601, 9781539404002L);
		System.out.println(book);

		Document doc = new Document("United States Declaration of Independence", "‎Thomas Jefferson", 1776);
		System.out.println(doc);
		
		// reading Json file
		ParserJson parserJson = new ParserJson();
		parserJson.parseJson("test.json");
		
		ArrayList<Book> listBook = MediathequeData.getInstance().getBookArray();
		listBook.add(book);
		
		OverWriteJson overWrite = new OverWriteJson();
		
		String path = "C:\\Users\\manam\\workspace\\mediatheque\\src\\main\\resources\\output.json";
		overWrite.overWriteJson(path);
		
		
		/*
		 * for (Book bookInTheList : listBook) {
            System.out.println( bookInTheList);
        }
		 * 
		 * Object obj = jsonParser.parse(new FileReader("../../resources/test.json"));
		 * 
		 * 
		 * 
		 * // A JSON array. JSONObject supports java.util.List interface. JSONArray
		 * companyList = (JSONArray) jsonObject.get("Company List");
		 * 
		 * // An iterator over a collection. Iterator takes the place of Enumeration in
		 * the Java Collections Framework. // Iterators differ from enumerations in two
		 * ways: // 1. Iterators allow the caller to remove elements from the underlying
		 * collection during the iteration with well-defined semantics. // 2. Method
		 * names have been improved. Iterator<JSONObject> iterator =
		 * companyList.iterator(); while (iterator.hasNext()) {
		 * System.out.println(iterator.next()); } } catch (Exception e) {
		 * e.printStackTrace(); }
		 * 
		 */

	}

}
