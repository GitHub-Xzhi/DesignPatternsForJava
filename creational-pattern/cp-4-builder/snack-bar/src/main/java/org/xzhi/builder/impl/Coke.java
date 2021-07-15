package org.xzhi.builder.impl;

/**
 * Coke
 *
 * @author Xzhi
 * @date 2021-07-13 17:55
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
            return "可口可乐";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
