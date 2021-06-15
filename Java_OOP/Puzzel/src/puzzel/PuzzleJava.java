package puzzel;

import java.util.ArrayList;
import java.lang.Object;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {

	public static void main(String[] args) {
		int sum=0;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<String> names = new ArrayList<String>();
        numbers.add(3);numbers.add(5);numbers.add(1);numbers.add(2);numbers.add(7);numbers.add(9);
        numbers.add(8);
        numbers.add(13);
        numbers.add(25);
        names.add("Nancy");names.add("Jinichi");names.add("Fujibayashi");names.add("Momochi");     numbers.add(32);
        names.add(" Ishikawa");
        ArrayList<Character> alphabets = new ArrayList<Character>();

        alphabets.add('a');alphabets.add('b');alphabets.add('c');alphabets.add('d');alphabets.add('e');alphabets.add('f');alphabets.add('g');
        alphabets.add('h');alphabets.add('i');alphabets.add('j');alphabets.add('k');alphabets.add('l');alphabets.add('m');alphabets.add('n');alphabets.add('o');
        alphabets.add('p');alphabets.add('q');alphabets.add('r');alphabets.add('s');alphabets.add('t');alphabets.add('u');alphabets.add('v');alphabets.add('w');alphabets.add('x');
        alphabets.add('y');alphabets.add('z');

    for(int i=0;i<numbers.size();i++) {
    	sum+=numbers.get(i);
    }
     System.out.println(sum);
        System.out.println(g10(numbers));
        System.out.println(g11(names));
        shuffle(names);
        suffle1(alphabets);
        System.out.println(rand());
        System.out.println(rands());
        System.out.println(rands1());
        
    
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
	
	public static ArrayList<String> g11(ArrayList<String> a) {
		ArrayList<String> mm= new ArrayList<String>();
		for(int i=0;i<a.size();i++) {
			String k=a.get(i);
			int r= k.length();
			if(r >5) {
				mm.add(k);
				
			}
			
		}
		
		
		return mm;
		
	}
	public static void shuffle(ArrayList<String> a) {
		Collections.shuffle(a);
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
			
		}
		
		
	}
	
	public static void suffle1(ArrayList<Character> a) {
		Collections.shuffle(a);
		 
		if(a.get(0)=='a'||a.get(0)=='e'||a.get(0)=='i'||a.get(0)=='o'||a.get(0)=='u') {
			System.out.println("Sorry The First Number Is Vowl");}
			else
			{
				System.out.println(a.get(0));
			}
		
		
	}
	public static ArrayList<Integer> rand() {
		ArrayList<Integer> a=new ArrayList<Integer>();
		int max=100;
		int min=55,k=0;
		for(int i=0;i<10;i++) {
			k = (int) Math.floor(Math.random()*(max-min+1)+min);
			a.add(k);
		}
		Collections.sort(a);
		System.out.println("The smallest number is "+a.get(0)+"  The Greatest Number is "+a.get(a.size()-1));
		return a;
		
	}
	public static String rands() {
		String mm = "";
		int max=90;
		int min=65;
		char k=0;
		for(int i=0;i<5;i++) {
			k = (char) Math.floor(Math.random()*(max-min+1)+min);
			mm+=k;
		}
		
		return mm;
		
	}
	public static ArrayList<String> rands1() {
		ArrayList<String> a=new ArrayList<String>();
		
		String mm = "";
		int max=90;
		int min=65;
		char k=0;
		for(int j=0;j<10;j++) {
		for(int i=0;i<5;i++) {
			k = (char) Math.floor(Math.random()*(max-min+1)+min);
			mm+=k;
		}
		a.add(mm);		mm="";
	
		}
		
		return a;
		
	}

}
