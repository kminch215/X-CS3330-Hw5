package edu.mu.fakespeare;

public enum PizzaType {
	HAWAIIAN(Toppings.CANADIAN_BACON, Toppings.CHEESE, Toppings.PINEAPPLE),
	MARGHERITA(Toppings.TOMATO, Toppings.CHEESE),
	SUPREME(Toppings.TOMATO, Toppings.CHEESE, Toppings.BELL_PEPPER, Toppings.ITALIAN_SAUSAGE, Toppings.PEPPERONI, Toppings.BLACK_OLIVE, Toppings.MUSHROOM),
	VEGETARIAN(Toppings.TOMATO, Toppings.CHEESE, Toppings.BELL_PEPPER, Toppings.BLACK_OLIVE, Toppings.MUSHROOM);

	private Toppings[] toppings;

    PizzaType(Toppings... toppings) {
        this.toppings = toppings;
    }

    public double calculatePrice() {
        double total = 0;
        for (Toppings topping : toppings) {
            total += topping.getToppingPrice();
        }
        return total;
    }
}
