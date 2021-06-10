package puzzel;

import java.util.ArrayList;

public class PuzzleJava {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(7);
        numbers.add(9);
        numbers.add(8);
        numbers.add(13);
        numbers.add(25);
        numbers.add(32);
        System.out.println(g10(numbers));
        
    
	}
	
	public static ArrayList<Integer> g10(ArrayList<Integer> a) {
		ArrayList<Integer> k= new ArrayList<Integer>();
		for(int i=0;i<a.size();i++) {
			if(a.get(i)>10) {
				k.add(a.get(i));
				
			}
			
			
		}
		
		return k;
		
	}

}
