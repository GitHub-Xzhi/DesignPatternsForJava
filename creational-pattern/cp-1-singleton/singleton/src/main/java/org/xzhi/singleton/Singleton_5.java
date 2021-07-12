package org.xzhi.singleton;

/**
 * 5. 双重锁校验(线程安全)【推荐】
 *
 * @author Xzhi
 * @date 2021-07-10 18:25
 */
public class Singleton_5 {
    private Singleton_5() {
    }

    private static volatile Singleton_5 instance;

    public static Singleton_5 getInstance() {
        if (instance == null) {
            synchronized (Singleton_5.class) {
                if (instance == null) {
                    instance = new Singleton_5();
                }
            }
        }
        return instance;
    }
}
