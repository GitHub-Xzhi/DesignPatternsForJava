package org.xzhi.builder;

/**
 * 抽象建造者
 *
 * @author Xzhi
 * @date 2021-07-13 23:41
 */
public abstract class Builder {
    //创建产品对象
    protected Product product = new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    //返回产品对象
    public Product getResult() {
        return product;
    }
}
