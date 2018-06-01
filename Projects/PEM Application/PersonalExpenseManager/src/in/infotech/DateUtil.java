package in.infotech;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	public static Date stringToDate(String dateAsString ){
		SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
		try {
			return df.parse(dateAsString)
;
		} catch (ParseException e) {
	
			e.printStackTrace();
			return null;
		}
	}

	public static String dateToString(Date date ){
		SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
			return df.format(date);
		
	}
}
