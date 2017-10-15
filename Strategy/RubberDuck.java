// Equipo "Agentes Libres"
// Diseño y Arquitectura de Software	Prof. Juan Carlos Lavariega
// 12/10/2017
// This the strategy for the Rubber duck (A toy duck)
// It implements the Quack and Fly methods of the Duck interface
public class RubberDuck implements Duck {
	@Override
	public String doQuack() {
		return "RubberDuck does not Quack! (Well actually it squeaks)";
	}
	public String doFly() {
		return "RubberDuck does not Fly! (It's made out of rubber, duh)";
	}
}
