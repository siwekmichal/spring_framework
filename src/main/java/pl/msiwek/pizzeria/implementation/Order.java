package pl.msiwek.pizzeria.implementation;

import pl.msiwek.pizzeria.api.IOrder;
import pl.msiwek.pizzeria.api.IPizza;

public class Order implements IOrder{
	
	private IPizza pizza;
	
	public Order(IPizza pizza) {
		super();
		this.pizza = pizza;
	}

	public void printOrder() {
		// TODO Auto-generated method stub
		System.out.println("Zamowienie : " + pizza.getName() + " cena : " + pizza.getPrice());
	}
	
	
}
