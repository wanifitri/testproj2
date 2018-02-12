/**
 * 
 */

/**
 * @author User
 *
 */
/*
class ForLoop {

	/**
	 * @param args
	 /**
	public static void main(String[] args) {
		String myVar = "Nothing"; //nothing is immutable cannot change, die create obj noting sekali je // 
		   for (int i = 1 ; i <= 10; ++i) {
		      System.out.println("My var at Line Line " + i + "with value:" + myVar); //11 object is created
		      myVar += "-" + i;

	}

}
}

*/

class ForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String myVar = "Nothing"; //nothing is immutable cannot change, die create obj noting sekali je // 
		
		StringBuilder sb = new StringBuilder (10);
		sb.append("Nothing"); //assign sb with nothing using fnction append 
		System.out.println("sb : " + sb);
		
		for (int i = 1 ; i <= 10; ++i) {
		      System.out.println("sb at line" + i + "with value:" + sb); //11 object is created
		      sb.append( "-" + i;)

	}

}
}



