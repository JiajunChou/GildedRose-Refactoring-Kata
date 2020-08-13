package com.gildedrose;

public class CommonItem extends Item {

  public CommonItem(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  @Override
  public void upgrade() {
    setSellIn(getSellIn() - 1);
    decreaseQuality();
    if (getSellIn() < 0) {
      decreaseQuality();
    }
  }
}
