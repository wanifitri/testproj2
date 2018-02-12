/**
 * 
 */

/**
 * @author User
 *
 */
public class ContinueString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "This is my text";
		//text = text.trim();
		String oldtext = args [0];
		String replace = args [1]; //what text need to be replace
		
		
		System.out.println("Original text" + text);
		System.out.println("Replace text" + text.replace(oldtext,replace));
		System.out.println("Replaced text" + text.trim().replace(oldtext, replace).toUpperCase());
		

	}

}
