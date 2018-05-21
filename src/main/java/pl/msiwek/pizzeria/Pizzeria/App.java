package pl.msiwek.pizzeria.Pizzeria;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import pl.msiwek.pizzeria.api.IOrder;
import pl.msiwek.pizzeria.config.AutoConfig;
import pl.msiwek.pizzeria.config.Config;
import pl.msiwek.pizzeria.implementation.ExoticPizza;
import pl.msiwek.pizzeria.implementation.GoodPizza;
import pl.msiwek.pizzeria.implementation.Order;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//klasyczne podejście
//    	IOrder order = new Order(new GoodPizza(15, "dobra"));
//    	IOrder order2 = new Order(new ExoticPizza(17, "Egzotyczna"));
//        order.printOrder();
//        order2.printOrder();
//        
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        
        // pobranie beana v1
//        IOrder order = (IOrder) context.getBean("inna");
//        order.printOrder();
//      
        // pobranie beana v2 (dobre podejscie)
    	
    	
    	// automatyczne wiazanie
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
        IOrder order = (IOrder) context.getBean(Order.class);
        order.printOrder();

        
        
    }
}
