package pl.msiwek.pizzeria.implementation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import pl.msiwek.pizzeria.api.IPizza;

@Component
public class ExoticPizza implements IPizza {
	private int price;
	private String name;

	public ExoticPizza(
			@Value("1") int price, 
			@Value("Exotic") String name
		) {
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
