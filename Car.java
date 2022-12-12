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
	
}
