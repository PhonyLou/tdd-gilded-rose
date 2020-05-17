package cn.xpbootcamp.gildedrose;

import cn.xpbootcamp.gildedrose.model.Goods;

public class Rose {
    Goods oneDayPassed(final Goods goods) {
        final Goods updatedGoods = goods.updateSellInAndQuality();
        return updatedGoods.doQualityLimitation();
    }
}
