package Practise16;

import Practise16.items.Dish;
import Practise16.items.Drink;
import Practise16.InternetOrder;
import Practise16.OrderManager;
import Practise16.RestaurantOrder;

public class Test {
    public static void main(String[] args) {
        OrderManager k = new OrderManager();
        Dish[] d1 = new Dish[] {new Dish("Солянка", "Большая"),
                new Dish(10,"Хлеб", "Черный"),
                new Dish(60,"Пюре", "Картофельное"),
                new Dish(120,"Котлета", "Из печени"),
        };
        RestaurantOrder od1 = new RestaurantOrder(d1);
        k.add(od1,1); // добавление ресторанного заказа в заказы
        k.add("1 стол",od1);
        String[] result = k.getOrders(1).dishesNames();
        for (String it: result) // вывод позиций заказа
            if (it != null)
                System.out.println(it);
        System.out.println(k.ordersCostSummary());
        System.out.println("HashMap-------------------");
        String[] result2 = k.getOrders("1 стол").dishesNames(); // вывод заказа используя hashmap
        for (String it: result2)
            if (it != null)
                System.out.println(it);
        System.out.println(k.hashCostSummary());
        System.out.println("Drink-------------------");
        Drink[] d2 = new Drink[] {new Drink("Компот", "Яблочный"),
                new Drink(100,"Кола", "Газированная"),
                new Drink(20,"Морс", "Сладкийц"),
                new Drink(20,"Томатный сок", "Соленый"),
        };
        InternetOrder od2 = new InternetOrder(d2); // циклический двусвязный список
        String[] result3 = od2.dishesNames();   //
        for (String it: result3)
            if (it != null)
                System.out.println(it);
        System.out.println(od2.costTotal());
    }
}