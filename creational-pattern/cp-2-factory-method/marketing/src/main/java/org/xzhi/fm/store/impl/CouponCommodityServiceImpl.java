package org.xzhi.fm.store.impl;

import com.alibaba.fastjson.JSON;

import org.xzhi.fm.coupon.CouponResult;
import org.xzhi.fm.coupon.CouponService;
import org.xzhi.fm.store.CommodityService;

import java.util.Map;

import lombok.extern.slf4j.Slf4j;

/**
 * 优惠券
 *
 * @author Xzhi
 * @date 2021-07-11 15:45
 */
@Slf4j
public class CouponCommodityServiceImpl implements CommodityService {
    private CouponService couponService = new CouponService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        CouponResult couponResult = couponService.sendCoupon(uId, commodityId, bizId);
        log.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        log.info("测试结果[优惠券]：{}", JSON.toJSON(couponResult));
        if (!"0000".equals(couponResult.getCode())) throw new RuntimeException(couponResult.getInfo());
    }
}
