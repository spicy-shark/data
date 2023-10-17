package myShoppingCart;

import java.util.Objects;

public class Item {

  private String name;
  private Integer price;

  public Item(String name, Integer price) {
    this.name = name;
    this.price = price;
  }

  public Item() {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Item item = (Item) o;
    return name.equals(item.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  public boolean isSameItem(Item item) {
    return this.name.equals(item.name);
  }

}
