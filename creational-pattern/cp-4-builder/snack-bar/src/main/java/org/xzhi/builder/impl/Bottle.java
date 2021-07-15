package org.xzhi.builder.impl;

import org.xzhi.builder.Packing;

/**
 * Bottle
 *
 * @author Xzhi
 * @date 2021-07-13 17:47
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "瓶装";
    }
}
