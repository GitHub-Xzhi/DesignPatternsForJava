package org.xzhi.af.impl;

import org.xzhi.af.AbstractFactory;
import org.xzhi.af.Color;
import org.xzhi.af.Shape;

/**
 * ColorFactory
 *
 * @author Xzhi
 * @date 2021-07-12 17:25
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
