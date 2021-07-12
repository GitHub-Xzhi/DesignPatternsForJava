package org.xzhi.singleton;

/**
 * 1. 懒汉模式(线程不安全) 【不推荐】
 *
 * @author Xzhi
 * @date 2021-07-10 11:29
 */
public class Singleton_1 {
    private static Singleton_1 instance;

    private Singleton_1() {
    }

    public static Singleton_1 getInstance() {
        if (instance != null) {
            return instance;
        }
        return new Singleton_1();
    }
}
