package edu.mu.cooking;

import edu.mu.pizza.AbstractPizza;

public class BrickOvenCookingStrategy implements ICookingStrategy {

	@Override
	public boolean cook(AbstractPizza pizza) {
		pizza.cookingPrice = 10;
		pizza.totalPrice += pizza.cookingPrice;
		return true;
	}
		
}
