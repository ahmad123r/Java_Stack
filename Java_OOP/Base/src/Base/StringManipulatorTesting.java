package Base;
import java.lang.StackOverflowError;

public class StringManipulatorTesting {
	public static void main(String[] args) {
		StringManipulator km = new StringManipulator();
		
		String s =km.trimAndConcat("    Hello     ","     World    ");
		System.out.println(s);
		char letter = 'o';
	
		
		Integer a = km.getIndexOrNull("Coding", letter);
		Integer b = km.getIndexOrNull("Hello World", letter);
		Integer c = km.getIndexOrNull("Hi", letter);
		System.out.println(a); // 1
		System.out.println(b); // 4
		System.out.println(c);
		
		
		String word = "Hello";
		String subString = "llo";
		String notSubString = "world";
		Integer a1 = km.getIndexOrNull(word, subString);
		Integer b2 = km.getIndexOrNull(word, notSubString);
		System.out.println(a1);
		System.out.println(b2);
		
		String wo = km.concatSubstring("Hello", 1, 2, "world");
		System.out.println(wo);
		
		
		
		
	}

}
