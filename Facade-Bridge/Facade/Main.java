import java.util.*;

public class Main {
	private static CentralSystem cesSystem = new CentralSystem();
	public static void showMainMenu(){
		System.out.println("Welcome to EasyLife. Select any of the following devices:");
		System.out.println("(1) Living room's lights");
		System.out.println("(2) Kitchen's lights");
		System.out.println("(3) Bedroom's lights");
		System.out.println("(4) Bathroom's lights");

		System.out.println("(5) TV");
		System.out.println("(6) DVD Player");
		System.out.println("(7) Audio Player");
		System.out.println("(8) Experienced users' menu");

		Scanner scaScanner = new Scanner(System.in);
		int iOption = scaScanner.nextInt();
		// scaScanner.close();

		switch (iOption) {
			case 1:
				cesSystem.controlLivingRoomLights();
				break;
			case 2:
				cesSystem.controlKitchenLights();
				break;
			case 3:
				cesSystem.controlBedroomLights();
				break;
			case 4:
				cesSystem.controlBathroomLights();
				break;
			case 5:
				cesSystem.controlTV();
				break;
			case 6:
				cesSystem.controlDVDPlayer();
				break;
			case 7:
				cesSystem.controlAudioPlayer();
				break;
			case 8:
				showAdvancedMenu();
				break;
			default:
				break;
		}
	}

	public static void showAdvancedMenu(){
		System.out.println("This is the menu for experienced users. Select any of the following modes:");
		System.out.println("(1) Start Movie mode");
		System.out.println("(2) End Movie movie");
		System.out.println("(3) Start Lounge mode");
		System.out.println("(4) End Lounge mode");
		System.out.println("(5) Start Kitchen Mode");
		System.out.println("(6) End Kitchen Mode");


		Scanner scaScanner = new Scanner(System.in);
		int iOption = scaScanner.nextInt();

		switch (iOption) {
			case 1:
				cesSystem.startMovieMode();
				break;
			case 2:
				cesSystem.endMovieMode();
				break;
			case 3:
				cesSystem.startLoungeMode();
				break;
			case 4:
				cesSystem.endLoungeMode();
				break;
			case 5:
				cesSystem.startKitchenMode();
				break;
			case 6:
				cesSystem.endKitchenMode();
				break;
			default:
				break;
		}
	}

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        while (true){
        	showMainMenu();
        }

    }
}
