package datetime_handler.newapi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExam {
	
	public static void main(String[] args) {
		
		
		LocalDateTime nowDateTime = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		String strNowDateTime = dateTimeFormatter.format(nowDateTime);
		System.out.println(nowDateTime);
		System.out.println(strNowDateTime);
		
		
		
		LocalDateTime  nowDateTime1 = LocalDateTime.of(2022, 2, 1, 11, 39, 11);
		nowDateTime1 = nowDateTime1.plusDays(10);
		nowDateTime1 = nowDateTime1.plusMonths(2);
		nowDateTime1 = nowDateTime1.plusYears(3);
		nowDateTime1 = nowDateTime1.plusHours(10);
		nowDateTime1 = nowDateTime1.plusMinutes(5);
		nowDateTime1 = nowDateTime1.plusSeconds(55);
		
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		String strNowDateTime1 = dateTimeFormatter1.format(nowDateTime1);
		System.out.println(nowDateTime1);
		System.out.println(strNowDateTime1);
		
		
	}
	

}
