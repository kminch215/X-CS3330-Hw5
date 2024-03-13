package edu.mu.order;

import java.util.ArrayList;
import java.util.List;

import edu.mu.cooking.BrickOvenCookingStrategy;
import edu.mu.cooking.ConventionalOvenCookingStrategy;
import edu.mu.cooking.ICookingStrategy;
import edu.mu.cooking.MicrowaveCookingStrategy;
import edu.mu.pizza.AbstractPizza;
import edu.mu.pizza.CookingStyleType;
import edu.mu.pizza.PizzaType;
import edu.mu.pizza.Toppings;

public class PizzaOrder {

	private PizzaCookingFactory pizzaFactory;
	private ICookingStrategy cookingStrategy;
	private List<AbstractPizza> pizzaOrderList;
	
	//constructor
	
	public PizzaOrder() {
		pizzaFactory = new PizzaCookingFactory();
		pizzaOrderList = new ArrayList<AbstractPizza>();
	}
	
	/* This method gets the pizza order with the given pizza order 
	 * ID and prints the toppings of that order */
	
	public void printListOfToppingsByPizzaOrderID(int orderID) {
		for(AbstractPizza pizza : pizzaOrderList) {
			if(pizza.getPizzaOrderID() == orderID) {
				System.out.println("Toppings on Pizza " + orderID + ": " + pizza.getToppingList());
			}
		}
	}
	
	/* This method prints the pizzas in the pizzaOrderList */
	
	public void printPizzaOrderCart(int orderID) {
		System.out.println("Pizzas in Order Cart: ");
		for(AbstractPizza pizza : pizzaOrderList) {
			System.out.println(pizza.toString());
		}
	}
	
	/* This method finds the pizza order with the given pizza 
	 * order id and returns it. */
	
	public AbstractPizza getPizzaByOrderID(int orderID) {
		for(AbstractPizza pizza : pizzaOrderList) {
			if(pizza.getPizzaOrderID() == orderID) {
				return pizza;
			}
		}
		return null;
	}
	
	/* This method creates a new pizza with the given PizzaType and
	 *  adds it to the pizzaOrderList */
	
	public boolean addPizzaToCart(PizzaType pizzaType) {
		AbstractPizza pizza = pizzaFactory.createPizza(pizzaType);
		if(pizza != null) {
			pizzaOrderList.add(pizza);
			return true;
		}
		else return false;
		
	}
	
	/* This method finds the pizza order with the given ID and adds 
	 * the given topping to its topping list if it doesn’t already exist in 
	 * the list. If the given topping is added, it also updates the pizza price 
	 * and returns true. If the topping already exists in the topping list of the 
	 * pizza, it returns false */
	
	public boolean addNewToppingToPizza(int orderID, Toppings topping) {
		AbstractPizza pizza = getPizzaByOrderID(orderID);
		pizza.getToppingList().add(topping);
		pizza.setTotalPrice(pizza.updatePizzaPrice());
		return true;
	}
	
	/* This method finds the pizza order with the given ID and removes 
	 * the given topping from its topping list if it exists in the list. If the 
	 * given topping is removed, it also updates the pizza price and returns true. 
	 * If the topping doesn’t exist in the topping list of the pizza and cannot be 
	 * removed, it returns false */
	
	public boolean removeToppingFromPizza(int orderID, Toppings topping) {
    		AbstractPizza pizza = getPizzaByOrderID(orderID);
    		if (pizza != null) {
        		List<Toppings> toppingsList = pizza.getToppingList();
        		if (toppingsList.contains(topping)) {
            		toppingsList.remove(topping);
            		pizza.setTotalPrice(pizza.updatePizzaPrice());
            		return true;
        		}
    		}
    		return false;
		}
	
	/* This method checks the pizzas in the pizzaOrderList and checks their 
	 * cooking strategies. It returns true if there are any pizzas without any 
	 * assigned pizza cooking strategy. It returns false if there are no pizzas 
	 * without an assigned cooking strategy */
	public boolean isThereAnyUncookedPizza() {
    		for (AbstractPizza pizza : pizzaOrderList) {
        		if (pizza.getCookingStrategy() == null) {
            		return true;
        		}
    		}
    		return false;
		}
	
	/* This method checks if there are any uncooked pizzas. If all pizzas are cooked, 
	 * it calculates the total price of all pizzas and returns the total cart price. 
	 * However, if there is at least one uncooked pizza it throws an exception (Use 
	 * the general Exception class). The checkout method calls the isThereAnyUncookedPizza 
	 * method to check for uncooked pizzas and throws an exception */
	public double checkout() throws Exception {
    		if (isThereAnyUncookedPizza()) {
        		throw new Exception("There are uncooked pizzas in the order.");
    		}

    		double totalPrice = 0.0;
    		for (AbstractPizza pizza : pizzaOrderList) {
        		totalPrice += pizza.getTotalPrice();
    		}
    		return totalPrice;
		}
	
	/* This method gets the pizza with the given order ID, instantiates the cookingStrategy 
	 * according to the cookingStrategyType parameter. Calls the cook function for the 
	 * pizza of the pizza order with the given order ID */
	public boolean selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType) {
    		AbstractPizza pizza = getPizzaByOrderID(orderID);
    		if (pizza != null) {
        		switch (cookingStrategyType) {
            		case MICROWAVE:
            			cookingStrategy = new MicrowaveCookingStrategy();
                		break;
            		case CONVENTIONAL_OVEN:
            			cookingStrategy = new ConventionalOvenCookingStrategy();
                		break;
            		case BRICK_OVEN:
            			cookingStrategy = new BrickOvenCookingStrategy();
                		break;
        		}
        		
        		pizza.setCookingStrategy(cookingStrategy);
        		pizza.getCookingStrategy().cook(pizza);
        		return true;
    		}
    		return false;
		}
	}
