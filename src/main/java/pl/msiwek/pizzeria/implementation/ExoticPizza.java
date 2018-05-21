package pl.msiwek.pizzeria.implementation;

import pl.msiwek.pizzeria.api.IPizza;

public class ExoticPizza implements IPizza {
	private int price;
	private String name;
	
	
	public ExoticPizza(int price, String name) {
		this.price = price;
		this.name = name;
		
	}
	
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	
	
}
