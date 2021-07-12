package org.xzhi.af.factory;

import org.xzhi.af.ingredient.Cheese;
import org.xzhi.af.ingredient.Clams;
import org.xzhi.af.ingredient.Veggies;

/**
 * 负责创建所有原料家族的工厂
 *
 * @author Xzhi
 * @date 2021-07-12 18:58
 */
public interface PizzaIngredientFactory {

    Cheese createCheese();

    Veggies[] createVeggies();

    Clams createClam();

}
