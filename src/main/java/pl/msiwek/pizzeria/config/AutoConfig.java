package pl.msiwek.pizzeria.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("pl.msiwek.pizzeria.implementation")
//@Import(Config.class)
public class AutoConfig {

}
