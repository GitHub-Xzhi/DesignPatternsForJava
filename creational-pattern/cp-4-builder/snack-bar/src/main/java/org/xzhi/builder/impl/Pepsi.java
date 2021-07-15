package org.xzhi.builder.impl;

/**
 * Pepsi
 *
 * @author Xzhi
 * @date 2021-07-13 17:56
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public float price() {
        return 35;
    }
}
