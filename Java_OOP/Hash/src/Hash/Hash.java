package Hash;

import java.util.HashMap;
import java.util.Set;

public class Hash {

	public static void main(String[] args) {
		HashMap<String,String> trackList= new HashMap<String, String >();
		trackList.put("Alin_walker", "Dimonid_heart");
		trackList.put("Sia", "Chelindar");
		trackList.put("Eminm", "iam not afriad");
		trackList.put("Adele", "on_the chevments");
		String name= trackList.get("Alin_walker");
		System.out.println(name);
		 Set<String> keys = trackList.keySet();
	        for(String key : keys) {
	          
	            String mm= String.format("The Track is :%s and the song is : %s ",trackList.get(key),key);
	            System.out.println(mm);
	               
	        }
		
	}

}
