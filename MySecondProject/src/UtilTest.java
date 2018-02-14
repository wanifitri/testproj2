import java.time.LocalDate;
import java.util.Date;
import java.util.Calendar;




/**

 */

/**
 * @author User
 *local date doesnt support time
 */
public class UtilTest{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		  
			Date dt = new Date();
			//String currentDate = String.valueOf(dt.getDate());
			//String currentDate = String.valueOf(dt.getDay());
			//System.out.println("Current date is : " + dt);
			//System.out.println("Current date is : " +  currentDate);
			//System.out.println("Current date is : " +  dt.getTime());
			
			
		
			/**
			Calendar cal = Calendar.getInstance();
			String currentCalDate = cal.get(Calendar.DATE)+ "/"+ (cal.get(Calendar.MONTH)+1) + "/" + (cal.get(Calendar.YEAR)) + ":" + ( cal.get(Calendar.HOUR)) +( cal.get(Calendar.MINUTE) )+ ":" + (cal.get(Calendar.SECOND)) + "" + cal.getTimeZone().getDisplayName();
			System.out.println("Current date is : " +  currentCalDate);
			
			
			
			
			//print the local date not support time
			//LocalDate localDate = LocalDate.now();
			//System.out.println("Current Date before is:" + localDate);
			
		
			//print formatted date
			//DateTimeFormatter formatter = DateTimeFormatter.ofPattern(("dd/mm/yyyy hh"));
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(("yyyy MM dd"));
			
			String text = localDate.format(formatter);
		     //System.out.println("Your formatted date is: " + text);
			*/
		    //print the Parse command line given date
			
			int year = Integer.parseInt(args [0]);
			int month  = Integer.parseInt(args [1]);
			int date  = Integer.parseInt(args [2]);
			int hourOfDay  = Integer.parseInt(args [3]);
			int minute  = Integer.parseInt(args [4]);
			int second  = Integer.parseInt(args [5]);
			
			//cal.set(year, (month-1), date, hourOfDay, minute,second);
			
			//Calendar cal = new Calendar();
			String cal = cal.set(year, (month-1), date, hourOfDay, minute,second);
			
			System.out.println("Your parsed date is: " + cal.set);
			
			
			
			
	}	
	

}
