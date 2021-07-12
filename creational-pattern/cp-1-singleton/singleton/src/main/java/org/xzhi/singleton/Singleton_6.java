package org.xzhi.singleton;

/**
 * 6.枚举单例（线程安全）【推荐】
 * <p>
 * 这是实现单例模式的最佳方法，同时也是 Effective Java 作者 Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，而且还自动支持序列化机制，
 * 防止反序列化重新创建新的对象，绝对防止多次实例化。
 * 但是此方式在继承场景下是不可用的。
 *
 * @author Xzhi
 * @date 2021-07-10 18:47
 */
public enum Singleton_6 {
    INSTANCE;

    public void test() {
        System.out.println("[--- 测试枚举单例 ---]");
    }
}
