package mediatheque.tool;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate extends Date{
	
	private static final SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	
	public MyDate(int day, int month, int year ) {
		super(year - 1900, month - 1, day);
	}
	
	@Override
	public String toString() {
		return sdf1.format(this);
	}
}
