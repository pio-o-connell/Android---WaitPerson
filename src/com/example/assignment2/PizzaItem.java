package com.example.assignment2;

public class PizzaItem {
	pizzaSize PizzaSize;
    boolean ExtraCheese,Mushrooms,Tomatoes,Olives,Pineapple,Peppers;
    String PizzaName;
    int Quantity;
    
	public PizzaItem(pizzaSize pizzaSize, boolean extraCheese, boolean mushrooms,
			boolean tomatoes, boolean olives, boolean pineapple,
			boolean peppers, String pizzaName, int quantity) {
		super();
		PizzaSize = pizzaSize;
		ExtraCheese = extraCheese;
		Mushrooms = mushrooms;
		Tomatoes = tomatoes;
		Olives = olives;
		Pineapple = pineapple;
		Peppers = peppers;
		PizzaName = pizzaName;
		Quantity = quantity;
	}

	public pizzaSize getPizzaSize() {
		return PizzaSize;
	}

	public void setPizzaSize(pizzaSize pizzaSize) {
		PizzaSize = pizzaSize;
	}

	public boolean isExtraCheese() {
		return ExtraCheese;
	}

	public void setExtraCheese(boolean extraCheese) {
		ExtraCheese = extraCheese;
	}

	public boolean isMushrooms() {
		return Mushrooms;
	}

	public void setMushrooms(boolean mushrooms) {
		Mushrooms = mushrooms;
	}

	public boolean isTomatoes() {
		return Tomatoes;
	}

	public void setTomatoes(boolean tomatoes) {
		Tomatoes = tomatoes;
	}

	public boolean isOlives() {
		return Olives;
	}

	public void setOlives(boolean olives) {
		Olives = olives;
	}

	public boolean isPineapple() {
		return Pineapple;
	}

	public void setPineapple(boolean pineapple) {
		Pineapple = pineapple;
	}

	public boolean isPeppers() {
		return Peppers;
	}

	public void setPeppers(boolean peppers) {
		Peppers = peppers;
	}

	public String getPizzaName() {
		return PizzaName;
	}

	public void setPizzaName(String pizzaName) {
		PizzaName = pizzaName;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	
	
	
	
	
	
	
}
