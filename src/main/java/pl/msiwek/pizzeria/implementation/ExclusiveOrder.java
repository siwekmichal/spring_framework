package pl.msiwek.pizzeria.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import pl.msiwek.pizzeria.api.GoodPizza;
import pl.msiwek.pizzeria.api.IOrder;
import pl.msiwek.pizzeria.api.IPizza;

@Component
@Primary
public class ExclusiveOrder implements IOrder{
	
//	@Autowired	// wstrzykiwanie zależności przez refleksję
//	@GoodPizza
	private IPizza pizza;
	
	public ExclusiveOrder() {
		super();
	}
	
	public void printOrder () {
		System.out.println("Zamówienie exclusive : "  + pizza.getName() + ", cena : " + pizza.getPrice());
	}

	public IPizza getPizza() {
		return pizza;
	}
	
	
	@Autowired	// wstrzykiwanie zależności przez setter
//	@GoodPizza
	public void setPizza(IPizza pizza) {
		pizza.setPrice(20);
		this.pizza = pizza;
	}
	
	
}
