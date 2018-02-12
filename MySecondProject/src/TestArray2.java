import java.util.Arrays;

/** 
 * 
 */

/**
 * @author wani
 * This class test
 */
public class TestArray2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course_subjects [] [] = new String [2] [2];
			course_subjects [0] [0] = "Cs-Maths";
			course_subjects [0] [1] = "Cs-English";
			course_subjects [1] [0] = "Ac-Accounting";
			course_subjects [1] [1] = "Ac-Bahasa";
			
		String course_subjects [] [] = {{"Cs-Maths"," Cs-English"} , {"Ac-Accounting","Ac-Bahasa"}};	
		
		
		
		for(int i = 0;i < course_subjects.length; i++) {
			for(int j = 0;j < course_subjects[i].length; j++) {
				
				System.out.println( "Course of" + i + "subject of" + j + "is" + course_subjects [i] [j]);
			}
		}
	}
}


