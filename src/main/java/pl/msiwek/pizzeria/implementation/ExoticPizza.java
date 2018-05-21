package pl.msiwek.pizzeria.implementation;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import pl.msiwek.pizzeria.api.GoodPizza;
import pl.msiwek.pizzeria.api.IPizza;

//@Primary
@Component
@Qualifier("Egzotyczna")
//@GoodPizza
public class ExoticPizza implements IPizza {
	private int price;
	private String name;

	public ExoticPizza(
			@Value("17") int price,
			@Value("egzotyczna") String name
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

	public void setPrice(int i) {
		this.price = i;
		
	}

}
