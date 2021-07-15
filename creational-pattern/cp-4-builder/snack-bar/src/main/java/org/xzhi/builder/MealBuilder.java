package org.xzhi.builder;

import org.xzhi.builder.impl.ChickenBurger;
import org.xzhi.builder.impl.Coke;
import org.xzhi.builder.impl.Pepsi;
import org.xzhi.builder.impl.VegBurger;

/**
 * MealBuilder
 *
 * @author Xzhi
 * @date 2021-07-13 20:47
 */
public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger()).addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger()).addItem(new Pepsi());
        return meal;
    }
}
