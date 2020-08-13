package com.gildedrose;

public class BackstagePassesItem extends Item {

  public BackstagePassesItem(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  @Override
  public void upgrade() {
    setSellIn(getSellIn() - 1);
    increaseQuality();
    if (getSellIn() < 10)
      increaseQuality();
    if (getSellIn() < 5)
      increaseQuality();
    if (getSellIn() < 0)
      setQuality(0);
  }
}
