package main;

public class Client {
	public static void main(String[] args){
		Pizza basicPizza = new PlainPizza();
		
		Pizza medianPizza =  new Mozzarella(basicPizza);
		
		Pizza fullPizza = new TomatoSauce(medianPizza);
		
		System.out.println("Ingredients: " + fullPizza.getDescription());
		System.out.println("Price: " + fullPizza.getCost());
		
		//Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		//System.out.println("Ingredients: " + basicPizza.getDescription());
		//System.out.println("Price: " + basicPizza.getCost());
	}
}
