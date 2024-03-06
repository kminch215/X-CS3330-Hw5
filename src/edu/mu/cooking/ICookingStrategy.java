package edu.mu.cooking;

import edu.mu.pizza.AbstractPizza;
import edu.mu.pizza.HawaiianPizza;
import edu.mu.pizza.MargheritaPizza;
import edu.mu.pizza.PizzaType;
import edu.mu.pizza.SupremePizza;
import edu.mu.pizza.VegetarianPizza;

public interface ICookingStrategy {

public default boolean cook(AbstractPizza pizza) {
	return true;	
}

class BrickOvenCookingStrategy implements ICookingStrategy {

	@Override
	public boolean cook(AbstractPizza pizza) {
		int cookingPrice = 10;
		String CookingStrat = "Brick Oven";
		//AbstractPizza.pizzaprice += cookingPrice;
		return false;
	}
		
}
class ConventionalOvenCookingStrategy implements ICookingStrategy {

	@Override
	public boolean cook(AbstractPizza pizza) {
		int cookingPrice = 8;
		String CookingStrat = "Conventional Oven";
		//AbstractPizza.pizzaprice += cookingPrice;		
		return false;
	}
		
}
class MicrowaveCookingStrategy implements ICookingStrategy {

	@Override
	public boolean cook(AbstractPizza pizza) {
		int cookingPrice = 1;
		String CookingStrat = "Microwave";
		//AbstractPizza.pizzaprice += cookingPrice;
		return false;
	}
		
}
}
