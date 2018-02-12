/**
 * 
 */

/**
 * @author User
 *
 */
public class TestTypedConversion {

	
	public static void main(String[] args) {
		
		//accept a double from a command line
		double salary = Double.parseDouble( args[0]);
		System.out.println(salary);
		
		String salaryStr = String.valueOf(salary);
		System.out.println(salaryStr);
		
		
		/**
		Double salaryDb1 = new Double(args[0]);
		if(salaryDb1.isNaN())} {
				System.out.println("salary is not valid" + salary(Db1));
		}
		else
		System.out.println("")
		*/

	}

}
