package mediatheque.media;

public class Book extends Media {
	//private final Date publishedDate;
	private long isbn;
	private String author;
	
	public Book(String title,String author, int year, long isbn) {
		super(title, year);
		this.isbn = isbn;
		this.author = author;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public long getIsbn() {
		return this.isbn;
	}
	@Override
	public String printOut() {
		return getTitle()+" "+ getIsbn() +  " " + getAuthor()+" "+ getYear() ;
	}
}
