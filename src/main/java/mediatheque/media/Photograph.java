package mediatheque.media;

public class Photograph extends Document {

	public Photograph(String title, String author, int year) {
		super(title, author, year);
	}
	
	@Override
	public String printOut() {
		return getTitle()+" "+ getAuthor();
	}
	
}
