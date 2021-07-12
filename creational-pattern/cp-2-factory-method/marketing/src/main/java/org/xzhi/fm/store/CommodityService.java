package org.xzhi.fm.store;

import java.util.Map;

/**
 * 商品服务接口
 *
 * @author Xzhi
 * @date 2021-07-11 15:33
 */
public interface CommodityService {

    /**
     * 发送商品
     * @param uId 用户ID
     * @param commodityId 商品ID
     * @param bizId 业务ID
     * @param extMap 拓展字段
     * @throws Exception
     */
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
