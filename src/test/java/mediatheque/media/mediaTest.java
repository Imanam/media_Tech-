package mediatheque.media;

import static org.junit.Assert.*;

import org.junit.Test;

public class mediaTest {

	@Test
	public void testGetTitle() {
		String title  = "toto";
		String author = "titi";
		int year = 1999;
		long isbn = 9876543212345L;
		Book book = new Book(title, author, year, isbn);
		
		String result = book.getAuthor();
		 assertEquals(result, author);
		//fail("Not yet implemented");
	}

}
