package in.infotech;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	public static final String [] MONTH ={"January","February","March","April","May","June","July","August","September","Octomber","November","December"};
	/**
	 * This method convert String-Date into Date Object.
	 * @param dateAsString
	 * @return
	 */
	public static Date stringToDate(String dateAsString ){
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			return df.parse(dateAsString)
;
		} catch (ParseException e) {
	
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * This method convert Date Object to String Date.
	 * @param stringAsDate
	 * @return
	 */
	public static String dateToString(Date date ){
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			return df.format(date);
		
	}
	/**
	 * The method return year and month form given date
	 * @param date
	 * @return year and month
	 */
	public static String  getYearAndMonth(Date date){
		SimpleDateFormat df = new SimpleDateFormat("yyyy,MM");
		return df.format(date);
		
	}
	/**
	 * The method return year from given Date.
	 * @param date
	 * @return year
	 */
	public static Integer  getYear(Date date){
		SimpleDateFormat df = new SimpleDateFormat("yyyy");
		return new Integer(df.format(date));
		
	}
	/**
	 * The method returns Month Name for given month Number.
	 * @param monthNo
	 * @return 
	 */
	public static String getMonthName(Integer monthNo){
		return MONTH[monthNo-1];
	}
}
