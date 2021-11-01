package ru.mirea.task5.opt3;

public class FurnitureShop {
    // Fields:
    protected String name = "shop";
    protected Furniture[] catalog = new Furniture[10];
    protected double money = 0;
    // Constructors:
    public FurnitureShop(String name, double money) {
        this.name = name;
        this.money = money;
    }
    // Methods:
    public void addProduct(Furniture prod) {
        prod.setAvailable(true);
        catalog[prod.getId()] = prod;
    }
    public void sellProduct(int sellableId) {
        System.out.println("\r\n" + "Somebody want to buy: " + catalog[sellableId].getId() + "(" + catalog[sellableId].getType() + ")");
        if (catalog[sellableId].isAvailable()) {
            money += catalog[sellableId].getPrice();
            catalog[sellableId].setAvailable(false);
            System.out.println(catalog[sellableId].getId() + " SOLD! " + "+" + catalog[sellableId].getPrice());
        } else {
            System.out.println(catalog[sellableId].getId() + " is not available");
        }
    }
    public String getName() { return name; }
    public double getMoney() { return money; }
    public String toString() {
        return ""
                + "FurnitureShop {\r\n"
                + " Name => " + getName() + ",\r\n"
                + " Money => " + getMoney() + "\r\n"
                + "}";
    }
}
