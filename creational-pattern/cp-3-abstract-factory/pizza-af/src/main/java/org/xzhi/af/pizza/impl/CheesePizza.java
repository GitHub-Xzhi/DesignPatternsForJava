package org.xzhi.af.pizza.impl;

import org.xzhi.af.factory.PizzaIngredientFactory;
import org.xzhi.af.pizza.Pizza;

public class CheesePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        veggies = ingredientFactory.createVeggies();
        clam = ingredientFactory.createClam();
        cheese = ingredientFactory.createCheese();
    }

}
