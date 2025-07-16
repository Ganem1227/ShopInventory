package shop.application.models.items;

import shop.application.models.actors.Actor;

public class Item extends Actor {
    /**
     * Item must have an item name, price
     */
    public Item(String name) {
        super(name);
    }
}
