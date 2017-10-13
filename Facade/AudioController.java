import java.lang.Object;
import java.util.*;


public class AudioController{
	private String sDeviceName;
	private Boolean bIsOn = false;

	public AudioController(String sDeviceName){
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

	public void nextSong(){
		System.out.println("The " + sDeviceName + " is now playing the next song");
	}

	public void previousSong(){
		System.out.println("The " + sDeviceName + " is now playing the previous song");
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