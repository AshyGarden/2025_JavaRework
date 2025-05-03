package etc.api.io.util.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.05.01
 */
public class DateEx {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		System.out.println("------------------------------");
		
		//現在の日付情報を取得(年、月、日)
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		//現在の時間情報を得る(時、分、秒)
		LocalTime nowTime = LocalTime.now();
		System.out.println(nowTime);
		
		//現在の日付と時間情報を得る(年、月、日、時、分、秒)
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);

		//特定の日付と時間情報を取得する
		LocalDateTime beginDate = LocalDateTime.of(2022, 7, 1, 9, 0, 0);
		System.out.println("beginDate: " + beginDate);
		
		//年度抽出
		int year = localDateTime.getYear();
		System.out.println("year: " + year);
				
		int monthValue = localDateTime.getMonthValue();
		System.out.println("monthValue: " + monthValue);
				
		Month month = localDateTime.getMonth();
		System.out.println("month: " + month);
		
		System.out.println("------------------------------");
		LocalDateTime returnDataTime = localDateTime.plusDays(3);
		System.out.println(returnDataTime);
		
		//今から1年2ヶ月7日後
		LocalDateTime d1 = localDateTime.plusYears(1).plusMonths(2).plusDays(7);
		System.out.println(d1);
		
		//間日計算
		LocalDate b = LocalDate.of(2020, 12, 30);
		LocalDate f = LocalDate.of(2022, 9, 14);
		
		long between = ChronoUnit.DAYS.between(b, f);
		System.out.println(between);
		
		//
		System.out.println("------------------------------");
		System.out.println(localDateTime);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年 MM月 dd日 E曜日 a hh時 mm分ss秒");	
		System.out.println(localDateTime.format(dtf));
		
		
		
	}
}
