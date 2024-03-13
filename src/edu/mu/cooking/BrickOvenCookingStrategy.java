package edu.mu.cooking;

import edu.mu.pizza.AbstractPizza;

public class BrickOvenCookingStrategy implements ICookingStrategy {

	@Override
	public boolean cook(AbstractPizza pizza) {
		pizza.setCookingPrice(10);
		pizza.setTotalPrice(pizza.getTotalPrice() + pizza.getCookingPrice());
		return true;
	}

	@Override
	public String toString() {
		return "BrickOvenCookingStrategy";
	}
		
}
