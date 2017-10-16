

public abstract class Pizza {
	String name;

	//Sauce sauce;
	//Veggies veggies[];
	Cheese cheese;
	int bakingTime;
	int bakingTemp;
	//Pepperoni pepperoni;
	//Clams clam;
	Dough dough;

	abstract void prepare();

	void bake() {
		System.out.println("Cocinar en el horno " + bakingTime + " mins a :" + bakingTemp + " grados.");
	}

	void createDough(){
		System.out.println("Preparando la masa : " + dough.toString());
	}

	void setDough(Dough dough){
		this.dough = dough;
	}

	void addSauce(){
		System.out.println("Agregando la salsa");
	}

	void cut() {
		System.out.println("Cortando la Pizza");
	}

	void box() {
		System.out.println("Colocando pizza en caja");
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setTimeAndTemp(int bakingTime, int bakingTemp){
		this.bakingTime = bakingTime;
		this.bakingTemp = bakingTemp;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (dough != null) {
			result.append(dough);
			result.append("\n");
		}
		/*if (sauce != null) {
			result.append(sauce);
			result.append("\n");
		}*/
		if (cheese != null) {
			result.append(cheese);
			result.append("\n");
		}
		/*if (veggies != null) {
			for (int i = 0; i < veggies.length; i++) {
				result.append(veggies[i]);
				if (i < veggies.length-1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		if (clam != null) {
			result.append(clam);
			result.append("\n");
		}
		if (pepperoni != null) {
			result.append(pepperoni);
			result.append("\n");
		}*/
		return result.toString();
	}
}