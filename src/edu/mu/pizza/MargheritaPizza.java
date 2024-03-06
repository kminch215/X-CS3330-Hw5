package edu.mu.pizza;

import java.util.List;

import edu.mu.cooking.ICookingStrategy;

public class MargheritaPizza extends AbstractPizza {

	//parameterized constructor
	public MargheritaPizza(List<Toppings> toppingList, double priceWithoutToppings, double totalPrice, int pizzaOrderID, ICookingStrategy cookingStrategy, double cookingPrice) {
		super(toppingList);
		super.priceWithoutToppings = priceWithoutToppings;    //is this hard coded for each of the pizzas???
		super.totalPrice = totalPrice;
		super.pizzaOrderID = pizzaOrderID;
		super.cookingStrategy = cookingStrategy;
		super.cookingPrice = cookingPrice;
		orderIDCount++;                                      //increase when a new pizza is made
		
		toppingList.add(Toppings.TOMATO);
		toppingList.add(Toppings.CHEESE);
		totalPrice = addTopingsToPrice(priceWithoutToppings);
	}
	
	//copy constructor
	public MargheritaPizza(MargheritaPizza pizza) {
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
		return "MargheritaPizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + ", cookingStrategy="
				+ cookingStrategy + ", cookingPrice=" + cookingPrice + ", updatePizzaPrice()=" + updatePizzaPrice()
				+ ", getToppingList()=" + getToppingList() + ", getPriceWithoutToppings()=" + getPriceWithoutToppings()
				+ ", getTotalPrice()=" + getTotalPrice() + ", getPizzaOrderID()=" + getPizzaOrderID()
				+ ", getCookingStrategy()=" + getCookingStrategy() + ", getCookingPrice()=" + getCookingPrice()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
