public class TestTheRemote{
	
	public static void main(String[] args){
		
		RemoteButton theTV = new TVRemoteMute(new TVDevice(1, 200));
		
		RemoteButton theTV2 = new TVRemotePause(new TVDevice(0, 200));
		
		RemoteButton theDVD = new DVDRemote(new DVDDevice(1,14));
		
		System.out.println("Test TV with Mute");
		
		theTV.buttonFivePressed();
		theTV.buttonSixPressed();
		theTV.buttonNinePressed();
		theTV.deviceFeedback();
		
		System.out.println("\nTest TV with Pause");
		
		theTV2.buttonFivePressed();
		theTV2.buttonSixPressed();
		// theTV2.buttonSixPressed();
		theTV2.buttonNinePressed();
		theTV2.deviceFeedback();
		
		System.out.println("\nTest DVD");
		
		theDVD.buttonFivePressed();
		theDVD.buttonSixPressed();
		theDVD.buttonNinePressed();
		theDVD.buttonNinePressed();
		
	}
	
}