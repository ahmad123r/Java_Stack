package Base;
public class StringManipulator {
	public String trimAndConcat(String a , String b) {
		String s1 = a.trim();
		String s2= b.trim();
		String str = s1+s2;
		return str;

	}
	public Integer getIndexOrNull(String k, char o) {
	 int l= k.indexOf(o);
	 if (l== -1) {
		 return null;
	 }
	return l;
	}
public Integer getIndexOrNull(String l ,  String m) {
	
	int p = l.indexOf(m);
	if (p== -1) {
		 return null;
	 }
	 
	return p;
}
public String concatSubstring(String k, int l, int m, String n) {
String	r = k.substring(l, m);
String wo=  r.concat(n);
 
	
	
	
	return wo;
	
}
	
	


}
