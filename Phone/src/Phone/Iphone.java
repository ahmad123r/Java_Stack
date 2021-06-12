package Phone;
public class Iphone extends Phone implements Ringable {
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	String s= String.format("Iphone %s says %s", getVersionNumber(),getRingTone());
		return s;
    }
    @Override
    public String unlock() {
    	String s = String.format("unlock via facial rocgonations ");
		return s;
        
    }
    @Override
    public void displayInfo() {
       String s=String.format( "Iphone %s from %s",getVersionNumber(),getCarrier());  
       System.out.println(s);
    }
}