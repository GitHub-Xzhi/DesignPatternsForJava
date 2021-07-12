package org.xzhi.af.store.impl;

import org.xzhi.af.factory.PizzaIngredientFactory;
import org.xzhi.af.factory.impl.ChicagoPizzaIngredientFactory;
import org.xzhi.af.pizza.Pizza;
import org.xzhi.af.pizza.impl.CheesePizza;
import org.xzhi.af.pizza.impl.VeggiePizza;
import org.xzhi.af.store.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");

        }
        return pizza;
    }
}
