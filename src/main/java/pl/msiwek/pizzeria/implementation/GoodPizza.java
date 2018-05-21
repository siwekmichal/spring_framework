package pl.msiwek.pizzeria.implementation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import pl.msiwek.pizzeria.api.IPizza;


@Component
@Qualifier("Dobra")
@Primary
public class GoodPizza implements IPizza{
	private int price;
	private String name;
	
	
	public GoodPizza(
			@Value("13") int price, 
			@Value("dobra") String name) {
		super();
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
