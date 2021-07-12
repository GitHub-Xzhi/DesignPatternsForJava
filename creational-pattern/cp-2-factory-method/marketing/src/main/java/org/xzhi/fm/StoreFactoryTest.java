package org.xzhi.fm;

import org.xzhi.fm.store.CommodityService;

import java.util.HashMap;
import java.util.Map;

import lombok.SneakyThrows;

/**
 * StoreFactoryTest
 *
 * @author Xzhi
 * @date 2021-07-11 23:39
 */
public class StoreFactoryTest {
    @SneakyThrows
    public static void main(String[] args) {
        StoreFactory storeFactory = new StoreFactory();
        // 1. 优惠券
        CommodityService commodityService1 = storeFactory.getCommodityService(1);
        commodityService1.sendCommodity("10001", "EGM1023938910232121323432", "791098764902132", null);
        // 2. 实物商品
        CommodityService commodityService_2 = storeFactory.getCommodityService(2);
        Map<String, String> extMap = new HashMap<>();
        extMap.put("consigneeUserName", "谢飞机");
        extMap.put("consigneeUserPhone", "15200292123");
        extMap.put("consigneeUserAddress", "吉林省.长春市.双阳区.XX街道.檀溪苑小区.#18-2109");

        commodityService_2.sendCommodity("10001", "9820198721311", "1023000020112221113", extMap);

        // 3. 第三方兑换卡(爱奇艺)
        CommodityService commodityService_3 = storeFactory.getCommodityService(3);
        commodityService_3.sendCommodity("10001", "AQY1xjkUodl8LO975GdfrYUio", null, null);
    }
}
