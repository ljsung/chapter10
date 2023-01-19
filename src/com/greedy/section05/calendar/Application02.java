package com.gready.section05.calendar;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Application02 {

	public static void main(String[] args) {
		
		/* Calendar 클래스 사용*/
		
		/* Calendar 클래스를 이용한 인스턴스 생성 방법
		 * 1. getInstance() static 메소드를 이용해서 인스턴스를 반환하는 방법
		 * 2. 후손 클래스인 GragorianCalender 클래스를 이용해서 인스턴스를 생성하는 방법*/
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		Calendar gregorinaCalendar = new GregorianCalendar();
		System.out.println(gregorinaCalendar);
		
		int year = 2014;
		int month = 8;
		int dayOfMonth = 18;
		int hour = 16;
		int min = 42;
		int second = 0;
		
		Calendar birthDay = new GregorianCalendar(year, month, dayOfMonth, hour, min, second);
		System.out.println(birthDay);
		
		java.util.Date date = new java.util.Date(birthDay.getTimeInMillis());
		System.out.println(date);
		
		Date date2 = new Date(new GregorianCalendar(year, month, dayOfMonth, hour, min, second).getTimeInMillis());
		System.out.println(date2);
		
		int birthYear = birthDay.get(1);
		int birthMonth = birthDay.get(2);
		int birthDayOfMonth = birthDay.get(5);
		
		
		System.out.println(birthYear);
		System.out.println(birthMonth);
		System.out.println(birthDayOfMonth);
		
		System.out.println(calendar.YEAR);
		System.out.println(calendar.MONTH);
		System.out.println(calendar.DATE);
		
		System.out.println("year :" +  birthDay.get(Calendar.YEAR));
		System.out.println("month :" +  birthDay.get(Calendar.MONTH));
		System.out.println("day :" +  birthDay.get(Calendar.DATE));
		
		System.out.println("dayOfweek :" + birthDay.get(calendar.DAY_OF_WEEK));
		
		String day ="";
		switch(birthDay.get(calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY:
			day = "일요일"; 
			break;
		case Calendar.MONDAY:
			day = "월요일";
			break;
		case Calendar.TUESDAY:
			day = "화요일";
			break;
		case Calendar.WEDNESDAY:
			day = "수요일";
			break;
		case Calendar.THURSDAY:
			day = "목요일";
			break;
		case Calendar.FRIDAY:
			day = "금요일";
			break;
		case Calendar.SATURDAY:
			day = "토요일";
			break;
		
		}
		System.out.println("요일 : " + day);
		
		System.out.println("amPm :" + birthDay.get(calendar.AM_PM));
		System.out.println(birthDay.get(Calendar.AM_PM) == calendar.AM? "오전" : "오후");
		
		System.out.println("hourOfDay :" + birthDay.get(calendar.HOUR_OF_DAY));
		System.out.println("hour :" + birthDay.get(calendar.HOUR));
		
		System.out.println("min :" + birthDay.get(calendar.MINUTE));
		System.out.println("second :" + birthDay.get(calendar.SECOND));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String result =sdf.format(new Date(birthDay.getTimeInMillis()));
		System.out.println(result);
		
	}

}
