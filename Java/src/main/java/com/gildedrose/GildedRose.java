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

    item.quality = increaseQuality(item.quality);

    item.sellIn = item.sellIn - 1;

    if (item.sellIn < 0) {
      item.quality = increaseQuality(item.quality);
    }
  }

  public void updateBackstagePassesConcert(Item item) {

    item.quality = increaseQuality(item.quality);

    if (item.sellIn < 11) {
      item.quality = increaseQuality(item.quality);
    }

    if (item.sellIn < 6) {
      item.quality = increaseQuality(item.quality);
    }

    item.sellIn = item.sellIn - 1;

    if (item.sellIn < 0) {
      item.quality = item.quality - item.quality;
    }
  }

  public void updateCommonItem(Item item) {
    item.quality = decreaseQuality(item.quality);

    item.sellIn = item.sellIn - 1;

    if (item.sellIn < 0) {
      item.quality = decreaseQuality(item.quality);
    }
  }

  private int increaseQuality(int quality) {
    if (quality < 50) {
      quality = quality + 1;
    }
    return quality;
  }

  private int decreaseQuality(int quality) {

    if (quality > 0) {
      quality = quality - 1;
    }
    return quality;
  }
}
