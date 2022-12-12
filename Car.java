public class car {
	//Atributs 
	public String brand;
	public String model;
	public int amountOfFuel;
	 
	//constucteur 
	public car() {
		brand="";
		model="";
		amountOfFuel=0;
		
	}
	public car(String brandX, String modelX, int amountX) {
		brand=brandX;
		model=modelX;
		amountOfFuel=amountX;
	}

  	public void printData()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Fuel: "+amountOfFuel);
	}
	
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

  	//Methodes
	public void brake()
	{
		System.out.println("Car is breaking");
	}
	
	public void accelerate()
	{
		amountOfFuel = amountOfFuel-1;
		if(amountOfFuel >0) {
			System.out.println("Car is accelerating");
		}
	}
	
}
