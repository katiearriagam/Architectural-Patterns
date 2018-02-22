import java.lang.Object;
import java.util.*;

public class TVController{
	private String sDeviceName;
	private Boolean bIsOn = false;

	public TVController(String sDeviceName){
		this.sDeviceName = sDeviceName;
	}

	public void turnOff(){
		if (bIsOn){
			System.out.println("The " + sDeviceName + " was turned off.");
			bIsOn = false;
		}
		else{
			System.out.println("The " + sDeviceName + " is already turned off.");
		}
	}

	public void turnOn(){
		if (bIsOn){
			System.out.println("The " + sDeviceName + " is already turned on.");
		}
		else{
			System.out.println("The " + sDeviceName + " was turned on.");
			bIsOn = true;
		}
	}

	public void nextChannel(){
		System.out.println("The " + sDeviceName + " is now playing the next channel");
	}

	public void previousChannel(){
		System.out.println("The " + sDeviceName + " is now playing the previous channel");
	}

	public void turnUpVolume(){
		System.out.println("The " + sDeviceName + "'s volume was turned up");
	}

	public void turnDownVolume(){
		System.out.println("The " + sDeviceName + "'s volume was turned down");
	}

	public String getDeviceName(){
		return sDeviceName;
	}
}
