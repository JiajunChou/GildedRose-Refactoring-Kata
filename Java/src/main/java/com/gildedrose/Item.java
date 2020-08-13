package com.gildedrose;

public class Item {

  public String name;

  public int sellIn;

  public int quality;

  public Item(String name, int sellIn, int quality) {
    this.name = name;
    this.sellIn = sellIn;
    this.quality = quality;
  }

  public int getSellIn() {
    return sellIn;
  }

  public void setSellIn(int sellIn) {
    this.sellIn = sellIn;
  }

  public int getQuality() {
    return quality;
  }

  public void setQuality(int quality) {
    this.quality = quality;
  }

  @Override
  public String toString() {
    return this.name + ", " + this.sellIn + ", " + this.quality;
  }

  public void increaseQuality() {
    if (getQuality() < 50) {
      setQuality(getQuality() + 1);
    }
  }

  public void decreaseQuality() {

    if (getQuality() > 0) {
      setQuality(getQuality() - 1);
    }
  }
}
