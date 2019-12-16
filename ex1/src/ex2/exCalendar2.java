package ex2;

import java.util.Calendar;
import java.util.Date;

public class exCalendar2 {

	public static void main(String[] args) {
		//Calendar calendar = Calendar.getInstance();
		/*Date date = calendar.getTime();
		System.out.println(date);*/
		
		/*Date date = new Date(calendar.getTimeInMillis());
		System.out.println(date);*/
	
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		System.out.println(calendar.getTime());
	}

}
