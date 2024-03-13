# X-CS3330-Hw5
Names: Kendra Minch, Samantha Whitaker, Sarah Greenwood, and Lane Parker

This assignment is an automation of a Pizza Store called FakeSpeare. The assignment involves the implementation of Factory and Strategy design patterns, Enum classes with methods, and assigning values to enums. There are seven classes that are implemented: `Main.java`, `AbstractPizza.java`, `PizzaCookingFactory.java`, `BrickOvenCookingStrategy.java`, `ConvenctionalOvenCookingStrategy.java`, `MicrowaveCookingStrategy.java`, and `PizzaOrder.java`. The `AbstractPizza` class is a abstract base class for the subclasses `HawaiianPizza`, `MargheritaPizza`, `SupremePizza`, and `VegetarianPizza`. Additionally, there are three Enums that are implemented: `Toppings`, `PizzaType` and `CookingStyleType`. Additionally, there is one interface names `ICookingStrategy`.

## AbstractPizza Class:

A class with protected fields for pizza attributes: toppingList(List<Toppings>), priceWithoutToppings(double), totalPrice(double),
pizzaOrderID(int), orderIDCounter(static int), cookingStrategy(ICookingStrategy), and cookingPrice(double). Has parameterized constructor, copy constructor, getter/setter methods, and a toString() method to display pizza information. Has the method prototype for the abstract methods: addTopingsToPrice(double) and updatePizzaPrice()

## PizzaOrder Class:

The Pizza Class contains main program logic and has attributes pizzaFactory(PizzaCookingFactory), cookingStrategy(ICookingStrategy), and pizzaOrderList(List<AbstractPizza>). Additionally we have our printListOfToppingsByPizzaOrderID, printPizzaOrderCart, getPizzaByOrderID, addPizzaToCart, addNewToppingToPizza, removeToppingFromPizza, isThereAnyUncookedPizza, checkout, and selectCookingStrategyByPizzaOrderID methods implemented here.

## PizzaCookingFactory Class:

The PizzaCookingFactory uses the factory design patter and creates an AbstractPizza instance and instantiates it according to the pizzaType parameter. It also sets the pizzaOrderID of the pizza using the current orderIDCounter of the pizza. The orderIDCounter will be incremented and assigned automatically on every creation of pizza, to assign unique pizza order IDs. This class contains a method called createPizza.

## ICookingStrategy Interface: 

Uses the strategy design pattern. Implement a public interface ICookingStrategy with cook(AbstractPizza pizza) method to be implemented. There are three subclasses implementing ICookingStrategy: BrickOvenCookingStrategy, ConventionalOvenCookingStrategy, and MicrowaveCookingStrategy. The subclasses should implement and override the cook method, which sets the cookingPrice, cookingStrategy and updates the pizzaPrice of the pizza that is being cooked and passed as a parameter.

### Group Contributions:
Lane: Implement removeToppingFromPizza(), isThereAnyUncookedPizza(), checkout(), selectCookingStrategyByPizzaOrderID() methods in PizzaOrder class.
Sarah: Set up PizzaType, Toppings, and CookingStyleType enums. The Toppings enum also needs a toppingPrice attribute, a constructor, and a getter. Create ICookingStrategy interface and subclasses BrickOvenCookingStrategy, ConventionalOvenCookingStrategy, and MicrowaveCookingStrategy which implement ICookingStrategy.
Kendra: Set up any factory design pattern specifics, set up AbstractPizza, MargheritaPizza, VegetarianPizza, HawaiianPizza, and SupremePizza classes with attributes and abstract method implementation. Set up PizzaOrder and PizzaCookingFactory classes with attributes and constructors. Write README file.
Samantha: Implement printListOfToppingsByPizzaOrderID(), printPizzaOrderCart(), getPizzaByOrderID(), addPizzaToCart(), addNewToppingToPizza() methods in PizzaOrder class.

### How to run:
First make sure to have a way to compile and run Java files. It also might help to have an IDE like Eclipse to run the code.
Implement a syntactically and logically correct program to put in the main() method in the Main Class. This method is going to be accessing the PizzaOrder class and calling the different methods to manage the pizza store FakeSpeare.
After saving the Main Class file, then run the code using your desired method. For this assignment we used the Run feature in the Eclipse IDE
