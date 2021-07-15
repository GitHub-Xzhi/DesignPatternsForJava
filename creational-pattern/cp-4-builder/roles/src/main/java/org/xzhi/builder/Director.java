package org.xzhi.builder;

/**
 * 调用者
 *
 * @author Xzhi
 * @date 2021-07-13 23:43
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    //产品构建与组装方法
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
