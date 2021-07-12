package org.xzhi.af;

/**
 * AbstractFactoryTest
 *
 * @author Xzhi
 * @date 2021-07-12 17:28
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        // 获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        // 获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color red = colorFactory.getColor("RED");
        red.fill();
    }
}
