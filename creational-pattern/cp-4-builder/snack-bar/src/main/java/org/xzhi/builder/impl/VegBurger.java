package org.xzhi.builder.impl;

/**
 * 素食汉堡
 *
 * @author Xzhi
 * @date 2021-07-13 17:52
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "素食汉堡";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
