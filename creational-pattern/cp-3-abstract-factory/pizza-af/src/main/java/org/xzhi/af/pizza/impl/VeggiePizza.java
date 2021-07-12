package org.xzhi.af.pizza.impl;

import org.xzhi.af.factory.PizzaIngredientFactory;
import org.xzhi.af.pizza.Pizza;

public class VeggiePizza extends Pizza {
	private PizzaIngredientFactory ingredientFactory;
 
	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
	}
}
