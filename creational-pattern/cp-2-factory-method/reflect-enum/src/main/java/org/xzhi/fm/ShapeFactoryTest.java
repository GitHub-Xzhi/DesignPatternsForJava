package org.xzhi.fm;

/**
 * ShapeFactoryTest
 *
 * @author Xzhi
 * @date 2021-07-13 00:05
 */
public class ShapeFactoryTest {
    public static void main(String[] args) {
        ShapeFactory.createShape(ShapeTypeEnum.CIRCLE).draw();
        ShapeFactory.createShape(ShapeTypeEnum.RECTANGLE).draw();
        ShapeFactory.createShape(ShapeTypeEnum.SQUARE).draw();
    }
}
