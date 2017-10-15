// Equipo "Agentes Libres"
// Diseño y Arquitectura de Software	Prof. Juan Carlos Lavariega
// 12/10/2017
// The Context is the link between the Client and the Interface
// The Context enables the Client to use any Strategy that the Interface has
public class Context_Duck {
	private Duck duck;

	public Context_Duck(Duck duck) {
		this.duck = duck;
	}

	public String quackStrategy() {
		return duck.doQuack();
	}
	public String flyStrategy() {
		return duck.doFly();
	}
}
