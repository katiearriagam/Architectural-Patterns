import java.lang.Object;
import java.util.*;

public class DVDController{
	private String sDeviceName;
	private Boolean bIsOn = false;

	public DVDController(String sDeviceName){
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

	public void playDVD(){
		System.out.println("The " + sDeviceName + " is now playing the current DVD");
	}

	public void pauseDVD(){
		System.out.println("The " + sDeviceName + " has paused the playback of the current DVD");
	}

	public void stopDVD(){
		System.out.println("The " + sDeviceName + " has stopped the playback of the current DVD");
	}

	public String getDeviceName(){
		return sDeviceName;
	}
}
