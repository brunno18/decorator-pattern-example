package main;

public class PlainPizza implements Pizza {
	
	public PlainPizza () {
		System.out.println("Plain Pizza Created");
	}
	
	@Override
	public String getDescription() {
		
		return "Thin dough";
	
	}

	@Override
	public double getCost() {

		System.out.println("Cost of Dough: " + 4.00);
		
		return 4.00;
	
	}
}
