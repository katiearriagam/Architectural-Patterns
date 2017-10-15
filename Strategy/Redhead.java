// Equipo "Agentes Libres"
// Diseño y Arquitectura de Software	Prof. Juan Carlos Lavariega
// 12/10/2017
// This is the strategy for the Redhead Duck breed
// It implements the Quack and Fly methods of the Duck interface
public class Redhead implements Duck {
	@Override
	public String doQuack() {
		return "Redhead Quacks";
	}
	public String doFly() {
		return "Redhead Flies";
	}
}
