package Practise16.items;

public final class Dish implements Item{
    private String name;
    private String Description;
    private int price;
    private final int zero = 0;

    public Dish(int price, String name, String description) throws IllegalArgumentException{
        if(price < 0 || name.equals("") || description.equals(""))
            throw new IllegalArgumentException();
        this.price = price;
        this.name = name;
        this.Description = description;
    }
    public Dish(String name, String description) throws IllegalArgumentException{
        if(name.equals("") || description.equals("")) throw new IllegalArgumentException();
        this.price = zero;
        this.name = name;
        this.Description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return Description;
    }

    public int getPrice() {
        return price;
    }

}
