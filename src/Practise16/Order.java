package Practise16;


import Practise16.items.Item;

public interface Order {
    boolean add(Item item);
    boolean remove(String itemName);
    int itemQuantity();
    double costTotal();
    Item[] getItems();
    int itemQuantity(String itemName);
    String[] dishesNames();
    Item[] sortedDishesByCostDesc();
}

/*public class Order {
    Dish dish;
    Drink drink;

    public Order(Dish dish, Drink drink) {
        this.dish = dish;
        this.drink = drink;
    }

    public Dish getDish() {
        return dish;
    }

    public Drink getDrink() {
        return drink;
    }

    @Override
    public String toString() {
        return "Order{" +
                "dish=" + dish +
                ", drink=" + drink +
                '}';
    }
} */
