package org.xzhi.af;

import org.xzhi.af.impl.CacheServiceImpl;
import org.xzhi.af.impl.EGMCacheAdapter;
import org.xzhi.af.impl.IIRCacheAdapter;

import lombok.SneakyThrows;

/**
 * CacheServiceTest
 *
 * @author Xzhi
 * @date 2021-07-12 15:06
 */
public class CacheServiceTest {
    @SneakyThrows
    public static void main(String[] args) {
        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01", "小傅哥");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println("测试结果：" + val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01", "小傅哥");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println("测试结果：" + val02);
    }
}
