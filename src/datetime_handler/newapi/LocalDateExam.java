package datetime_handler.newapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class LocalDateExam {
	
	/**
	 * 전달 받은 날짜의 첫 번째 날짜부터 마지막 날짜까지를 출력 (요일 포함)
	 * @param date 기준이 되는 날짜
	 */
	public static void printCalendar(LocalDate date) {
	
		// date 인스턴스를 YearMonth로  변경
		YearMonth yearMonth = YearMonth.from(date);
		
		// 첫번째 날짜를 구한다
		LocalDate firstDay = yearMonth.atDay(1);			
		
		// date 인스턴스의 월의 총 길이(며칠)을 구한다
		int days = date.lengthOfMonth();
		
		// 반복하여 날짜와 요일을 출력한다
		System.out.println(firstDay);
		System.out.println(firstDay.getDayOfWeek().name());
		
		for(int i = 0; i < days - 1; i++) {
			firstDay = firstDay.plusDays(1);
			System.out.println(firstDay);
			System.out.println(firstDay.getDayOfWeek().name());
		}
		
		System.out.println("========================");
	}
	
	
	/**
	 * 가장 가까운 다음 영업일을 구한다.
	 * @param localDate 오늘
	 * @return
	 */
	public static Map<String, Object> getClosestWorkingDay(LocalDate localDate) {
		
		// 1. localDate에 하루를 더한다.
		localDate = localDate.plusDays(1);
		
		// 2. 오늘의 요일을 구한다.
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		
		int dayCount = 1;
		
			// 3. 하루를 더한 날짜가 휴일인지 검사한다.
		while(dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
			// 4. 만약 휴일이라면 하루를 또 더한다.
			localDate = localDate.plusDays(1);
			dayOfWeek = localDate.getDayOfWeek();
			dayCount++;
		}
		
		Map<String, Object> result = new HashMap<>();
		result.put("workingDay", localDate);
		result.put("dayCount", dayCount);
		
		// 5. 만약 휴일이 아니라면 더한 결과를 반환한다.
		return result;
		
	}
	
	
	
	public static void main(String[] args) {
		
		Map<String, Object> closestWorkingDay = getClosestWorkingDay(LocalDate.now());
		System.out.println(closestWorkingDay.get("workingDay"));
		System.out.println(closestWorkingDay.get("dayCount"));
		
		closestWorkingDay = getClosestWorkingDay(LocalDate.of(2024, 2, 9)); // 금요일
		System.out.println(closestWorkingDay.get("workingDay"));
		System.out.println(closestWorkingDay.get("dayCount"));
		System.out.println("========================");
		
		
		printCalendar(LocalDate.now());
		
//		LocalDate nowDate = LocalDate.now();
//		
//		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
//		String strNowDate = dateFormatter.format(nowDate);
//		System.out.println(nowDate);
//		System.out.println(strNowDate);
//		
//		// 날짜변경하기		
//		LocalDate nowDate1 = LocalDate.of(2022, 1, 1);
//		nowDate1 = nowDate1.plusDays(10);
//		nowDate1 = nowDate1.plusMonths(2);
//		nowDate1 = nowDate1.plusYears(3);
//		
//		DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
//		String strNowDate1 = dateFormatter1.format(nowDate1);
//		System.out.println(nowDate1);
//		System.out.println(strNowDate1);
		
		
		 LocalDate now = LocalDate.now();
//		 LocalDate now = LocalDate.of(2022, 1, 15);		 
		 // 현재 요일		 
		 System.out.println(now.getDayOfWeek().name()); // LocalDate, LocalDateTime 사용
		 
		 YearMonth yearMonth = YearMonth.from(now);
		 // 이번 달의 첫 번째 날 구하기
		 LocalDate firstDay = yearMonth.atDay(1); // LocalDate, LocalDateTime 사용
		 System.out.println(firstDay);
		 System.out.println(firstDay.getDayOfWeek().name());
		 
		 
		 // 이번 달의 마지막 날 구하기
		 LocalDate lastDay = yearMonth.atEndOfMonth(); // LocalDate, LocalDateTime 사용
		 System.out.println(lastDay);
		 System.out.println(lastDay.getDayOfWeek().name());
		 
		 // 이번 달은 총 며칠인지 구하기
		 int lengthOfDays = now.lengthOfMonth(); // LocalDate 전용
		 System.out.println(lengthOfDays);
		 
		 // 이번 해는 총 며칠인지 구하기
		 int lengthOfYears = now.lengthOfYear(); // LocalDate 전용
		 System.out.println(lengthOfYears);
		 
		 // 날짜와 날짜사이의 차이 구하기
		 LocalDate startDate = LocalDate.of(2022, 1, 1);
		 LocalDate endDate = LocalDate.of(2023, 5, 20);
		 Period between = Period.between(startDate, endDate);
		 System.out.println(between.getYears() + "," 
				 			+ between.getMonths() + ","
				 			+ between.getDays());
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
	}

}
