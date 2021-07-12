package org.xzhi.af;

import java.util.concurrent.TimeUnit;

/**
 * 让所有集群的提供⽅，能在统⼀的⽅法名称下进⾏操作。也⽅⾯后续的拓展。
 *
 * @author Xzhi
 * @date 2021-07-12 14:56
 */
public interface ICacheAdapter {

    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);

}
