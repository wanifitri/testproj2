/**
 * 
 */

/**
 * @author wani
 * 

 * This class test string builder class
 * build a string builder
 * print 1st three character
 * print three last character
 * extract studying and print
 * insert <space> and <yourname> after "am"
 * delete the word "am"
 */
 
public class TestStringBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StringBuilder sb = new StringBuilder("I am studying java"); //initialize the stringbuilder class with string passed via command line
		String constant = "Studying";
		
		
		
		System.out.println("Given string: " + sb + " with length" + sb.length());
		System.out.println("first 3 characters " + sb.substring(0,3)); //print 1st three character
		System.out.println("last 3 characters " + sb.substring(sb.length()-3)); //print last three character
		
	
		
		int startOfConstant = sb.indexOf(constant);
		int endOfConstant = startOfConstant + constant.length();
		System.out.println("print studying: " + sb.substring(startOfConstant, endOfConstant)); //print studying
		
		/**
		sb.insert(sb.indexOf("am")+ 2), "wani" );//insert <name> after "am"
		System.out.println("After insert" + sb);
		sb.delete(sb.indexOf("am"), sb.indexOf("am") + 2);
		System.out.println("After delete" + sb);
		
		StringBuilder sb2 = new StringBuilder(args [0]);
		System.out.println( sb == sb2);
		StringBuilder sb3 = (sb.insert((sb.indexOf("am") + 2) , "wani");
		System.out.println( sb == sb3);
		
			
			sb = null;
			sb2 = null;
			sb3 = null;//u define each object after use it, declare as null, so that jvm know that it is done and garbage collector(janitor) can clean it
			
			*/
}
	
}


				

