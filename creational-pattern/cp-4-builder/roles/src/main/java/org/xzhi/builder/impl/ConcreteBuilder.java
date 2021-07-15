package org.xzhi.builder.impl;

import org.xzhi.builder.Builder;

/**
 * BuilderImpl
 *
 * @author Xzhi
 * @date 2021-07-13 23:42
 */
public class ConcreteBuilder extends Builder {

    @Override
    public void buildPartA() {
        product.setPartA("建造 PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造 PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造 PartC");
    }
}
