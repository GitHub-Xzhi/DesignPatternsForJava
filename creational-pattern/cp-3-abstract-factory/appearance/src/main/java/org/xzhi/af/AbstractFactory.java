package org.xzhi.af;

/**
 * 抽象工厂
 *
 * @author Xzhi
 * @date 2021-07-12 17:21
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shapeType);
}
