package cn.xpbootcamp.gildedrose.model;

public class Sulfuras extends Goods{

    @Override
    public Goods updateSellInAndQuality() {
        return this;
    }

    public Sulfuras(int sellIn, int quality) {
        super(sellIn, quality);
    }
}
