package edu.mu.fakespeare;

import edu.mu.fakespeare.AbstractPizza;
import edu.mu.fakespeare.HawaiianPizza;
import edu.mu.fakespeare.MargheritaPizza;
import edu.mu.fakespeare.PizzaType;
import edu.mu.fakespeare.SupremePizza;
import edu.mu.fakespeare.VegetarianPizza;

public interface ICookingStrategy {

public default boolean cook(AbstractPizza pizza) {
	return true;
}

class BrickOvenCookingStrategy implements ICookingStrategy {

	@Override
	public boolean cook(AbstractPizza pizza) {
		pizza.cookingPrice = 10;
		pizza.totalPrice += pizza.cookingPrice;
		return true;
	}
		
}
class ConventionalOvenCookingStrategy implements ICookingStrategy {

	@Override
	public boolean cook(AbstractPizza pizza) {
		pizza.cookingPrice = 8;
		pizza.totalPrice += pizza.cookingPrice;
		return true;
	}
		
}
class MicrowaveCookingStrategy implements ICookingStrategy {

	@Override
	public boolean cook(AbstractPizza pizza) {
		pizza.cookingPrice = 1;
		pizza.totalPrice += pizza.cookingPrice;
		return true;
	}
		
}
/* juzt in case the return doesn't work in abstract
 * string cookingStrat = "";
 * if (pizza.cookingPrice ==1 ) {
	cookingStrat = "Microwave"; }
	if (pizza.cookingPrice == 8) {
	cookingStrat = "Conventional Oven" }
	if (pizza.cookingPrice == 10) {
	cookingStrat = "Brick Oven) }
*/	
}
