package org.xzhi.fm.impl;

import org.xzhi.fm.Pizza;
import org.xzhi.fm.PizzaStore;

/**
 * NYPizzaStore
 *
 * @author Xzhi
 * @date 2021-07-11 22:39
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else return null;
    }
}
