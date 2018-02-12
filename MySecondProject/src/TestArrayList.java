import java.util.ArrayList;

/**
 * 
 */

/**
 * @author User
 *
 */
public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(10);

		for (String str : args) {
			al.add(str);
		}
		System.out.println("Arraylist is empty" + al.isEmpty());
		//al.addAll(new Integer(10));
		//al.add(new Boolean)
		
		System.out.println(al);

	}

}
