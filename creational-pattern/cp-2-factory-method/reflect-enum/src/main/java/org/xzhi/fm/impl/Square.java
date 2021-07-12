package org.xzhi.fm.impl;


import org.xzhi.fm.Shape;

/**
 * 正方形
 *
 * @author Xzhi
 * @date 2021-07-12 17:12
 */
public class Square implements Shape {
    public static void main(String[] args) {
        System.out.println(Square.class.getName());
    }
    @Override
    public void draw() {
        System.out.println("[--- 正方形 ---]");
    }
}
