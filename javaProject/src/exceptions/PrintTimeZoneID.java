package exceptions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class PrintTimeZoneID {

	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs) {
			TimeZone timeZone = TimeZone.getTimeZone(id);
			Calendar now = Calendar.getInstance(timeZone);
			System.out.println(id);
		
		
		}
	}

}
