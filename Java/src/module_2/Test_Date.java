package module_2;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Test_Date {

	public static void main(String[] args) throws Exception {
//		Display current date and time
		Date date = new Date();
		System.out.println("Current date and Time: " + date);
//		Using DateTimeFormatter and LocalDateTime
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm a	");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		System.out.println("---------------------------------------------------");

//		Add time to date
		Date d1 = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(d1);
		System.out.println("Today is: " + date.toString());
		c.add(Calendar.MONTH, 1);
		System.out.println("1 Month from now it will be: " + c.getTime().toString());
		c.add(Calendar.DAY_OF_MONTH, -5);
		System.out.println("5 days before it was: " + c.getTime().toString());
		c.add(Calendar.HOUR, 50);
		System.out.println("5 hours from that it will be: " + c.getTime().toString());
		System.out.println("---------------------------------------------------");

//		Display time in different country's format
		Locale england = new Locale("en", "ch");
		Locale spanish = new Locale("es", "ch");
		DateFormat de = DateFormat.getDateInstance(DateFormat.FULL, england);
		System.out.println("England Format: " + de.format(date));
		DateFormat de2 = DateFormat.getDateInstance(DateFormat.FULL, spanish);
		System.out.println("Spanish Format: " + de2.format(date));
		System.out.println("---------------------------------------------------");

//		 Display date in different formats
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/mm/dd, E");
		LocalDateTime now1 = LocalDateTime.now();
		System.out.println(dtf2.format(now1));

	}

}
