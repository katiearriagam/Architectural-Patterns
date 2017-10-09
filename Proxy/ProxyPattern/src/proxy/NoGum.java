package proxy;

public class NoGum extends State{
	public void print() {
        System.out.println("STATE: No gum available.");
        System.out.println("ACTION: Machine returns coin.");
    }
}
