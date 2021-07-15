package org.xzhi.builder;

import org.xzhi.builder.impl.ConcreteBuilder;

/**
 * 客户类
 *
 * @author Xzhi
 * @date 2021-07-14 00:08
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}