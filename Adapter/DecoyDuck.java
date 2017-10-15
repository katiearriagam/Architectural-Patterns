// Equipo "Agentes Libres"
// Diseño y Arquitectura de Software	Prof. Juan Carlos Lavariega
// 12/10/2017
// This the strategy for the DecoyDuck (A fake hunting duck)
// It implements the Quack and Fly methods of the Duck interface
public class DecoyDuck implements Duck{

	@Override
	public String doQuack() {
		return "DecoyDuck does not Quack! (Look again. It's fake...)";
	}
	public String doFly() {
		return "DecoyDuck does not Fly! (Maybe if you throw it real hard?)";
	}

}
