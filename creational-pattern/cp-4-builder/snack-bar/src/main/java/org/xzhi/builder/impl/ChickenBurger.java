package org.xzhi.builder.impl;

/**
 * 肉食汉堡
 *
 * @author Xzhi
 * @date 2021-07-13 17:54
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "肉食汉堡";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
