package edu.mu.order;

import edu.mu.pizza.AbstractPizza;
import edu.mu.pizza.CookingStyleType;
import edu.mu.pizza.PizzaType;
import edu.mu.pizza.Toppings;

public class Main {

	public static void main(String[] args) {
		
		PizzaOrder pizza = new PizzaOrder();
		
		pizza.addPizzaToCart(PizzaType.HAWAIIAN); //1
		pizza.addPizzaToCart(PizzaType.SUPREME);  //2
		pizza.addPizzaToCart(PizzaType.VEGETARIAN); //3
		pizza.addPizzaToCart(PizzaType.MARGHERITA); //4
		
		pizza.printPizzaOrderCart(0);
		
		pizza.addNewToppingToPizza(1, Toppings.BLACK_OLIVE);
		pizza.addNewToppingToPizza(3, Toppings.PEPPERONI);
		pizza.addNewToppingToPizza(4, Toppings.ITALIAN_SAUSAGE);
		
		System.out.println();
		pizza.printListOfToppingsByPizzaOrderID(1);
		pizza.printListOfToppingsByPizzaOrderID(3);
		pizza.printListOfToppingsByPizzaOrderID(4);

		System.out.println();
		pizza.printPizzaOrderCart(0);
		
		pizza.removeToppingFromPizza(2, Toppings.BELL_PEPPER);
		pizza.removeToppingFromPizza(3, Toppings.PEPPERONI);
		pizza.removeToppingFromPizza(4, Toppings.CHEESE);
		
		System.out.println();
		pizza.printListOfToppingsByPizzaOrderID(2);
		pizza.printListOfToppingsByPizzaOrderID(3);
		pizza.printListOfToppingsByPizzaOrderID(4);
		
		System.out.println();
		pizza.printPizzaOrderCart(0);
		
		boolean uncooked = pizza.isThereAnyUncookedPizza();
		System.out.println(uncooked);
		
		pizza.selectCookingStrategyByPizzaOrderID(1,CookingStyleType.BRICK_OVEN);
//		pizza.selectCookingStrategyByPizzaOrderID(2, CookingStyleType.MICROWAVE);
		pizza.selectCookingStrategyByPizzaOrderID(3, CookingStyleType.CONVENTIONAL_OVEN);
		pizza.selectCookingStrategyByPizzaOrderID(4, CookingStyleType.BRICK_OVEN);
		
		System.out.println();
		pizza.printPizzaOrderCart(0);
		uncooked = pizza.isThereAnyUncookedPizza();
		System.out.println(uncooked);
		
		System.out.println();
		AbstractPizza pizza1 = pizza.getPizzaByOrderID(3);
		AbstractPizza pizza2 = pizza.getPizzaByOrderID(4);
		System.out.println(pizza1 + " " + pizza2);
		
		System.out.println();
		try {
			pizza.checkout();
		} catch (Exception e) {
			System.out.println("A pizza in the order is uncooked.");
		}
		
		pizza.selectCookingStrategyByPizzaOrderID(2, CookingStyleType.MICROWAVE);
		
		System.out.println();
		try {
			double total = pizza.checkout();
			System.out.println("Total Price: $" + total);
		} catch (Exception e) {
			System.out.println("A pizza in the order is uncooked.");
		}
	}

}
