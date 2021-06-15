package Phone;

public class Calculator {
	public int OperandOne;
	public char  Operation;
	public int OperandTwo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getresult();

	}
	public static  double setOperandOne(double x) {
		return x;
	}
	public static char setOperation(char x) {
		return x;
	}
	public static  double setOperandTwo(double x) {
		return x;
	} 
	public static double performOperation() {
		double res = 0;
		double x =setOperandOne(10.5);
		double y =setOperandTwo(5.2);
		char m=setOperation( '+');
		if(m=='+') {
			res=x+y;
		
		}
		else if(m=='-') {
			res=x-y;
		}
		else if(m=='/' && y>0) {
			res= x/y;	
		}
		
		else {
			res=y*x;
		}
		return res;
	}
	public static void getresult() {
		System.out.println(performOperation());
	}

}
