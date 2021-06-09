package Basic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Timer;



public class base {
	public static void main(String[] args) {

		printsum();
		
		}
	public static ArrayList<Object> print25() {
		ArrayList<Object> list = new ArrayList<Object>();
		for(int i=0;i<255;i++) {
			list.add(i);
		}
		return list;
	}
	public static ArrayList<Object> print25odd() {
		ArrayList<Object> list = new ArrayList<Object>();
		for(int i=1;i<255;i+=2) {
			list.add(i);
		}
		return list;
	}
	public static void printsum() {
		
		int k= 0;
		for (int i=0;i<255;i++) {
			k+=i;
			System.out.println("this Number :"+i+"The sum is:"+k);
			

		}
		
	}
	
	
	public static Integer Max(int[] a) {
	int	max=a[0];
	for( int i=0;i<a.length;i++) {
	if(max<a[i]) {
		max=a[i];
	}}
		
		return max;
		
	}
	
	public static Float getavg(int[] a) {
		int avg = 0;
		for(int i=0;i<a.length;i++) {
			avg+=a[i];
			
		}
		float k=(avg/a.length);
		return k;
	}
	 public static ArrayList<Object> odd() {
		 Object args;
		 ArrayList<Object> list = new ArrayList<Object>();
		 for (int i = 1;i<255;i+=2) {
			 list.add(i);
			 
		 }
		 
		 
		 return list;
	 }
	 
	 public static Integer great(int[] a) {
		 int y= 3,k=0;
		 for( int i=0;i<a.length;i++) {
			 if(y<a[i]) {
				 k+=1;
			 }
		 }
		 return k;
		 
	 }
	 
	 public static String mul(int[] a) {
		 int[] k = new int[a.length];
		 
		 for( int i=0;i<a.length;i++) {
			 
				 k[i]=a[i]*a[i];
			 
		 }
		 String f = Arrays.toString(k);
		 return f;
		 
	 }
	 
	 public static String neg(int[] a) {
		 
		 
		 for( int i=0;i<a.length;i++) {
			 if(a[i]<0)
				 a[i]=0;
			 
				
			 
		 }
		 String f = Arrays.toString(a);
		 return f;
		 
	 }
	 
	 
	 public static String mma(int[] a) {
			int avg = 0;
			int max=a[0];
			int min=a[0];
			float[] r=new float[3];
			for(int i=0;i<a.length;i++) {
				avg+=a[i];
				if(a[i]<min)
					min=a[i];
				if(a[i]>max)
					max=a[i];
				
			}
			r[0]=min;
			r[1]=max;
			float k=(avg/a.length);
			r[2]=k;
			String f = Arrays.toString(r);
			return f;
		}
	 
public static String shift(int[] a) {
		 
		 
		 for( int i=0;i<a.length;i++) {
			 if(i==a.length-1)
			 {
				 a[i]=0;
			 }
			 else
				 a[i]=a[i+1];
			 
				
			 
		 }
		 String f = Arrays.toString(a);
		 return f;
		 
	 }
	 
	 
	 
	 
	 
	 

}
