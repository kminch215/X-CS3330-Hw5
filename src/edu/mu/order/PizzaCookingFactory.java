package edu.mu.order;

import edu.mu.pizza.AbstractPizza;
import edu.mu.pizza.HawaiianPizza;
import edu.mu.pizza.MargheritaPizza;
import edu.mu.pizza.PizzaType;
import edu.mu.pizza.SupremePizza;
import edu.mu.pizza.VegetarianPizza;

public class PizzaCookingFactory {
	
	//constructor
	public PizzaCookingFactory() {
	}

	//createPizza method that will create a pizza according to the PizzaType that is passed
	//each of the pizza constructors will update the orderIDCount and the pizzaOrderID for each pizza created
	public AbstractPizza createPizza(PizzaType pizzaType) {
		switch(pizzaType) {
			case HAWAIIAN:
				return new HawaiianPizza();
			case MARGHERITA:
				return new MargheritaPizza();
			case SUPREME:
				return new SupremePizza();
			case VEGETARIAN:
				return new VegetarianPizza();
			default:
				System.out.println("Ivalid Pizza");
				break;
		}
		
		return null;
	}
	
}
