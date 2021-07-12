package org.xzhi.fm;

/**
 * 形状工厂类
 *
 * @author Xzhi
 * @date 2021-07-12 22:28
 */
public class ShapeFactory {

    public static Shape createShape(ShapeTypeEnum shapeTypeEnum) {
        try {
            Class<? extends Shape> aClass = Class.forName(shapeTypeEnum.getName()).asSubclass(shapeTypeEnum.getClazz());
            return aClass.newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
