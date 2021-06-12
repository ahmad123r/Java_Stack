package Phone;

import java.io.IOException;
import java.nio.CharBuffer;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	String s= String.format("Galaxy %s says %s", getVersionNumber(),getRingTone());
		return s;
    }
    @Override
    public String unlock() {
    	String s = String.format("unlock via fingerprint ");
		return s;
        
    }
    @Override
    public void displayInfo() {
       String s=String.format( "Galaxy %s from %s",getVersionNumber(),getCarrier());  
       System.out.println(s);
    }
	
}
