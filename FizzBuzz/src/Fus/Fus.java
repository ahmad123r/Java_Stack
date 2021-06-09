package Fus;
public class Fus {
	
	public static String Fizz(int A) {
	if(A%3 == 0 && A%5 == 0) {
				return("FizzBuzz");
				
			}
		if(A%3 == 0) {
			return("Fizz");}
			 if(A%5 == 0) {
				return("Buzz");
				
			 }
			 return Integer.toString(A);
			
			 
		
		
	}

	public static void main(String[] args) {
		System.out.println(Fizz(17));

	}

}
