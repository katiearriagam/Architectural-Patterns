import java.lang.Object;
import java.util.*;

public class CentralSystem{
	private LightController licLivingroom = new LightController("Living room's lights");
	private LightController licKitchen = new LightController("Kitchen's lights");
	private LightController licBedroom = new LightController("Bedroom's lights");
	private LightController licBathroom = new LightController("Bathroom's lights");

	private TVController tvcController = new TVController("TV");

	private DVDController dvcController = new DVDController("DVD Player");

	private AudioController aucController = new AudioController("Audio Player");

	public void controlLivingRoomLights(){
		controlLights(licLivingroom);
	}

	public void controlKitchenLights(){
		controlLights(licKitchen);
	}

	public void controlBedroomLights(){
		controlLights(licBedroom);
	}

	public void controlBathroomLights(){
		controlLights(licBathroom);
	}


	public void startMovieMode(){
		System.out.println("---");
		this.tvcController.turnOn();
		this.dvcController.turnOn();
		this.dvcController.playDVD();
		System.out.println("---");
	}

	public void endMovieMode(){
		System.out.println("---");
		this.tvcController.turnOff();
		this.dvcController.turnOff();
		System.out.println("---");
	}

	public void startLoungeMode(){
		System.out.println("---");
		this.licLivingroom.turnOn();
		this.aucController.turnOn();
		this.aucController.turnDownVolume();
		System.out.println("---");	
	}

	public void endLoungeMode(){
		System.out.println("---");
		this.licLivingroom.turnOff();
		this.aucController.turnOff();
		System.out.println("---");	
	}

	public void startKitchenMode(){
		System.out.println("---");
		this.licKitchen.turnOn();
		this.aucController.turnOn();
		this.aucController.turnDownVolume();
		System.out.println("---");
	}
	public void endKitchenMode(){
		System.out.println("---");
		this.licKitchen.turnOff();
		this.aucController.turnOff();
		System.out.println("---");
	}

	public void controlTV(){
			System.out.println("* " + tvcController.getDeviceName() + " *" + "(1) Turn On (2) Turn Off (3) Next Channel (4) Previous Channel (5) Turn Up Volume (6) Turn Down Volume (7) Return ");
			Scanner scaScanner = new Scanner(System.in);
			int iOption = scaScanner.nextInt();

			System.out.println("---");
			switch (iOption) {
				case 1:
					tvcController.turnOn();
					break;
				case 2:
					tvcController.turnOff();
					break;
				case 3:
					tvcController.nextChannel();
					break;
				case 4:
					tvcController.previousChannel();
					break;
				case 5:
					tvcController.turnUpVolume();
					break;
				case 6:
					tvcController.turnDownVolume();
					break;
				default:
					break;
			}
			System.out.println("---");


	}

	public void controlAudioPlayer(){
		System.out.println("* " + aucController.getDeviceName() + " *" + "(1) Turn On (2) Turn Off (3) Next Song (4) Previous Song (5) Turn Up Volume (6) Turn Down Volume (7) Return ");
		Scanner scaScanner = new Scanner(System.in);
		int iOption = scaScanner.nextInt();

		System.out.println("---");
		switch (iOption) {
			case 1:
				aucController.turnOn();
				break;
			case 2:
				aucController.turnOff();
				break;
			case 3:
				aucController.nextSong();
				break;
			case 4:
				aucController.previousSong();
				break;
			case 5:
				aucController.turnUpVolume();
				break;
			case 6:
				aucController.turnDownVolume();
				break;
			default:
				break;
		}
		System.out.println("---");
	}

	public void controlDVDPlayer(){
		System.out.println("* " + dvcController.getDeviceName() + " *" + "(1) Turn On (2) Turn Off (3) Play DVD (4) Pause DVD (5) Stop DVD (6) Return ");
		Scanner scaScanner = new Scanner(System.in);
		int iOption = scaScanner.nextInt();

		System.out.println("---");
		switch (iOption) {
			case 1:
				dvcController.turnOn();
				break;
			case 2:
				dvcController.turnOff();
				break;
			case 3:
				dvcController.playDVD();
				break;
			case 4:
				dvcController.pauseDVD();
				break;
			case 5:
				dvcController.stopDVD();
				break;
			case 6:
				break;
			default:
				break;
		}
		System.out.println("---");
	}

	private void controlLights(LightController licController){
		System.out.println("* " + licController.getDeviceName() + " *" + "(1) Turn On (2) Turn Off");
		Scanner scaScanner = new Scanner(System.in);
		int iOption = scaScanner.nextInt();

		System.out.println("---");
		switch (iOption) {
			case 1:
				licController.turnOn();
				break;
			case 2:
				licController.turnOff();
				break;
			default:
				break;
		}
		System.out.println("---");

	}


}