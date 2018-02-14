import java.util.Calendar;

/**
 * 
 */

/**
 * @author User
 *
 */
public class ParseDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aa cal = new Aa();

		int year = Integer.parseInt(args [0]);
		int month  = Integer.parseInt(args [1]);
		int date  = Integer.parseInt(args [2]);
		int hourOfDay  = Integer.parseInt(args [3]);
		int minute  = Integer.parseInt(args [4]);
		int second  = Integer.parseInt(args [5]);
		
		//cal.set(year, (month-1), date, hourOfDay, minute,second);
		
		
		cal.set(year, (month-1), date, hourOfDay, minute,second);
	
		
		System.out.println("Your parsed date is: " + cal.set);
	}

}
