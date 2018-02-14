/**
 * 
 */

/**
 * @author User
 *finally blocks always execute
 *throws block, u can inform java this particlar method may raise exception like a warning
 */
public class TestinExceptions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String name = args[0];
		System.out.println("your name is " + args[0]);
		System.out.println("Name printed...");
		if(!(name.startswith("M"))) {
				throw now Exception("Name should start with M");
		
		System.out.println("Name printed...");
		}
		}
		catch (ArrayIndexOutOfBoundException) { //the catch statemnt after try block will be ignore if the exception is handle
			System.out.println
			("Please provide your name as command line parameter,eg:" + "JavaTestingExceptions <your name>");
		}
		
		catch (Exception ex) { //the catch statemnt after try block will be ignore if the exception is handle
			System.out.println(ex.getMessage());
		}
	System.out.println("I am done...");
	
	
	}
}
