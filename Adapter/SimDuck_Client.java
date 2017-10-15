// Equipo "Agentes Libres"
// Diseño y Arquitectura de Software	Prof. Juan Carlos Lavariega
// 12/10/2017
//
// The Client can change Contexts to use any Strategy that the interface has
// The Duck interface has 4 Strategies: Mallard, Redhead, RubberDuck and DecoyDuck
// Each Strategy is a different Duck breed and has different capabilities

public class SimDuck_Client {
	 public static void main(String[] args) {

		 //Sets the current context to the Mallard duck strategy
		 Context_Duck context = new Context_Duck(new Mallard());
		 System.out.println("*Mallard tries to quack* : " + context.quackStrategy());
	   System.out.println("*Mallard tries to fly* : " + context.flyStrategy());

	   //Sets the current context to the Redhead duck strategy
	   context.setDuck(new Redhead());
	   System.out.println("*Redhead tries to quack* : " + context.quackStrategy());
	   System.out.println("*Redhead tries to fly* : " + context.flyStrategy());

	   //Sets the current context to the RubberDuck strategy
	   context.setDuck(new RubberDuck());
	   System.out.println("*RubberDuck tries to quack* : " + context.quackStrategy());
	   System.out.println("*RubberDuck tries to fly* : " + context.flyStrategy());

		 //Sets the current context to the DecoyDuck strategy
	   context.setDuck(new DecoyDuck());
	   System.out.println("*DecoyDuck tries to quack* : " + context.quackStrategy());
	   System.out.println("*DecoyDuck tries to fly* : " + context.flyStrategy());

		 // Now a Turkey is set to the current context through the TurkeyAdapter
		 context.setDuck(new TurkeyAdapter());
		 System.out.println("*Turkey tries to quack* : " + context.quackStrategy());
	   System.out.println("*Turkey tries to fly* : " + context.flyStrategy());
	 }
}
