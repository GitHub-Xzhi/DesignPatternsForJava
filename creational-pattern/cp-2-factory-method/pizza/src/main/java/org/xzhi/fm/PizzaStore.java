package org.xzhi.fm;

/**
 * 披萨商店
 *
 * @author Xzhi
 * @date 2021-07-11 22:36
 */
public abstract class PizzaStore {

    public abstract Pizza createPizza(String item);

    public final Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
