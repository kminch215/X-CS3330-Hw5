package edu.mu.pizza;

import java.util.List;

import edu.mu.cooking.ICookingStrategy;

public class SupremePizza extends AbstractPizza{

	//parameterized constructor
	public SupremePizza(List<Toppings> toppingList, double priceWithoutToppings, double totalPrice, int pizzaOrderID, ICookingStrategy cookingStrategy, double cookingPrice) {
		super(toppingList);
		super.priceWithoutToppings = priceWithoutToppings;    //is this hard coded for each of the pizzas???
		super.totalPrice = totalPrice;
		super.pizzaOrderID = pizzaOrderID;
		super.cookingStrategy = cookingStrategy;
		super.cookingPrice = cookingPrice;
		orderIDCount++;                                      //increase when a new pizza is made
		
		toppingList.add(Toppings.TOMATO);
		toppingList.add(Toppings.CHEESE);
		toppingList.add(Toppings.BELL_PEPPER);
		toppingList.add(Toppings.ITALIAN_SAUSAGE);
		toppingList.add(Toppings.PEPPERONI);
		toppingList.add(Toppings.BLACK_OLIVE);
		toppingList.add(Toppings.MUSHROOM);
		totalPrice = addTopingsToPrice(priceWithoutToppings);
	}
	
	//copy constructor
	public SupremePizza(SupremePizza pizza) {
		this(pizza.toppingList, pizza.priceWithoutToppings, pizza.totalPrice, pizza.pizzaOrderID, pizza.cookingStrategy, pizza.cookingPrice);
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
		return "SupremePizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + ", cookingStrategy="
				+ cookingStrategy + ", cookingPrice=" + cookingPrice + ", updatePizzaPrice()=" + updatePizzaPrice()
				+ ", getToppingList()=" + getToppingList() + ", getPriceWithoutToppings()=" + getPriceWithoutToppings()
				+ ", getTotalPrice()=" + getTotalPrice() + ", getPizzaOrderID()=" + getPizzaOrderID()
				+ ", getCookingStrategy()=" + getCookingStrategy() + ", getCookingPrice()=" + getCookingPrice()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
