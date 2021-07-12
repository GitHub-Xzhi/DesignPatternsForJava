package org.xzhi.singleton;

/**
 * 2. 懒汉模式(线程安全) 【不推荐】
 * <p>
 * 此种模式虽然是安全的，但由于把锁加到方法上后，所有的访问都因需要锁占用导致资源的浪费。
 * 如果不是特殊情况下，不建议此种方式实现单例模式。
 *
 * @author Xzhi
 * @date 2021-07-10 11:35
 */
public class Singleton_2 {

    private static Singleton_2 instance;

    private Singleton_2() {
    }

    public static synchronized Singleton_2 getInstance() {
        if (instance == null) {
            return new Singleton_2();
        }
        return instance;
    }
}
