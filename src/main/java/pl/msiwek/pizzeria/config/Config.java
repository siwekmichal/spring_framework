package pl.msiwek.pizzeria.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.msiwek.pizzeria.api.IOrder;
import pl.msiwek.pizzeria.api.IPizza;
import pl.msiwek.pizzeria.implementation.GoodPizza;
import pl.msiwek.pizzeria.implementation.ExoticPizza;

import pl.msiwek.pizzeria.implementation.Order;

//@Configuration
public class Config {
	
//	@Bean
//	public IPizza pizza() {
//		return new ExoticPizza(17, "Egzotyczna");
//	}
	
//	@Bean(name = "inna")
//	public IOrder order (IPizza pizza) {
//		return new Order(pizza);
//	}
}
