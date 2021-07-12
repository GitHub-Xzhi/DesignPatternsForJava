package org.xzhi.fm;

import org.xzhi.fm.impl.Circle;
import org.xzhi.fm.impl.Rectangle;
import org.xzhi.fm.impl.Square;

import lombok.Getter;

/**
 * 形状枚举
 *
 * @author Xzhi
 * @date 2021-07-12 22:18
 */
@Getter
public enum ShapeTypeEnum {
    CIRCLE(Circle.class),
    RECTANGLE(Rectangle.class),
    SQUARE(Square.class);

    private Class<? extends Shape> clazz;

    ShapeTypeEnum(Class<? extends Shape> clazz) {
        this.clazz = clazz;
    }

    public String getSimpleName() {
        return this.getClazz().getSimpleName();
    }

    public String getName() {
        return this.getClazz().getName();
    }
}
