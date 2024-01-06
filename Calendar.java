public class Calendar {	
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	public static void main(String args[]) {
        int inYear = Integer.parseInt(args[0]);
	    int debugDaysCounter = 0; 
		int sun1 = 0;
	 	while (year < inYear) {
            advance();
        }
        year = inYear;
        int count = inYear + 1;
        while (year < count) {
        System.out.print(dayOfMonth + "/" + month + "/" + year);
			if (dayOfWeek == 1) {
				System.out.print(" Sunday");
			}
			System.out.println();
	 		advance();
        }
		System.out.println();
		System.out.println("During the 20th century, " + sun1 + " Sundays fell on the first day of the month");
	 	//// Write the necessary ending code here
	 }
	 private static void advance() {
		if (dayOfMonth < nDaysInMonth) {
			dayOfMonth++;
		} else {
			dayOfMonth = 1;
			month++;
			nDaysInMonth = nDaysInMonth(month, year);
		}
		if (month > 12) {
			month = 1;
			year++;
		}
		dayOfWeek++;
		if (dayOfWeek > 7) {
			dayOfWeek = 1;
		}
	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
	    if (year % 400 == 0) {
			return true;
		} else if (year % 100 == 0) {
			return false;
		} else if (year % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}
	 
	private static int nDaysInMonth(int month, int year) {
		int feb = 28;
		if (isLeapYear(year) == true) {
			feb = 29;
		}
		switch (month) {
			case 2:
			return feb;
			case 4:
			return 30;
			case 6:
			return 30;
			case 9:
			return 30;
			case 11:
			return 30;
			default:
			return 31;
		}
	}
}
