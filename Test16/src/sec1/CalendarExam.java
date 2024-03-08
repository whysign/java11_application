package sec1;

import java.util.Calendar;

public class CalendarExam {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();	//Date today = new Date();
		int year = today.get(Calendar.YEAR);
		int month =today.get(Calendar.MONTH) + 1; // 0~11
		int day = today.get(Calendar.DATE);
		
		int doy =today.get(Calendar.DAY_OF_YEAR);
		int dom=today.get(Calendar.DAY_OF_MONTH);
		int dow =today.get(Calendar.DAY_OF_WEEK);
		
		int hour12 =today.get(Calendar.HOUR); //12 시간제
		int hour24 =today.get(Calendar.HOUR_OF_DAY); //24시간제
		int minute =today.get(Calendar.MINUTE); // 분]
		int second =today.get(Calendar.SECOND);
		int ampm =today.get(Calendar.AM_PM);
		
		int timeZone = today.get(Calendar.ZONE_OFFSET); //밀리초 => 시간(/1000/60/60)
		int lastDate = today.getActualMaximum(Calendar.DATE); //getActualMaximum 마지막날
		int firstDate = today.getActualMinimum(Calendar.DATE); //getActualMinimum 첫번쨰 날
		
		
		System.out.println("현재년도 : " +year);
		System.out.println("현재월 : "+month);
		System.out.println("현재 일 : "+day);
		
		System.out.println("오늘은"+year+"년의"+doy+"일 쨰 날");
		System.out.println("오늘은"+month+"월의"+dom+"번쨰 날");
		System.out.println("오늘은 이번주의 :"+dow+"번재 날");
		
		String[] wk = {"","일요일","월요일","화요일","수요일","목요일","금요일","토요일"} ;
		System.out.println("오늘은"+wk[dow]+"입니다.");
		
		System.out.println("현재시간(24시간제) : "+hour24+":"+minute+":"+second);
		System.out.println("현재시간(12시간제) - ");
		if(ampm == 0) {
			System.out.println("오전"+hour12+":"+minute+":"+second);
		}else {
			System.out.println("오후"+hour12+":"+minute+":"+second);
		}
		System.out.println("타임존  :"+(timeZone/1000/60/60));
		System.out.println("이달의 마지막날 :"+lastDate);
		System.out.println("이달의 첫번째날 :"+firstDate);
	}	
}
