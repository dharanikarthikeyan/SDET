package week4_workouts;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import org.junit.Test;

public class GirigorialCalendar {
	
	@Test
	public void test_1()
	
	{
		 Howmanydays_overtheyear("2019-01-09");
	}

	public int Howmanydays_overtheyear(String str ) 
	{
		
		int Daystarts = 0,Monthstarts = 0,totalDays = 0;
		
		
		String date = str.substring(8,str.length());
		
		int date_in_int = Integer.parseInt(date);
		
		String month = str.substring(5,7);
		int month_int = Integer.parseInt(month);
		
		String year = str.substring(0,4);
		int year_int = Integer.parseInt(year);
		
		while(Monthstarts<Daystarts)
		{
			//YearMonth is an method support to find no of days in 
			//the month when we provide year and month details as input		
			YearMonth YearMonthobj= YearMonth.of(year_int, Monthstarts);
			int noOfDaysPreviousMonth=YearMonthobj.lengthOfMonth();
			Monthstarts=Monthstarts+noOfDaysPreviousMonth;
			Monthstarts++;
		}
		
		 
		totalDays=date_in_int+Monthstarts;
		System.out.println(totalDays);
		// TODO Auto-generated method stub
		return year_int;
			
		
	}



	//Below mtd supported by Java8 -  mentioned particular date format to alow the inputdata
	public boolean checkvaliddateformat1(String s) {
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	     try {
	         LocalDate.parse(s, formatter);
	         return true;
	     } catch (DateTimeParseException e) {
	         return false; 
	     }

	
	
}
}
