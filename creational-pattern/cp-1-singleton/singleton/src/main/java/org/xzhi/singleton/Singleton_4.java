package org.xzhi.singleton;

/**
 * 4.登记式/使用类的静态内部类（线程安全）【推荐】
 * <p>
 * 既保证了线程安全又保证了懒加载，同时不会因为加锁的方式好性能。
 * 因为利用了 classloader 机制来保证初始化 instance 时只有一个线程
 * 此方式是推荐使用的一种单例模式。
 *
 * @author Xzhi
 * @date 2021-07-10 12:17
 */
public class Singleton_4 {
    private Singleton_4() {
    }

    private static class SingletonHolder {
        private static Singleton_4 instance = new Singleton_4();
    }

    public static Singleton_4 getInstance() {
        return SingletonHolder.instance;
    }
}
