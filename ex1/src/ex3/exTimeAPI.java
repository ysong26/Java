package ex3;

import java.time.*;

public class exTimeAPI {

	public static void main(String[] args) {
/*		// 날짜
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		// 시각
		LocalTime time = LocalTime.now();
		System.out.println(time);
		*/
		
		// 일시
		LocalDateTime dateTime = LocalDateTime.now();
/*		System.out.println(dateTime);
		
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.of(2017, Month.JANUARY,1, 1, 23, 45));
		System.out.println(LocalDateTime.of(2017, 1, 1,1 , 23, 45, 678_000_000));*/
		
		//System.out.println(LocalDateTime.parse("2017-01-01T01:23:45.678"));
		System.out.println(dateTime.getMonth());
		System.out.println(dateTime.plusMonths(3));
	}

}
