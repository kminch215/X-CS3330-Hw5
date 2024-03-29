package edu.mu.pizza;

import edu.mu.cooking.ICookingStrategy;

public class MargheritaPizza extends AbstractPizza {

	//constructor
	public MargheritaPizza() {
		super();
		super.priceWithoutToppings = 2.50;    		//is this hard coded for each of the pizzas???
		orderIDCount++;                       		//increase when a new pizza is made
		super.pizzaOrderID = orderIDCount;
		
		toppingList.add(Toppings.TOMATO);
		toppingList.add(Toppings.CHEESE);
		totalPrice = addTopingsToPrice(priceWithoutToppings);
	}
	
	//copy constructor
	public MargheritaPizza(MargheritaPizza pizza) {
		this.toppingList =  pizza.toppingList;
		this.priceWithoutToppings = pizza.priceWithoutToppings;
		this.totalPrice = pizza.totalPrice;
		this.pizzaOrderID = pizza.pizzaOrderID;
		this.cookingStrategy = pizza.cookingStrategy;
		this.cookingPrice = pizza.cookingPrice;
	}

	@Override
	protected double addTopingsToPrice(double priceWithoutToppings) {
		double priceAfterToppings = priceWithoutToppings;
		for(Toppings t : toppingList) {
			priceAfterToppings += t.getToppingPrice();
		}
		return priceAfterToppings;
	}

	@Override
	public double updatePizzaPrice() {
		double priceAfterToppings = addTopingsToPrice(priceWithoutToppings);
		return priceAfterToppings;
	}

	@Override
	public String toString() {
		return "MargheritaPizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + ", cookingStrategy="
				+ cookingStrategy + ", cookingPrice=" + cookingPrice + "]";
	}
	
	
}
