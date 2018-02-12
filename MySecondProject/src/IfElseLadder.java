class IfElseLadder {
   public static void main(String[] args) {   

     //int number = 0;
	 int number =Integer.parseInt(args[0]);
   
	 
	 System.out.println("Print  number ");
	 
	 if (number > 0) { 
         System.out.println("Number is positive.");
         //System.out.println("Number is positive.");
      }
      else if (number < 0) {
         System.out.println("Number is negative.");
         //System.out.println("Number is negative.");
      }
      else {
         System.out.println("Number is 0.");
         //System.out.println("Number is 0.");
      } 
   }
}