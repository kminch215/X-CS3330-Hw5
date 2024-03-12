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
