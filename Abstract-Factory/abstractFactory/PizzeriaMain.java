import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

 
public class PizzeriaMain {
 
        public static void main(String[] args) {
               
                int city = -1;
                String cityName = "";
                int pizzaType = -1;
                String pizzaName = "";

                /*------Stores-------*/
                MetropolisPizzaStore metropolisPizzaStore = new MetropolisPizzaStore();
                CentralCityPizzaStore centralCityPizzaStore = new CentralCityPizzaStore();
                StarCityPizzaStore starCityPizzaStore = new StarCityPizzaStore();
                GothamPizzaStore gothamPizzaStore = new GothamPizzaStore();
                PizzaStore[] pizzaStores = new PizzaStore[4];
                pizzaStores[0]=metropolisPizzaStore;
                pizzaStores[1]=centralCityPizzaStore;
                pizzaStores[2]=starCityPizzaStore;
                pizzaStores[3]=gothamPizzaStore;
                //MetropolisPizzaStore metropolisPizzaStore = new MetropolisPizzaStore();

                
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                Scanner reader = new Scanner(System.in); 
                while (city == -1){
                    System.out.println("Bienvenido a Pitzas Inc! ¿En que ciudad estás?");
                    System.out.println("0 - Metropolis");
                    System.out.println("1 - Central City");
                    System.out.println("2 - Star City");
                    System.out.println("3 - Gothanm");

                    switch (reader.nextInt()) {
                        case 0: city = 0;
                            break;
                        case 1: city = 1;
                            break;
                        case 2: city = 2;
                            break;
                        case 3: city = 3;
                            break;
                        default: System.out.println("Por favor inserta un número válido");
                            break;
                        
                    }

                }
               
               
                switch (city) {
                        case 0: cityName = "Metropolis";

                            break;
                        case 1: cityName = "Central City";
                            break;
                        case 2: cityName = "Star City";
                            break;
                        case 3: cityName = "Gothanm";
                            break;     
                        
                }
                
//------------------------------------------------------------------------------------------
                while (pizzaType == -1){
                    System.out.println("¿Que va a ordenar?");
                    System.out.println("0 - Pizza de Queso");
                    System.out.println("1 - Pizza de Pepperoni");
                    System.out.println("2 - Pizza Hawaiiana");
                    System.out.println("3 - Pizza de Alcachofas");

                    switch (reader.nextInt()) {
                        case 0: pizzaType = 0;
                            break;
                        case 1: pizzaType = 1;
                            break;
                        case 2: pizzaType = 2;
                            break;
                        case 3: pizzaType = 3;
                            break;
                        default: System.out.println("Por favor inserta un número válido");
                            break;
                        
                    }

                }

                switch (pizzaType) {
                        case 0: pizzaName = "cheese";
                            pizzaStores[city].orderPizza(pizzaName);
                            break;
                        case 1: pizzaName = "pepperoni";
                            pizzaStores[city].orderPizza(pizzaName);
                            break;
                        case 2: pizzaName = "hawaiana";
                            pizzaStores[city].orderPizza(pizzaName);
                            break;
                        case 3: pizzaName = "alcachofas";
                            pizzaStores[city].orderPizza(pizzaName);
                            break;     
                        
                }
                
               
               // System.out.println("Usted esta en " + cityName);
                // System.out.println("Y pidio una " + pizzaName);





                System.exit(0);
        }
}




