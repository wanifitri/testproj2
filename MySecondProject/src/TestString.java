/**
 * 
 */

/**
 * @author User
 *
 */
public class TestString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 1;
		int second = 2;
		int third = 3;
		String four = "c"; //go to pool string
		String fifth = "c"; ////go to pool string
		String sixth = new String ("c"); //we hv initialize new string, its diff memory address ////go to pool string
		
		/* if (four == fifth)
			System.out.println("forth and fifth is same :" + four);
				
		else 
			System.out.println("forth and fifth are not the same");
				
		if (four== sixth)
			System.out.println("forth and six is same" + four);
				
		else
			System.out.println("forth and sixth is not the same");
		
		System.out.println("Now forth is:" + four);
		
		four = first + second + third + four;
		System.out.println("Now fourth is " + four);
		
		//four= first + four; //four.concat(String.valueOf(first)); another way of writing it,concatenate or first.concat(String.valueOf(four)) =
		//System
		
		//System.out.println(1+(2+"c"));gabung string
		
		 */
		
		/* String sms = "Selamat Datang ke Malaysia !!";
		System.out.println("Sms size is" + sms.length());
		System.out.println("Text at 10th position/9h index" + sms.charAt(9)); //indices at 10th position
		System.out.println("Index of the text !" + sms.indexOf("!"));
		System.out.println("Sms size is," + sms.substring(0,10));
		System.out.println("lower" + sms.toUpperCase());
		System.out.println("lower" + sms.toLowerCase());
		*/
		
		String country = "Malaysia";
		
		if (country.equals(args[0]));{
			//if (country.equalsIgnoreCase(args[0]));
			{
			System.out.println("Country is Malaysia");
			}
	
	else 
	{
	System.out.println("Country is not malaysia but" + args [0]);
	
	
	String userCountry = args [0].toLowerCase();
	if (userCountry.startsWith("m"));{
	System.out.println("Country start with m");
	}
	
	if(userCountry.endsWith("A"));{
	System.out.println("country is end with");
	
	if(userCountry.contains("al"));{
		System.out.println("country" + userCountry + "has \"al\ "");
	}
	
		

	}
	}

}
