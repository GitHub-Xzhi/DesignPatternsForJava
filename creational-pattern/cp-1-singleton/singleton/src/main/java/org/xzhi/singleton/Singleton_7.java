package org.xzhi.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 7.CAS [AtomicReference]（线程安全）【推荐】
 *
 * @author Xzhi
 * @date 2021-07-10 18:56
 */
public class Singleton_7 {
    private Singleton_7() {
    }

    private static final AtomicReference<Singleton_7> INSTANCE = new AtomicReference<>();

    public static Singleton_7 getInstance() {
        while (true) {
            Singleton_7 instance = INSTANCE.get();
            if (instance != null) {
                return instance;
            }
            INSTANCE.compareAndSet(null, new Singleton_7());
            return INSTANCE.get();
        }
    }
}
