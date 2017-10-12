/**
 * Command pattern
 *
 * Elias Mera 
 * Fabian Montemayor 
 * Gala Islas 
 * Maria Paula Anastas
 */

import java.util.Scanner;

// Command
class Control {
	
	public LivingRoomLight livingRoomLight = new LivingRoomLight();
	public KitchenLight kitchenLight = new KitchenLight();
	public LivingRoomFan livingRoomFan = new LivingRoomFan();
	public Stereo stereo = new Stereo();
	public GarageDoor garageDoor = new GarageDoor();
	public PartyMode partyMode = new PartyMode(livingRoomLight, stereo);
	public AllLights allLights = new AllLights(livingRoomLight, kitchenLight);

	public void turnON(Receiver receiver) {
		receiver.turnON();
	}

	public void turnOFF(Receiver receiver) {
		receiver.turnOFF();
	}

	public void states() {
		System.out.println("### States ###");
		System.out.println("Living Room Light: " + this.livingRoomLight.state);
		System.out.println("Kitchen Light: " + this.kitchenLight.state);
		System.out.println("Living Room Fan: " + this.livingRoomFan.state);
		System.out.println("Stereo: " + this.stereo.state);
		System.out.println("Garage Door: " + this.garageDoor.state);
	}
}

abstract class Receiver {
	public String state = "off";
	public abstract void turnON();
	public abstract void turnOFF();
}

// LIVING ROOM LIGHT
class LivingRoomLight extends Receiver{
	public void turnON() {
		System.out.println("Living room light turned on");
		this.state = "on";
	}

	public void turnOFF() {
		System.out.println("Living room light turned off");
		this.state = "off";
	}
}

// KITCHEN LIGHT
class KitchenLight extends Receiver{
	public void turnON() {
		System.out.println("Kitchen light turned on");
		this.state = "on";
	}

	public void turnOFF() {
		System.out.println("Kitchen light turned off");
		this.state = "off";
	}
}

// LIVING ROOM FAN
class LivingRoomFan extends Receiver{
	public void turnON() {
		System.out.println("Living room fan turned on");
		this.state = "on";
	}

	public void turnOFF() {
		System.out.println("Living room fan turned off");
		this.state = "off";
	}
}
class GarageDoor extends Receiver{
	public void turnON() {
		System.out.println("Garage door opened");
		this.state = "on";
	}

	public void turnOFF() {
		System.out.println("Garage door closed.");
		this.state = "off";
	}
}
class Stereo extends Receiver{
	public void turnON() {
		System.out.println("Stereo turned on");
		this.state = "on";
	}

	public void turnOFF() {
		System.out.println("Stereo turned off");
		this.state = "off";
	}
}

class AllLights extends Receiver{
	private LivingRoomLight livingRoomLight = new LivingRoomLight();
	private KitchenLight kitchenLight = new KitchenLight();

	public AllLights(LivingRoomLight lrl, KitchenLight kl){
		this.livingRoomLight = lrl;
		this.kitchenLight = kl;
	}

	public void turnON() {
		System.out.println("All lights turned on");
		this.livingRoomLight.state = "on";
		this.kitchenLight.state = "on";
	}

	public void turnOFF() {
		System.out.println("All lights turned off");
		this.livingRoomLight.state = "off";
		this.kitchenLight.state = "off";
	}
}

class PartyMode extends Receiver{

	private LivingRoomLight livingRoomLight;
	private Stereo stereo;

	public PartyMode(LivingRoomLight lrl, Stereo s){
		this.livingRoomLight = lrl;
		this.stereo = s;
	}
	
	public void turnON() {
		System.out.println("Party mode on");
		this.livingRoomLight.state = "on";
		this.stereo.state = "on";
	}

	public void turnOFF() {
		System.out.println("Party mode off");
		this.livingRoomLight.state = "off";
		this.stereo.state = "off";
	}
}

// client

public class Command {
	
	
	public static void main(String[] args) {
		Control mycontrol = new Control();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			mycontrol.states();
			System.out.println("Living Room Light 1-on, 2-off");
			System.out.println("Kitchen Light 3-on, 4-off");
			System.out.println("Living Room Fan 5-on, 6-off");
			System.out.println("Stereo 7-on, 8-off");
			System.out.println("Garage Door 9-on, 10-off");
			System.out.println("All Lights 11-on, 12-off");
			System.out.println("Party Mode 13-on, 14-off");
			int option = scanner.nextInt();

			switch (option) {
				case 1:
				mycontrol.turnON(mycontrol.livingRoomLight);
				break;
				case 2:
				mycontrol.turnOFF(mycontrol.livingRoomLight);
				break;
				case 3:
				mycontrol.turnON(mycontrol.kitchenLight);
				break;
				case 4:
				mycontrol.turnOFF(mycontrol.kitchenLight);
				break;
				case 5:
				mycontrol.turnON(mycontrol.livingRoomFan);
				break;
				case 6:
				mycontrol.turnOFF(mycontrol.livingRoomFan);
				break;
				case 7:
				mycontrol.turnON(mycontrol.stereo);
				break;
				case 8:
				mycontrol.turnOFF(mycontrol.stereo);
				break;
				case 9:
				mycontrol.turnON(mycontrol.garageDoor);
				break;
				case 10:
				mycontrol.turnOFF(mycontrol.garageDoor);
				break;
				case 11:
				mycontrol.turnON(mycontrol.allLights);
				break;
				case 12:
				mycontrol.turnOFF(mycontrol.allLights);
				break;
				case 13:
				mycontrol.turnON(mycontrol.partyMode);
				break;
				case 14:
				mycontrol.turnOFF(mycontrol.partyMode);
				break;
			}
		}
	}

}