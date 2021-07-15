package org.xzhi.builder;

/**
 * 食物条目
 *
 * @author Xzhi
 * @date 2021-07-13 17:44
 */
public interface Item {
    String name();
    Packing packing();
    float price();
}
