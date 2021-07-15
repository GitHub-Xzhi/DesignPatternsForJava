package org.xzhi.builder.impl;

import org.xzhi.builder.Item;
import org.xzhi.builder.Packing;

/**
 * 汉堡
 *
 * @author Xzhi
 * @date 2021-07-13 17:50
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
