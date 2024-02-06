package datetime_handler.newapi;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExam {
	
	
	public static void main(String[] args) {
		
		LocalTime nowTime = LocalTime.now();
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		
		String strNowTime = timeFormatter.format(nowTime);
		System.out.println(nowTime);
		System.out.println(strNowTime);
		
		
		LocalTime nowTime1 = LocalTime.of(00, 00, 01);
		nowTime1 = nowTime1.plusHours(10);
		nowTime1 = nowTime1.plusMinutes(5);
		nowTime1 = nowTime1.plusSeconds(55);
		
		DateTimeFormatter timeFormatter1 = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		String strNowTime1 = timeFormatter1.format(nowTime1);
		System.out.println(nowTime1);
		System.out.println(strNowTime1);
		
		
	}

}
