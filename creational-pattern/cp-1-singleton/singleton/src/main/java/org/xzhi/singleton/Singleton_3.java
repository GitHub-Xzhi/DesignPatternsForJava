package org.xzhi.singleton;

/**
 * 3.饿汉模式（线程安全）【可用】
 * <p>
 * 那么这种方式导致的问题就像你下载个游戏软件，可能你游戏地图还没有打开呢，但是程序已经将
 * 这些地图全部实例化。到你手机上最明显体验就一开游戏内存满了，手机卡了，需要换了。
 *
 * @author Xzhi
 * @date 2021-07-10 11:51
 */
public class Singleton_3 {
    private static Singleton_3 instance = new Singleton_3();

    private Singleton_3() {
    }

    public static Singleton_3 getInstance() {
        return instance;
    }
}
