package edu.mu.cooking;

import edu.mu.pizza.AbstractPizza;

public class ConventionalOvenCookingStrategy implements ICookingStrategy {

	@Override
	public boolean cook(AbstractPizza pizza) {
		pizza.cookingPrice = 8;
		pizza.totalPrice += pizza.cookingPrice;
		return true;
	}
		
]