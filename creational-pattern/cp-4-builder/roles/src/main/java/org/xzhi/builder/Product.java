package org.xzhi.builder;

import lombok.Setter;
import lombok.ToString;

/**
 * Product
 *
 * @author Xzhi
 * @date 2021-07-13 23:40
 */
@Setter
@ToString
public class Product {
    private String partA;
    private String partB;
    private String partC;

    public void show() {
        //显示产品的特性
        System.out.println(" ----- " + toString());
    }
}
