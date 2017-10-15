// Equipo "Agentes Libres"
// Diseño y Arquitectura de Software	Prof. Juan Carlos Lavariega
// 12/10/2017
// This is the Strategy interface
// The methods declared on this interface are the only method to be used
// But each strategy can implement the methods in a different way
// Ducks can either Quack or Fly
public interface Duck {

	public String doQuack();
	public String doFly();
}
