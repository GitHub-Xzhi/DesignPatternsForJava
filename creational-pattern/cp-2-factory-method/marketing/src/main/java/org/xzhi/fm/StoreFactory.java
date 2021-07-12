package org.xzhi.fm;

import org.xzhi.fm.store.CommodityService;
import org.xzhi.fm.store.impl.CardCommodityServiceImpl;
import org.xzhi.fm.store.impl.CouponCommodityServiceImpl;
import org.xzhi.fm.store.impl.GoodsCommodityServiceImpl;

/**
 * 商店工厂
 *
 * @author Xzhi
 * @date 2021-07-11 15:29
 */
public class StoreFactory {

    public CommodityService getCommodityService(Integer commodityType) {
        /*
        其实是简单工厂
         */
        if (commodityType == null) {
            return null;
        }
        switch (commodityType) {
            case 1:
                return new CouponCommodityServiceImpl();
            case 2:
                return new GoodsCommodityServiceImpl();
            case 3:
                return new CardCommodityServiceImpl();
            default:
                throw new RuntimeException("不存在的商品服务类型");
        }
    }
}
