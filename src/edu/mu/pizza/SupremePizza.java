package edu.mu.pizza;

public class SupremePizza extends AbstractPizza{

	//constructor
	public SupremePizza() {
		super();
		super.priceWithoutToppings = 3.50;    		//is this hard coded for each of the pizzas???
		orderIDCount++;                       		//increase when a new pizza is made
		super.pizzaOrderID = orderIDCount;
		
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
