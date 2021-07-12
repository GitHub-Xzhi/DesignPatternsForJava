package org.xzhi.af;

import org.xzhi.af.store.PizzaStore;
import org.xzhi.af.store.impl.NYPizzaStore;

/**
 * PizzaAbstractFactoryTest
 *
 * @author Xzhi
 * @date 2021-07-12 20:53
 */
public class PizzaAbstractFactoryTest {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}
