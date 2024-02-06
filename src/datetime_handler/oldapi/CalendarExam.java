package datetime_handler.oldapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Java 1.8 미만
 */

public class CalendarExam {
	
	public static void main(String[] args) {
		
		// Java Compile Language ==> Java 10부터 지역변수에 한해 타입추론(var)을 사용할 수 있다.
		// 하지만 파라미터에 []x 등 불편해서 잘 사용 안함
//		var nowDateTime = Calendar.getInstance();
		Calendar nowDateTime = Calendar.getInstance();
		System.out.println(nowDateTime);
		int year = nowDateTime.get(Calendar.YEAR);
		System.out.println(year);
		
		Calendar past = Calendar.getInstance();
		past.set(Calendar.YEAR, 1970);
		past.set(Calendar.MONTH, 0);
		past.set(Calendar.DAY_OF_MONTH, 1);
		past.set(Calendar.HOUR, 0);
		past.set(Calendar.MINUTE, 0);
		past.set(Calendar.SECOND, 0);
		
		past.set(2022, 3-1, 1, 1, 50, 17);
		System.out.println(past);
		
		
		Date now = Calendar.getInstance().getTime();
		System.out.println(now);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formatDate = format.format(now);
		System.out.println(formatDate);
		
		Calendar nowCal = Calendar.getInstance();
//		nowCal.set(2022, 01, 01);
//		nowCal.add(Calendar.DAY_OF_MONTH, 10);
		nowCal.add(Calendar.DAY_OF_MONTH, -20);
		
		System.out.println(nowCal);
		
		
		
		
	}
	

}
