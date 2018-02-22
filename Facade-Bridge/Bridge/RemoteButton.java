// Abstraction

public abstract class RemoteButton{
	
	// A reference to a generic device
	private EntertainmentDevice theDevice;
	
	public RemoteButton(EntertainmentDevice newDevice){
		theDevice = newDevice;
	}
	
	public void buttonFivePressed() {
		theDevice.buttonFivePressed();
	}
	
	public void buttonSixPressed() {
		theDevice.buttonSixPressed();
	}
	
	public void deviceFeedback(){
		theDevice.deviceFeedback();
	}
	
	public abstract void buttonNinePressed();
}