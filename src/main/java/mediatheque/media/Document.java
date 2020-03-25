package mediatheque.media;

public class Document extends Media {
	private String author;
	

	public Document(String title, String author, int year) {
		super(title, year);
		this.author = author;
	}
	
	protected String getAuthor() {
		return this.author;
	}
	
	@Override
	public String printOut(){  
		return getTitle()+" "+ author +" "+ getYear();
	}  
	
	
}
