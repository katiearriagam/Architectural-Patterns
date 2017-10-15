// Equipo "Agentes Libres"
// Diseño y Arquitectura de Software	Prof. Juan Carlos Lavariega
// 12/10/2017
// This the strategy for the Mallard Duck breed
// It implements the Quack and Fly methods of the Duck interface
public class Mallard implements Duck {
	@Override
	public String doQuack() {
		return "Mallard Quacks";
	}
	public String doFly() {
		return "Mallard Flies";
	}
}
