package org.xzhi.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Meal
 *
 * @author Xzhi
 * @date 2021-07-13 20:46
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public Meal addItem(Item item) {
        items.add(item);
        return this;
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
