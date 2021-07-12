package org.xzhi.fm;

import org.xzhi.fm.impl.NYPizzaStore;
import org.xzhi.fm.impl.ChicagoPizzaStore;

/**
 * PizzaTest
 *
 * @author Xzhi
 * @date 2021-07-11 23:43
 */
public class PizzaTest {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("cheese");
    }
}
