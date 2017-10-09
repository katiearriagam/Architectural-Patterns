package proxy;

public class Error extends State{
	public void print() {
		System.out.println("STATE: Error.");
		System.out.println("ACTION: Abort.");
	}
}
