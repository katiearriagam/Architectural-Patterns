import java.lang.Object;
import java.util.*;

public class LightController{
	private String sDeviceName;
	private Boolean bIsOn = false;

	public LightController(String sDeviceName){
		this.sDeviceName = sDeviceName;
	}

	public void turnOff(){
		if (bIsOn){
			System.out.println("The " + sDeviceName + " were turned off.");
			bIsOn = false;
		}
		else{
			System.out.println("The " + sDeviceName + " are already turned off.");
		}
	}

	public void turnOn(){
		if (bIsOn){
			System.out.println("The " + sDeviceName + " are already turned on.");
		}
		else{
			System.out.println("The " + sDeviceName + " were turned on.");
			bIsOn = true;
		}
	}

	public String getDeviceName(){
		return sDeviceName;
	}

}
