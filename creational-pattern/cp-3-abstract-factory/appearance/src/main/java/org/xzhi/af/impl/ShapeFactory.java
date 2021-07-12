package org.xzhi.af.impl;

import org.xzhi.af.AbstractFactory;
import org.xzhi.af.Color;
import org.xzhi.af.Shape;

/**
 * ShapeFactory
 *
 * @author Xzhi
 * @date 2021-07-12 17:23
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
