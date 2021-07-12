package org.xzhi.af.factory.impl;

import org.xzhi.af.factory.PizzaIngredientFactory;
import org.xzhi.af.ingredient.Cheese;
import org.xzhi.af.ingredient.Clams;
import org.xzhi.af.ingredient.Veggies;
import org.xzhi.af.ingredient.impl.FreshClams;
import org.xzhi.af.ingredient.impl.Garlic;
import org.xzhi.af.ingredient.impl.Onion;
import org.xzhi.af.ingredient.impl.ReggianoCheese;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion()};
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
