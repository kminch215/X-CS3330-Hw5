package edu.mu.pizza;

import java.util.List;

import edu.mu.cooking.ICookingStrategy;
import edu.mu.pizza.Toppings;

public abstract class AbstractPizza {
	
	protected List<Toppings> toppingList;
	protected double priceWithoutToppings;
	protected double totalPrice;
	protected int pizzaOrderID;
	protected static int orderIDCount = 0;   //make sure that this should be initialized to 0
	protected ICookingStrategy cookingStrategy;
	protected double cookingPrice;
	
	//constructor that will instantiate the toppingList
	public AbstractPizza(List<Toppings> toppingList) {
		super();
		this.toppingList = toppingList;
	}
	
	//getters and setter methods for all instance variables
	public List<Toppings> getToppingList() {
		return toppingList;
	}
	public void setToppingList(List<Toppings> toppingList) {
		this.toppingList = toppingList;
	}
	public double getPriceWithoutToppings() {
		return priceWithoutToppings;
	}
	public void setPriceWithoutToppings(double priceWithoutToppings) {
		this.priceWithoutToppings = priceWithoutToppings;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getPizzaOrderID() {
		return pizzaOrderID;
	}
	public void setPizzaOrderID(int pizzaOrderID) {
		this.pizzaOrderID = pizzaOrderID;
	}
	public static int getOrderIDCount() {
		return orderIDCount;
	}
	public static void setOrderIDCount(int orderIDCount) {   //remove the setter for the static variable?
		AbstractPizza.orderIDCount = orderIDCount;
	}
	public ICookingStrategy getCookingStrategy() {
		return cookingStrategy;
	}
	public void setCookingStrategy(ICookingStrategy cookingStrategy) {
		this.cookingStrategy = cookingStrategy;
	}
	public double getCookingPrice() {
		return cookingPrice;
	}
	public void setCookingPrice(double cookingPrice) {
		this.cookingPrice = cookingPrice;
	}
	
	//abstract methods
	protected abstract double addTopingsToPrice(double priceWithoutToppings);
	
	public abstract double updatePizzaPrice();
	
}
