package org.xzhi.af;

import org.xzhi.af.impl.ColorFactory;
import org.xzhi.af.impl.ShapeFactory;

/**
 * 工厂生成器
 *
 * @author Xzhi
 * @date 2021-07-12 17:27
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
