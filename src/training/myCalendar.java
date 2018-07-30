package training;
import java.util.Calendar;
import java.util.Locale;

public class myCalendar {
	
	
	
	public void lesson1(int month) {
		
		Calendar currentDate = Calendar.getInstance();
		currentDate.set(Calendar.DAY_OF_MONTH, 1);
		int numOfDays = currentDate.getActualMaximum(currentDate.DAY_OF_MONTH);
		int currentDayOfWeek = currentDate.get(currentDate.DAY_OF_WEEK);//1-SUNDAY,2-MONDAY,3-TUESDAY...
		int day = 1;
		String space = "   ";
		
		System.out.println(" " + currentDate.get(currentDate.YEAR));
		System.out.println(" " + currentDate.getDisplayName(currentDate.MONTH, Calendar.LONG, Locale.getDefault()));
		System.out.println(" SUN MON TUE WED THU FRI SAT");
		for(int i=0; i<numOfDays+currentDayOfWeek; i++) {		
			if(i<currentDayOfWeek) {
				System.out.print("    ");
			} else {
				if(day>=10) {space="  ";}
				System.out.print(space + day);
				day++;
			}			
			if(i%7==0) {System.out.println("");}		
		}
	}
	
	
	public void lesson2(int year, int month) {
		
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, year);
		date.set(Calendar.MONTH, month);
		date.set(Calendar.DAY_OF_MONTH, 1);
		int numOfDays = date.getActualMaximum(date.DAY_OF_MONTH);
		int currentDayOfWeek = date.get(date.DAY_OF_WEEK);//1-SUNDAY,2-MONDAY,3-TUESDAY...
		int day = 1;
		String space = "   ";
		
		System.out.println(" " + date.get(date.YEAR));
		System.out.println(" " + date.getDisplayName(date.MONTH, Calendar.LONG, Locale.getDefault()));
		System.out.println(" SUN MON TUE WED THU FRI SAT");
		for(int i=0; i<numOfDays+currentDayOfWeek; i++) {		
			if(i<currentDayOfWeek) {
				System.out.print("    ");
			} else {
				if(day>=10) {space="  ";}
				System.out.print(space + day);
				day++;
			}			
			if(i%7==0) {System.out.println("");}		
		}
	
		
	}
	
	public void lesson3(int year) {
		
		int month = 0;
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, year);
		date.set(Calendar.MONTH, month);
		date.set(Calendar.DAY_OF_MONTH, 1);
		int numOfDays = date.getActualMaximum(date.DAY_OF_MONTH);
		int currentDayOfWeek = date.get(date.DAY_OF_WEEK);//1-SUNDAY,2-MONDAY,3-TUESDAY...
		int day = 1;
		String space = "   ";
		
		System.out.println(" " + date.get(date.YEAR));

		
		
		while(month<12) {
			System.out.println();System.out.println();
			
			date.set(Calendar.MONTH, month);
			numOfDays = date.getActualMaximum(date.DAY_OF_MONTH);
			currentDayOfWeek = date.get(date.DAY_OF_WEEK);
			space = "   ";
					
			System.out.println(" " + date.getDisplayName(date.MONTH, Calendar.LONG, Locale.getDefault()));
			System.out.println(" SUN MON TUE WED THU FRI SAT");
			for(int i=0; i<numOfDays+currentDayOfWeek; i++) {		
				if(i<currentDayOfWeek) {
					System.out.print("    ");
				} else {
					if(day>=10) {space="  ";}
					System.out.print(space + day);
					day++;
				}			
				if(i%7==0) {System.out.println("");}		
			}
			
			day=1;
			month++;
		}
	}
	
	
	public void lesson4(int year) {
		
		int month = 0;
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, year);
		date.set(Calendar.MONTH, month);
		date.set(Calendar.DAY_OF_MONTH, 1);
		int numOfDays = date.getActualMaximum(date.DAY_OF_MONTH);
		int currentDayOfWeek = date.get(date.DAY_OF_WEEK);//1-SUNDAY,2-MONDAY,3-TUESDAY...
		int day = 1;
		String space = "   ";
		
		System.out.print(" " + date.get(date.YEAR) + "                        ");
		System.out.print(" " + date.get(date.YEAR) + "                        ");
		System.out.println(" " + date.get(date.YEAR));

		int yearTemp = year;
		
		while(month<12) {
			System.out.println();System.out.println();
			
			while(yearTemp<year+2) {
				date.set(Calendar.MONTH, month);
				date.set(Calendar.YEAR, yearTemp);
				numOfDays = date.getActualMaximum(date.DAY_OF_MONTH);
				currentDayOfWeek = date.get(date.DAY_OF_WEEK);
				space = "   ";
						
				System.out.println(" " + date.getDisplayName(date.MONTH, Calendar.LONG, Locale.getDefault()));
				System.out.println(" SUN MON TUE WED THU FRI SAT");
				for(int i=0; i<numOfDays+currentDayOfWeek; i++) {		
					if(i<currentDayOfWeek) {
						System.out.print("    ");
					} else {
						if(day>=10) {space="  ";}
						System.out.print(space + day);
						day++;
					}			
					if(i%7==0) {System.out.println("");}		
				}
				yearTemp++;
			}
			
			yearTemp = year;
			day = 1;
			month++;
		}
	}
	
	
	
	
	
		
	public static void main(String[] args) {
		
		
		
	}
	
}
