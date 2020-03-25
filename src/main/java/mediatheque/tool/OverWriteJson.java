package mediatheque.tool;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import mediatheque.Main;
import mediatheque.media.Book;
import mediatheque.media.Music;

public class OverWriteJson {

	public static void overWriteJson(String path)   {
	
	//ClassLoader classLoader = new Main().getClass().getClassLoader();
	//File file = new File(classLoader.getResource(path).getFile());
		
		File file = new File(path);
	  
	//Create the file
	try {
		if (file.createNewFile())
		{
		    System.out.println("File is created!");
		} else {
		    System.out.println("File already exists.");
		}
		
		ArrayList<Book> arrayBook = MediathequeData.getInstance().getBookArray();
		JSONArray listBookInJson = new JSONArray();
		JSONObject bookJson = new JSONObject();
		for ( Book book : arrayBook ) {
			bookJson.put("title", book.getTitle());
			bookJson.put("author",book.getAuthor());
			bookJson.put("year", book.getYear());
			bookJson.put("isbn", book.getIsbn());
			listBookInJson.add(bookJson);
		}
		
		JSONObject json = new JSONObject();        //base of JSON  
		json.put("books", listBookInJson);
		
		
		ArrayList<Music> arrayMusic = MediathequeData.getInstance().getMusicArray();
		JSONArray lsitMusicInJson = new JSONArray();
		JSONObject musicJson = new JSONObject();
		for ( Book book : arrayBook ) {
			musicJson.put("title", book.getTitle());
			musicJson.put("author",book.getAuthor());
			musicJson.put("year", book.getYear());
			musicJson.put("isbn", book.getIsbn());
			lsitMusicInJson.add(musicJson);
		}
		
		json.put("music", lsitMusicInJson);
		System.out.println(" write " +  json);
		
		//Write Content
		FileWriter writer = new FileWriter(file);
		writer.write(json.toJSONString());
		writer.close(); 
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	
	
	
	/*
	JSONObject obj = new JSONObject();
    obj.put("name", "mkyong.com");
    obj.put("age", 100);

    JSONArray list = new JSONArray();
    list.add("msg 1");
    list.add("msg 2");
    list.add("msg 3");

    obj.put("messages", list);
    
    {"name":"mkyong.com","messages":["msg 1","msg 2","msg 3"],"age":100}
	*/
	}
	
	
}
