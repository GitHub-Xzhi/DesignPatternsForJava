package org.xzhi.fm.impl;

import org.xzhi.fm.PizzaStore;
import org.xzhi.fm.Pizza;

/**
 * ChicagoPizzaStore
 *
 * @author Xzhi
 * @date 2021-07-11 22:47
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else return null;
    }
}
