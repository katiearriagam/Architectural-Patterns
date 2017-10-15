// Equipo "Agentes Libres"
// Diseño y Arquitectura de Software	Prof. Juan Carlos Lavariega
// 12/10/2017
// This is a concrete class that wants to implement the Duck interface
// but needs an adapter to adapt into that interface.


public class Turkey implements Duck {
  TurkeyAdapter adapter = new TurkeyAdapter();

  @Override
  public String doQuack() {
    return adapter.gobble();
  }
  public String doFly() {
    return adapter.fly();
  }
}
