package pl.msiwek.pizzeria.implementation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import pl.msiwek.pizzeria.api.IOrder;
import pl.msiwek.pizzeria.api.IPizza;


@Component
public class Order implements IOrder{
	
	private IPizza pizza;
	
	public Order(@Qualifier("Egzotyczna")  IPizza pizza) {
		super();
		pizza.setPrice(10);
		this.pizza = pizza;
	}

	public void printOrder() {
		// TODO Auto-generated method stub
		System.out.println("Zamowienie : " + pizza.getName() + " cena : " + pizza.getPrice());
	}
	
	
}
