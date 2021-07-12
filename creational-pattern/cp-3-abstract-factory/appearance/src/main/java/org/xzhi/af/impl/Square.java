package org.xzhi.af.impl;

import org.xzhi.af.Shape;

/**
 * 正方形
 *
 * @author Xzhi
 * @date 2021-07-12 17:12
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("[--- 正方形 ---]");
    }
}
