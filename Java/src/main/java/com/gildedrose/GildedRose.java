package com.gildedrose;

class GildedRose {
  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateQuality() {

    for (Item item : items) {

      if (item.name.equals("Sulfuras, Hand of Ragnaros")) {

        return;
      } else if (item.name.equals("Aged Brie")) {

        updateAgedBrie(item);

      } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {

        updateBackstagePassesConcert(item);
      } else {

        updateCommonItem(item);
      }
    }
  }

  public void updateAgedBrie(Item item) {

    item.increaseQuality();

    item.sellIn = item.sellIn - 1;

    if (item.sellIn < 0) {
      item.increaseQuality();
    }
  }

  public void updateBackstagePassesConcert(Item item) {

    item.increaseQuality();

    if (item.sellIn < 11) {
      item.increaseQuality();
    }

    if (item.sellIn < 6) {
      item.increaseQuality();
    }

    item.sellIn = item.sellIn - 1;

    if (item.sellIn < 0) {
      item.quality = item.quality - item.quality;
    }
  }

  public void updateCommonItem(Item item) {
    item.decreaseQuality();

    item.sellIn = item.sellIn - 1;

    if (item.sellIn < 0) {
      item.decreaseQuality();
    }
  }
}
