package org.xzhi.builder.impl;

import org.xzhi.builder.Item;
import org.xzhi.builder.Packing;

/**
 * ColdDrink
 *
 * @author Xzhi
 * @date 2021-07-13 17:51
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
