package edu.mu.cooking;

import edu.mu.pizza.AbstractPizza;

public class MicrowaveCookingStrategy implements ICookingStrategy {

	@Override
	public boolean cook(AbstractPizza pizza) {
		pizza.cookingPrice = 1;
		pizza.totalPrice += pizza.cookingPrice;
		return true;
	}
		
}