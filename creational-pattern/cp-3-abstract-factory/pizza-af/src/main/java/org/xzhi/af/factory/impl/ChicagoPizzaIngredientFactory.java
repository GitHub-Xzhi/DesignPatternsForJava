package org.xzhi.af.factory.impl;

import org.xzhi.af.factory.PizzaIngredientFactory;
import org.xzhi.af.ingredient.Cheese;
import org.xzhi.af.ingredient.Clams;
import org.xzhi.af.ingredient.Veggies;
import org.xzhi.af.ingredient.impl.BlackOlives;
import org.xzhi.af.ingredient.impl.FrozenClams;
import org.xzhi.af.ingredient.impl.MozzarellaCheese;
import org.xzhi.af.ingredient.impl.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[]{new BlackOlives(), new Spinach()};
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}
